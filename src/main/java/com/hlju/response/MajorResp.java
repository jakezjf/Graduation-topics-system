package com.hlju.response;


/**
 * Created by JF on 2016/9/28.
 */
public class MajorResp {

    private Integer majorId; //专业ID

    private String majorName; //专业名字

    private Integer collegeId; //学院ID

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }
}
