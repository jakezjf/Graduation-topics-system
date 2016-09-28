package com.hlju.service;

import com.hlju.model.Student;
import com.hlju.response.StudentResp;

import java.util.List;

/**
 * Created by JF on 2016/9/27.
 */
public interface StudentService {

    List<StudentResp> getStudentRespList(Student student);

    boolean deleteStudentById(String stuId);

    boolean insertStudent(Student student);

    boolean updateStudent(Student student);

    StudentResp getStudentResp(Student student);

}
