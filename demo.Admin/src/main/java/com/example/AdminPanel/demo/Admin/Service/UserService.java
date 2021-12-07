package com.example.AdminPanel.demo.Admin.Service;

import com.example.AdminPanel.demo.Admin.Model.User;

public interface UserService {


    public User createUser(User user);

    public User getUser(String username);

    public void deleteUser(long userId);

    public void updateUser(User user);


    void updateResetPasswordToken(String token, String email);

    User get(String reset_password_token);

    void updatePassword(User user, String newPassword);
}
