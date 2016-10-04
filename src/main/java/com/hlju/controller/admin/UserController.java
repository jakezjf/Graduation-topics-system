package com.hlju.controller.admin;

import com.hlju.model.User;
import com.hlju.response.ObjectPageResp;
import com.hlju.response.UserResp;
import com.hlju.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by JF on 2016/9/20.
 */
@Controller
@RequestMapping("userAdmin")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 判断用户密码符合
     * @param userId
     * @param userPassword
     * @return
     */
    @RequestMapping("truePassword.jhtml")
    @ResponseBody
    public boolean truePassword(String userId,String userPassword){
        System.out.println("userId = " + userId + "password" + userPassword +"  " + userService.getUserPassword(userId,userPassword));
        return userService.getUserPassword(userId,userPassword);
    }

    /**
     * 插入user
     * @param user
     * @return
     */
    @RequestMapping("insertUser.jhtml")
    @ResponseBody
    public boolean insertUser(User user){
        if(user==null){
            return false;
        }
        return userService.insertUser(user);
    }

    /**
     * 判断userId是否存在
     * @param userId
     * @return
     */
    @RequestMapping(value = "trueUserId.jhtml",method = RequestMethod.POST,produces="application/json")
    @ResponseBody
    public boolean trueUserId(String userId){
        String userIdTemp = userService.trueUserId(userId);
        if (userIdTemp==null || userIdTemp.equals("") == true){
            return false;
        }else{
            return userId.equals(userIdTemp);
        }
    }

    /**
     * 插入多个用户信息
     * @param users
     * @return
     */
    @RequestMapping(value = "insertUserList.jhtml",method = RequestMethod.POST,produces="application/json")
    public boolean insertUserList(List<User> users){
        if(users == null){
            return false;
        }
        return userService.insertUserList(users);
    }

    /**
     * 删除多个userId的信息
     * @param userIds
     * @return
     */
    @RequestMapping(value = "deleteUserListById.jhtml",method = RequestMethod.POST,produces="application/json")
    public boolean deleteUserListById(List<String> userIds){
        if (userIds == null){
            return false;
        }
        return userService.deleteUserListById(userIds);
    }

    /**
     * 查找user信息
     * @param user
     * @return
     */
    @RequestMapping(value = "getUser.jhtml",method = RequestMethod.POST,produces="application/json")
    public UserResp getUser(User user){
        return userService.getUser(user);
    }

    /**
     * 查找user信息，包括密码
     * @param user
     * @return
     */
    @RequestMapping(value = "getUserAll.do",method = RequestMethod.POST,produces="application/json")
    public UserResp getUserAll(User user){
        return userService.getUserAll(user);
    }

    @RequestMapping(value = "getUserRespList1.jhtml",method = RequestMethod.POST,produces="application/json")
    @ResponseBody
    public ObjectPageResp getUserRespList(User user,ObjectPageResp page){
        return userService.getUserRespList(user,page);
    }

    @RequestMapping(value = "getUserRespList.jhtml",method = RequestMethod.GET,produces="application/json")
    @ResponseBody
    public ObjectPageResp getUserRespListGet(User user,ObjectPageResp page){
        page.setTotal(userService.getCount(user));
        return userService.getUserRespList(user,page);
    }

    @RequestMapping(value = "updateUser.jhtml")
    @ResponseBody
    public boolean updateUser(User user){
        return userService.updateUser(user);
    }
}
