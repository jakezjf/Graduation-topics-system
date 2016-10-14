package com.hlju.service;

import com.hlju.model.Teacher;
import com.hlju.response.ObjectPageResp;
import com.hlju.response.TeacherResp;

import java.util.List;

/**
 * Created by JF on 2016/9/27.
 */
public interface TeacherService {

    TeacherResp getTeacherResp(Teacher teacher);

    boolean insertTeacher(Teacher teacher);

    boolean updateTeacher(Teacher teacher);

    boolean deleteTeacherByTeaId(String teaId);

    int getCount(Teacher teacher);

    ObjectPageResp getTeacherRespList(Teacher teacher ,ObjectPageResp page);

}
