package com.hlju.service.impl;

import com.github.pagehelper.PageHelper;
import com.hlju.common.CharToUnderLine;
import com.hlju.dao.TeacherMapper;
import com.hlju.model.Teacher;
import com.hlju.response.ObjectPageResp;
import com.hlju.response.TeacherResp;
import com.hlju.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JF on 2016/9/27.
 */
@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    private TeacherMapper teacherMapper;


    public TeacherResp getTeacherResp(Teacher teacher) {
        if(teacher==null){
            return null;
        }
        return teacherMapper.getTeacherResp(teacher);
    }

    public boolean insertTeacher(Teacher teacher) {
        if(teacher==null){
            return false;
        }
        try {
            teacherMapper.insertSelective(teacher);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean updateTeacher(Teacher teacher) {
        if(teacher==null){
            return false;
        }
        try {
            teacherMapper.updateByPrimaryKeySelective(teacher);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean deleteTeacherByTeaId(String teaId) {
        if(teaId==null || teaId.equals("")){
            return false;
        }
        try {
            teacherMapper.deleteByPrimaryKey(teaId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public int getCount(Teacher teacher) {
        return teacherMapper.getCount(teacher);
    }

    public ObjectPageResp getTeacherRespList(Teacher teacher ,ObjectPageResp page) {
        if (page!= null && page.getOffset() >= 0 && page.getLimit()>=0) {
            PageHelper.startPage(page.getOffset()>=10 ? (page.getOffset()/page.getLimit())+1 : 1,page.getLimit(),false);
            if (page.getSort()!=null && !page.getSort().equals("")){
                PageHelper.orderBy(CharToUnderLine.upperCharToUnderLine(page.getSort()) +" " +page.getOrder());
            }
            page.setRows(teacherMapper.getTeacherRespList(teacher));
            return page;
        }
        return null;
    }

}
