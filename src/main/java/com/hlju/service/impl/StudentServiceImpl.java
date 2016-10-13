package com.hlju.service.impl;

import com.github.pagehelper.PageHelper;
import com.hlju.common.CharToUnderLine;
import com.hlju.dao.StudentMapper;
import com.hlju.model.Student;
import com.hlju.response.ObjectPageResp;
import com.hlju.response.StudentResp;
import com.hlju.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by JF on 2016/9/27.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public boolean deleteStudentById(String stuId) {
        if (stuId == null || stuId.equals("")){
            return false;
        }
        try{
            studentMapper.deleteByPrimaryKey(stuId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean insertStudent(Student student) {
        if (!isNull(student)){
            try{
                studentMapper.insertSelective(student);
                return true;
            }catch (Exception e){
                return false;
            }
        }
        return false;
    }

    public boolean updateStudent(Student student) {
        if (!isNull(student)){
            try {
                studentMapper.updateByPrimaryKeySelective(student);
            }catch (Exception e){
                return false;
            }
        }
        return false;
    }

    public StudentResp getStudentResp(Student student) {
        if (!isNull(student)){
            return studentMapper.getStudentResp(student);
        }
        return null;
    }

    public ObjectPageResp getStudentRespList(Student student ,ObjectPageResp page) {
       if (page!= null && page.getOffset() >= 0 && page.getLimit()>=0) {
            PageHelper.startPage(page.getOffset()>=10 ? (page.getOffset()/page.getLimit())+1 : 1,page.getLimit(),false);
            if (page.getSort()!=null && !page.getSort().equals("")){
                PageHelper.orderBy(CharToUnderLine.upperCharToUnderLine(page.getSort()) +" " +page.getOrder());
            }
            page.setRows(studentMapper.getStudentRespList(student));
            return page;
        }
        return null;
    }

    public int getCount(Student student) {
        return studentMapper.getCount(student);
    }

    public boolean isNull(Student student){
        if (student == null || student.getStuId() == null || student.getStuId().equals("")){
            return true;
        }
        return false;
    }
}
