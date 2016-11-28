package com.hlju.response;

/**
 * Created by JF on 2016/9/28.
 */
public class CollegeResp {

    private Integer collegeId; //学院ID

    private String collegeName; //学院名称

    private String collegeIntroduce; //学院简介

    private Integer gradeId; //年级ID

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
        this.collegeName = collegeName;
    }

    public String getCollegeIntroduce() {
        return collegeIntroduce;
    }

    public void setCollegeIntroduce(String collegeIntroduce) {
        this.collegeIntroduce = collegeIntroduce;
    }

    public Integer getGradeId() {
        return gradeId;
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }
}
