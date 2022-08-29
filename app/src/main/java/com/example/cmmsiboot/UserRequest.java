package com.example.cmmsiboot;

public class UserRequest {
    private String username;
    private String password;
    private String deviceToken;

    public UserRequest(String username, String password, String deviceToken) {
        this.username = username;
        this.password = password;
        this.deviceToken = deviceToken;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }
}
