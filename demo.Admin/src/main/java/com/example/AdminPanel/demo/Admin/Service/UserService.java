package com.example.AdminPanel.demo.Admin.Service;

import com.example.AdminPanel.demo.Admin.Model.User;

public interface UserService {


    public User createUser(User user);

    public User getUser(String username);

    public void deleteUser(long userId);

    public void updateUser(User user);
}
