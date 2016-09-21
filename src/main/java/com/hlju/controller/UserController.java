package com.hlju.controller;

import com.hlju.model.User;
import com.hlju.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JF on 2016/9/20.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("truePassword.jhtml")
    public boolean truePassword(String userId,String userPassword){
        return userService.getUserPassword(userId,userPassword);
    }

    /**
     * 插入user
     * @param user
     * @return
     */
    @RequestMapping("insertUser.jhtml")
    public boolean insertUser(User user){
        if(user==null){
            return false;
        }
        return userService.insertUser(user);
    }

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


}
