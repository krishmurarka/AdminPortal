package com.example.AdminPanel.demo.Admin.Controller;

import com.example.AdminPanel.demo.Admin.Model.User;
import com.example.AdminPanel.demo.Admin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    private User createUser(@RequestBody User user) {
        return this.userService.createUser(user);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) {
        return this.userService.getUser(username);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") long userId) {
        this.userService.deleteUser(userId);
    }

    @PutMapping("/")
    public void updateUser(@RequestBody User user) {
        this.userService.updateUser(user);
    }


}
