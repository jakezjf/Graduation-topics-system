package com.hlju.dao;

import com.hlju.model.Student;

import java.util.List;

import com.hlju.response.StudentResp;

public interface StudentMapper {

    int deleteByPrimaryKey(String stuId);

    Student selectByPrimaryKey(String stuId);

    int updateByPrimaryKeySelective(Student student);

    List<StudentResp> getStudentRespList(Student student);

    int insertSelective(Student student);

    StudentResp getStudentResp(Student student);

    int getCount(Student student);

}