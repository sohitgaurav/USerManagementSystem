package com.geekster.userManagementSystem.model;

public class User {
    private String userId;
    private String name;
    private String username;
    private String  address;
    private String phoneNo;

    public User(String userId, String name, String username, String address, String phoneNo) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
