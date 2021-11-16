package com.example.AdminPanel.demo.Admin.Model;

public class JwtRequests {

    String username;
    String password;

    public JwtRequests(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public JwtRequests() {
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
}
