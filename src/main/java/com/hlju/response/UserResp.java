package com.hlju.response;

/**
 * Created by JF on 2016/9/22.
 */
public class UserResp {

    private String userId;

    private Integer userType;

    private String userPhone;

    private String userEmail;

    private int userCount = 0;


    public UserResp(){}

    public UserResp(String userId, Integer userType, String userPhone, String userEmail) {
        this.userId = userId;
        this.userType = userType;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
    }

    public UserResp(String userId, Integer userType, String userPhone, String userEmail, int userCount) {
        this.userId = userId;
        this.userType = userType;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userCount = userCount;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }
}
