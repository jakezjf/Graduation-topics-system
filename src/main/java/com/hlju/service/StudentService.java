package com.hlju.service;

import com.hlju.model.Student;
import com.hlju.response.ObjectPageResp;
import com.hlju.response.StudentResp;

import java.util.List;

/**
 * Created by JF on 2016/9/27.
 */
public interface StudentService {

    boolean deleteStudentById(String stuId);

    boolean insertStudent(Student student);

    boolean updateStudent(Student student);

    StudentResp getStudentResp(Student student);

    ObjectPageResp getStudentRespList(Student student ,ObjectPageResp page);

    int getCount(Student student);

}
