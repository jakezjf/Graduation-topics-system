package com.hlju.service;

import com.hlju.model.User;

/**
 * Created by JF on 2016/9/20.
 */
public interface UserService {

    boolean getUserPassword(String userId,String userPassword);

    boolean insertUser(User user);

    String trueUserId(String userId);
}
