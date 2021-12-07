package com.example.AdminPanel.demo.Admin.Repository;

import com.example.AdminPanel.demo.Admin.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByUsername(String username);

    public User findByEmail(String email);

    public User findByResetPasswordToken(String resetPasswordToken);

    @Transactional
    @Modifying
    @Query(value = "UPDATE users t SET t.reset_password_token =:token where t.email= :email",nativeQuery = true)
    public void updateUser(@Param(value = "email") String email, @Param(value = "token") String token);

}
