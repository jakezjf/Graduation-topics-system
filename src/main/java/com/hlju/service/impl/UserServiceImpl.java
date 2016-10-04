package com.hlju.service.impl;

import com.github.pagehelper.PageHelper;
import com.hlju.common.CharToUnderLine;
import com.hlju.dao.UserMapper;
import com.hlju.model.User;
import com.hlju.response.ObjectPageResp;
import com.hlju.response.UserResp;
import com.hlju.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JF on 2016/9/20.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public boolean getUserPassword(String userId, String userPassword) {
        if(userId == null || userId.equals("") == true ||
                userPassword == null || userPassword.equals("") == true){
            return false;
        }else{
            return userPassword.equals(userMapper.getUserPassword(userId));
        }
    }

    public boolean insertUser(User user) {
        try {
            userMapper.insertUser(user);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public String trueUserId(String userId) {
        try {
            return userMapper.trueUserId(userId);
        }catch (Exception e){
            return null;
        }
    }

    public boolean insertUserList(List<User> users) {
        try {
            userMapper.insertUserList(users);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean deleteUserListById(List<String> userIds) {
        try {
            userMapper.deleteUserListById(userIds);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public UserResp getUser(User user) {
        if (user == null){
            return null;
        }
        return userMapper.getUser(user);
    }

    public User selectByPrimaryKey(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public UserResp getUserAll(User user) {
        return userMapper.getUserAll(user);
    }

    public ObjectPageResp getUserRespList(User user ,ObjectPageResp page) {
        if (user == null){
            return null;
        }
        if (page!= null && page.getOffset() >= 0 && page.getLimit()>=0){
            PageHelper.startPage(page.getOffset()>=10 ? (page.getOffset()/page.getLimit())+1 : 1,page.getLimit(),false);
            if (page.getSort()!=null && !page.getSort().equals("")){
                PageHelper.orderBy(CharToUnderLine.upperCharToUnderLine(page.getSort()) +" " +page.getOrder());
            }
            page.setRows(userMapper.getUserRespList(user));
            return page;
        }
        return null;
    }

    public int getCount(User user) {
        return userMapper.getCount(user);
    }

    public ObjectPageResp getUserRespListSearch(User user, ObjectPageResp page) {
        if (user == null){
            return null;
        }
        return null;
    }

    public boolean updateUser(User user) {
        if(user!=null){
            return false;
        }
        userMapper.updateByPrimaryKeySelective(user);
        return true;
    }
}
