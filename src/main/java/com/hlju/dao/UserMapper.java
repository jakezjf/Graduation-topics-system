package com.hlju.dao;

import com.hlju.model.User;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int deleteByPrimaryKey(String userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    String getUserPassword(@Param("userId")String userId);

    void insertUser(User user);

    String trueUserId(@Param("userId")String userId);
}