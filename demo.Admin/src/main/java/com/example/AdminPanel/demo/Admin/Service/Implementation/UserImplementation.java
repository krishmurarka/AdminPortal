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

//    @Override
//    public void updateUser(String username) {
//
//    }
}
