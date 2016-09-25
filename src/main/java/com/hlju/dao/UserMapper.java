package com.hlju.dao;

import com.hlju.model.User;

import com.hlju.response.UserResp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    String getUserPassword(@Param("userId")String userId);

    void insertUser(User user);

    String trueUserId(@Param("userId")String userId);

    void deleteUserAll(User user);

    void insertUserList(List<User> users);

    void deleteUserListById(List<String> userIds);

    UserResp getUser(User user);

    UserResp getUserAll(User user);

}