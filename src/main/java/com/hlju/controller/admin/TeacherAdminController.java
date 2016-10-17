package com.hlju.controller.admin;

import com.hlju.model.Teacher;
import com.hlju.response.ObjectPageResp;
import com.hlju.response.TeacherResp;
import com.hlju.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by JF on 2016/9/27.
 */
@Controller
@RequestMapping("teacherAdmin")
public class TeacherAdminController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "getTeacherResp.jhtml")
    @ResponseBody
    public TeacherResp getTeacherResp(Teacher teacher){
        return teacherService.getTeacherResp(teacher);
    }

    @RequestMapping(value = "insertTeacher.jhtml")
    @ResponseBody
    public boolean insertTeacher(Teacher teacher){
        return teacherService.insertTeacher(teacher);
    }

    @RequestMapping(value = "getTeacherRespList.jhtml")
    @ResponseBody
    public ObjectPageResp getTeacherRespList(Teacher teacher ,ObjectPageResp page){
        return teacherService.getTeacherRespList(teacher,page);
    }

    @RequestMapping(value = "updateTeacher.jhtml")
    @ResponseBody
    public boolean updateTeacher(Teacher teacher){
        return teacherService.updateTeacher(teacher);
    }

    @RequestMapping(value = "deleteTeacherByTeaId.jhtml")
    @ResponseBody
    public boolean deleteTeacherByTeaId(String teaId){
        return teacherService.deleteTeacherByTeaId(teaId);
    }

}
