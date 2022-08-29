package com.example.cmmsiboot;

import java.util.ArrayList;

public class UserResponse {
    private String token;
    private ArrayList roles;
    private String username;

    public UserResponse(String token, ArrayList roles, String username) {
        this.token = token;
        this.roles = roles;
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public ArrayList getRoles() {
        return roles;
    }

    public void setRoles(ArrayList roles) {
        this.roles = roles;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}