package com.hlju.service.impl;

import com.hlju.dao.StudentMapper;
import com.hlju.model.Student;
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

    public List<StudentResp> getStudentRespList(Student student) {
        return studentMapper.getStudentRespList(student);
    }

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

    public boolean isNull(Student student){
        if (student == null || student.getStuId() == null || student.getStuId().equals("")){
            return true;
        }
        return false;
    }
}
