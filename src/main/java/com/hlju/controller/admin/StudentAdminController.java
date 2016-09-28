package com.hlju.controller.admin;

import com.hlju.model.Student;
import com.hlju.response.StudentResp;
import com.hlju.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by JF on 2016/9/27.
 */
@Controller
@RequestMapping("studentAdmin")
public class StudentAdminController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "getStudentRespList.jhtml")
    @ResponseBody
    public List<StudentResp> getStudentRespList(Student student){
        return studentService.getStudentRespList(student);
    }

    @RequestMapping(value = "deleteStudentById.jhtml")
    @ResponseBody
    public boolean deleteStudentById(String stuId){
        return studentService.deleteStudentById(stuId);
    }

    @RequestMapping(value = "insertStudent.jhtml")
    @ResponseBody
    public boolean insertStudent(Student student){
        return studentService.insertStudent(student);
    }

    @RequestMapping(value = "updateStudent.jhtml")
    @ResponseBody
    public boolean updateStudent(Student student){
        return studentService.updateStudent(student);
    }

    @RequestMapping(value = "getStudentResp.jhtml")
    @ResponseBody
    public StudentResp getStudentResp(Student student){
        return studentService.getStudentResp(student);
    }

}
