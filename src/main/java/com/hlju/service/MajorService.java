package com.hlju.service;

import com.hlju.model.Major;
import com.hlju.response.ObjectPageResp;

/**
 * Created by JF on 2016/9/27.
 */
public interface MajorService {

    boolean updateByPrimaryKeySelective(Major major);

    boolean deleteByPrimaryKey(Integer majorId);

    boolean insertSelective(Major major);

    int getCount(Major major);

    ObjectPageResp getMajorRespList(Major major ,ObjectPageResp page);


}
