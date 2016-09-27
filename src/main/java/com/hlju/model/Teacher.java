package com.hlju.model;

public class Teacher {
    private String teaId;

    private String teaName;

    private Integer teaSex;

    private Integer paperNow;

    private Integer paperLimit;

    private Integer gradeId;

    private Integer collegeId;

    private Integer majorId;

    private Integer classId;

    private String back1;

    private String back2;

    private String back3;

    public Teacher(){}

    public Teacher(String teaId, String teaName, Integer teaSex, Integer paperNow, Integer paperLimit, Integer gradeId, Integer collegeId, Integer majorId, Integer classId) {
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
        this.teaId = teaId == null ? null : teaId.trim();
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName == null ? null : teaName.trim();
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

    public String getBack1() {
        return back1;
    }

    public void setBack1(String back1) {
        this.back1 = back1 == null ? null : back1.trim();
    }

    public String getBack2() {
        return back2;
    }

    public void setBack2(String back2) {
        this.back2 = back2 == null ? null : back2.trim();
    }

    public String getBack3() {
        return back3;
    }

    public void setBack3(String back3) {
        this.back3 = back3 == null ? null : back3.trim();
    }
}