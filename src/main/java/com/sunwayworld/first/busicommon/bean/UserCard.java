package com.sunwayworld.first.busicommon.bean;

public class UserCard {

    public UserCard() {
    }

    public UserCard(String imgPath, String userName, String today, String deptName, String lastLoginTime) {
        this.imgPath = imgPath;
        this.userName = userName;
        this.today = today;
        this.deptName = deptName;
        this.lastLoginTime = lastLoginTime;
    }

    private String imgPath;
    private String userName;
    private String today;
    private String deptName;
    private String lastLoginTime;

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
