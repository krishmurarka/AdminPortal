package com.example.AdminPanel.demo.Admin.Model;

import javax.persistence.*;

@Entity()
@Table(name = "AdminJob")
public class AdminJobs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String company_Name;
    private String Job_Title;
    private String url;
    private String Company_Logo;
    private String Job_Location;

    private String Category_Name;
    private String StreamName;

    private String job_description;

    public AdminJobs() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany_Name() {
        return company_Name;
    }

    public void setCompany_Name(String company_Name) {
        this.company_Name = company_Name;
    }

    public String getJob_Title() {
        return Job_Title;
    }

    public void setJob_Title(String job_Title) {
        Job_Title = job_Title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCompany_Logo() {
        return Company_Logo;
    }

    public void setCompany_Logo(String company_Logo) {
        Company_Logo = company_Logo;
    }

    public String getJob_Location() {
        return Job_Location;
    }

    public void setJob_Location(String job_Location) {
        Job_Location = job_Location;
    }

    public String getCategory_Name() {
        return Category_Name;
    }

    public void setCategory_Name(String category_Name) {
        Category_Name = category_Name;
    }

    public String getStreamName() {
        return StreamName;
    }

    public void setStreamName(String streamName) {
        StreamName = streamName;
    }

    public String getJob_description() {
        return job_description;
    }

    public void setJob_description(String job_description) {
        this.job_description = job_description;
    }
}
