package com.example.AdminPanel.demo.Admin.Service;

import com.example.AdminPanel.demo.Admin.Model.AdminJobs;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AdminJobService {

    public AdminJobs createJob(AdminJobs adminJobs);

    public Optional<AdminJobs> getJob(long id);

    public void deleteJob(long id);

    public void updateJob(AdminJobs adminJobs);
}
