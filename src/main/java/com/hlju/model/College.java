package com.hlju.model;

public class College {

    private Integer collegeId; //学院ID

    private String collegeName; //学院名称

    private String collegeIntroduce; //学院简介

    private Integer gradeId; //年级ID

    private String back1;

    private String back2;

    private String back3;

    private String search;

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName == null ? null : collegeName.trim();
    }

    public String getCollegeIntroduce() {
        return collegeIntroduce;
    }

    public void setCollegeIntroduce(String collegeIntroduce) {
        this.collegeIntroduce = collegeIntroduce == null ? null : collegeIntroduce.trim();
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
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