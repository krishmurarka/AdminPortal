package com.example.AdminPanel.demo.Admin.Repository;

import com.example.AdminPanel.demo.Admin.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);

}
