package com.heima;

public class User {
    private String userName;
    private String password;
    private String id;
    private String phoneNumber;

    public User() {
    }

    public User(String userName, String password, String id, String phoneNumber) {
        this.userName = userName;
        this.password = password;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    /**
     * 获取
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /*public String toString() {
        return "User{userName = " + userName + ", password = " + password + ", id = " + id + ", phoneNumber = " + phoneNumber + "}";
    }*/
}
