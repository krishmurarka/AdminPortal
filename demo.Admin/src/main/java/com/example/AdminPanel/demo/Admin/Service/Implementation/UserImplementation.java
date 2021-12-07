package com.example.AdminPanel.demo.Admin.Service.Implementation;

import com.example.AdminPanel.demo.Admin.Model.User;
import com.example.AdminPanel.demo.Admin.Repository.UserRepository;
import com.example.AdminPanel.demo.Admin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImplementation implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        User local = this.userRepository.findByUsername(user.getUsername());

        local = userRepository.save(user);
        return local;
    }

    @Override
    public User getUser(String username) {
        return this.userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(long userId) {
        this.userRepository.deleteById(userId);
    }

    @Override
    public void updateUser(User user) {
        User check = this.userRepository.findByUsername(user.getUsername());
        if (check == null) {
            System.out.println("No such user present");
        }

        check.setUsername(user.getUsername());
        check.setEmail(user.getEmail());
        check.setName(user.getName());
        check.setPassword(user.getPassword());

        this.userRepository.save(check);
    }

    @Override
    public void updateResetPasswordToken(String token, String email) {
        System.out.println("Check");
        userRepository.updateUser(email, token);
    }
    // 3 - below methods for reset Password Token

//    @Override
//    public void updateResetPasswordToken(String token, String email) {
//
//        User user = userRepository.findByEmail(email);
//        if (user != null) {
//            user.setResetPasswordToken(token);
//
//            userRepository.save(user);
//        } else {
//            System.out.println("Could not find any user with this email" + email);
//        }
//    }

    @Override
    public User get(String reset_password_token) {
        return userRepository.findByResetPasswordToken(reset_password_token);
    }

    @Override
    public void updatePassword(User user, String newPassword) {
        user.setPassword(newPassword);

        user.setResetPasswordToken(null);
        userRepository.save(user);
    }
//    @Override
//    public void updateUser(String username) {
//
//    }
}
