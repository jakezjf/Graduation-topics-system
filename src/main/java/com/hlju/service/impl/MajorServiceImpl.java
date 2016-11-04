package com.hlju.service.impl;

import com.github.pagehelper.PageHelper;
import com.hlju.common.CharToUnderLine;
import com.hlju.dao.MajorMapper;
import com.hlju.model.Major;
import com.hlju.response.ObjectPageResp;
import com.hlju.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JF on 2016/10/13.
 */
@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorMapper majorMapper;

    public boolean updateByPrimaryKeySelective(Major major) {
        if (major == null){
            return false;
        }
        majorMapper.updateByPrimaryKeySelective(major);
        return true;
    }

    public boolean deleteByPrimaryKey(Integer majorId) {
        if (majorId == null || majorId.equals("")){
            return false;
        }
        majorMapper.deleteByPrimaryKey(majorId);
        return true;
    }

    public boolean insertSelective(Major major) {
        if (major == null){
            return false;
        }
        majorMapper.insertSelective(major);
        return true;
    }

    public int getCount(Major major) {
        return majorMapper.getCount(major);
    }

    public ObjectPageResp getMajorRespList(Major major, ObjectPageResp page) {
        if (major == null){
            return null;
        }
        if (page!= null && page.getOffset() >= 0 && page.getLimit()>=0) {
            PageHelper.startPage(page.getOffset() >= 10 ? (page.getOffset() / page.getLimit()) + 1 : 1, page.getLimit(), false);
            if (page.getSort() != null && !page.getSort().equals("")) {
                PageHelper.orderBy(CharToUnderLine.upperCharToUnderLine(page.getSort()) + " " + page.getOrder());
            }
            page.setRows(majorMapper.getMajorRespList(major));
            return page;
        }
        return null;
    }
}
