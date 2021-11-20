package com.example.AdminPanel.demo.Admin.Service.Implementation;


import com.example.AdminPanel.demo.Admin.Model.AdminJobs;
import com.example.AdminPanel.demo.Admin.Repository.AdminJobRepository;
import com.example.AdminPanel.demo.Admin.Service.AdminJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminJobImplementation implements AdminJobService {

    @Autowired
    private AdminJobRepository adminJobRepository;

    @Override
    public AdminJobs createJob(AdminJobs adminJobs) {
        AdminJobs jobs = this.adminJobRepository.findByUrl(adminJobs.getUrl());

        jobs = adminJobRepository.save(adminJobs);
        return jobs;
    }

    public Optional<AdminJobs> getJob(long id) {
        return this.adminJobRepository.findById(id);
    }

    @Override
    public void deleteJob(long id) {
        this.adminJobRepository.deleteById(id);
    }

    @Override
    public void updateJob(AdminJobs adminJobs) {
        AdminJobs jobs = this.adminJobRepository.findByUrl(adminJobs.getUrl());
        if (jobs == null) {
            System.out.println("No such user present");
        }
        jobs.setCategory_Name(adminJobs.getCategory_Name());
        jobs.setJob_Title(adminJobs.getJob_Title());
        jobs.setUrl(adminJobs.getUrl());
        jobs.setCompany_Logo(adminJobs.getCompany_Logo());
        jobs.setJob_Location(adminJobs.getJob_Location());
        jobs.setCategory_Name(adminJobs.getCategory_Name());
        jobs.setStreamName(adminJobs.getStreamName());
        jobs.setJob_description(adminJobs.getJob_description());
        jobs.setMinSalary(adminJobs.getMinSalary());
        jobs.setMaxSalary(adminJobs.getMaxSalary());
        jobs.setDeadlineDate(adminJobs.getDeadlineDate());
        this.adminJobRepository.save(jobs);

    }

}
