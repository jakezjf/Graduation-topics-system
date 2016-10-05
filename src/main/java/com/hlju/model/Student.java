package com.hlju.model;

public class Student {
    private String stuId;

    private String stuName;

    private Integer stuSex;

    private String teaId;

    private Integer gradeId;

    private Integer collegeId;

    private Integer majorId;

    private Integer classId;

    private String back1;

    private String back2;

    private String back3;

    private String search;

    public Student(){}

    public Student(String stuId, String stuName, Integer stuSex, String teaId, Integer gradeId, Integer collegeId, Integer majorId, Integer classId) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.teaId = teaId;
        this.gradeId = gradeId;
        this.collegeId = collegeId;
        this.majorId = majorId;
        this.classId = classId;
    }

    public Student(String stuId, String stuName, Integer stuSex, String teaId, Integer gradeId, Integer collegeId, Integer majorId, Integer classId, String search) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.teaId = teaId;
        this.gradeId = gradeId;
        this.collegeId = collegeId;
        this.majorId = majorId;
        this.classId = classId;
        this.search = search;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public Integer getStuSex() {
        return stuSex;
    }

    public void setStuSex(Integer stuSex) {
        this.stuSex = stuSex;
    }

    public String getTeaId() {
        return teaId;
    }

    public void setTeaId(String teaId) {
        this.teaId = teaId == null ? null : teaId.trim();
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

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}