package com.hlju.response;

/**
 * Created by JF on 2016/9/27.
 */
public class TeacherResp {

    private String teaId;

    private String teaName;

    private Integer teaSex;

    private Integer paperNow;

    private Integer paperLimit;

    private Integer gradeId;

    private Integer collegeId;

    private Integer majorId;

    private Integer classId;

    public TeacherResp(){}

    public TeacherResp(String teaId, String teaName, Integer teaSex, Integer paperNow, Integer paperLimit, Integer gradeId, Integer collegeId, Integer majorId, Integer classId) {
        this.teaId = teaId;
        this.teaName = teaName;
        this.teaSex = teaSex;
        this.paperNow = paperNow;
        this.paperLimit = paperLimit;
        this.gradeId = gradeId;
        this.collegeId = collegeId;
        this.majorId = majorId;
        this.classId = classId;
    }

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public Integer getTeaSex() {
        return teaSex;
    }

    public void setTeaSex(Integer teaSex) {
        this.teaSex = teaSex;
    }

    public Integer getPaperNow() {
        return paperNow;
    }

    public void setPaperNow(Integer paperNow) {
        this.paperNow = paperNow;
    }

    public Integer getPaperLimit() {
        return paperLimit;
    }

    public void setPaperLimit(Integer paperLimit) {
        this.paperLimit = paperLimit;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}
