package com.hlju.dao;

import com.hlju.model.Teacher;

import java.util.List;

import com.hlju.response.TeacherResp;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

    Teacher selectByPrimaryKey(String teaId);

    int updateByPrimaryKey(Teacher record);

    int insertSelective(Teacher teacher);

    int deleteByPrimaryKey(String teaId);

    int updateByPrimaryKeySelective(Teacher teacher);

    List<TeacherResp> getTeacherRespList(Teacher teacher);

    TeacherResp getTeacherResp(Teacher teacher);

    int getCount(Teacher teacher);
}