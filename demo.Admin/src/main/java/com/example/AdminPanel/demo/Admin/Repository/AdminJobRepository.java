package com.example.AdminPanel.demo.Admin.Repository;

import com.example.AdminPanel.demo.Admin.Model.AdminJobs;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminJobRepository extends JpaRepository<AdminJobs, Long> {

    public AdminJobs findByUrl(String Url);

}
