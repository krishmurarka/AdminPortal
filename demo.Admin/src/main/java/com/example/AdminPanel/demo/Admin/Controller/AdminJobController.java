package com.example.AdminPanel.demo.Admin.Controller;


import com.example.AdminPanel.demo.Admin.Model.AdminJobs;
import com.example.AdminPanel.demo.Admin.Service.AdminJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/job")
public class AdminJobController {
    @Autowired
    private AdminJobService adminJobService;

    @PostMapping("/")
    private AdminJobs createJob(@RequestBody AdminJobs adminJobs) {
        return this.adminJobService.createJob(adminJobs);
    }

    @GetMapping("/{id}")
    private Optional<AdminJobs> getJob(@PathVariable("id") long id) {
        return this.adminJobService.getJob(id);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable("id") long id) {
        this.adminJobService.deleteJob(id);
    }

    @PutMapping("/")
    public void updateJob(@RequestBody AdminJobs adminJobs) {
        this.adminJobService.updateJob(adminJobs);
    }
}
