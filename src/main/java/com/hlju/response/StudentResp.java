package com.hlju.response;

/**
 * Created by JF on 2016/9/27.
 */
public class StudentResp {

    private String stuId;

    private String stuName;

    private Integer stuSex;

    private String teaId;

    private Integer gradeId;

    private Integer collegeId;

    private Integer majorId;

    private Integer classId;

    public StudentResp(){}

    public StudentResp(String stuId, String stuName, Integer stuSex, String teaId, Integer gradeId, Integer collegeId, Integer majorId, Integer classId) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.teaId = teaId;
        this.gradeId = gradeId;
        this.collegeId = collegeId;
        this.majorId = majorId;
        this.classId = classId;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
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
        this.teaId = teaId;
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
