package com.hlju.dao;

import com.hlju.model.Grade;
import com.hlju.response.GradeResp;

import java.util.List;


public interface GradeMapper {

    int deleteByPrimaryKey(Integer gradeId);

    int insertSelective(Grade grade);

    Grade selectByPrimaryKey(Integer gradeId);

    int updateByPrimaryKey(Grade grade);

    int getCount(Grade grade);

    List<GradeResp> getGradeRespList(Grade grade);
}