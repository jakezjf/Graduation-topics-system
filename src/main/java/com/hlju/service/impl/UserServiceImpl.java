package com.hlju.service.impl;

import com.hlju.dao.UserMapper;
import com.hlju.model.User;
import com.hlju.response.UserResp;
import com.hlju.service.UserService;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
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

    public List<UserResp> getUserRespList(User user) {
        if (user == null){
            return null;
        }
        return userMapper.getUserRespList(user);
    }
}
