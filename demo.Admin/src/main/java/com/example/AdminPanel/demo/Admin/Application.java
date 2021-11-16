package com.example.AdminPanel.demo.Admin;

import com.example.AdminPanel.demo.Admin.Model.AdminJobs;
import com.example.AdminPanel.demo.Admin.Model.User;
import com.example.AdminPanel.demo.Admin.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {


    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting -> ");
//        AdminJobs adminJobs = new AdminJobs();
//        adminJobs.setCategory_Name("Intern");
//        adminJobs.setCompany_Logo("a.png");
//        adminJobs.setJob_Title("SDE - Intern");
//        adminJobs.setCompany_Name("Adobe");
//        adminJobs.setJob_description("currently in 3rd year master in JAVA");
//        adminJobs.setStreamName("Science");
//        adminJobs.setJob_Location("Noida");
//        adminJobs.setUrl("f.png");

//        System.out.println(adminJobs.getUrl());
    }
}
