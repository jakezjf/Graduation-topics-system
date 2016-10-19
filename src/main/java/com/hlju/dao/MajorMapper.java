package com.hlju.dao;

import com.hlju.model.Major;

import java.util.List;

import com.hlju.response.MajorResp;
import org.apache.ibatis.annotations.Param;

public interface MajorMapper {

    int deleteByPrimaryKey(Integer majorId);

    int insertSelective(Major major);

    Major selectByPrimaryKey(Integer majorId);

    int updateByPrimaryKeySelective(Major major);

    List<MajorResp> getMajorRespList(Major major);

    int getCount(Major major);

}