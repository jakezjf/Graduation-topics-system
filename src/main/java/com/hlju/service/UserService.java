package com.hlju.service;

import com.hlju.model.User;
import com.hlju.response.UserResp;

import java.util.List;

/**
 * Created by JF on 2016/9/20.
 */
public interface UserService {

    boolean getUserPassword(String userId,String userPassword);

    boolean insertUser(User user);

    String trueUserId(String userId);

    boolean insertUserList(List<User> users);

    boolean deleteUserListById(List<String> userIds);

    UserResp getUser(User user);

    User selectByPrimaryKey(String userId);

    UserResp getUserAll(User user);

}
