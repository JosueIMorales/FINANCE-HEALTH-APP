package com.example.financeHealth.model;

import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private int monthly_income;

    public UserInfo(){}

    public UserInfo(String name, String email, String jobTitle, int monthly_income) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.monthly_income = monthly_income;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String email() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public int getMonthly_income() {
        return monthly_income;
    }
    public void setMonthly_income(int monthly_income) {
        this.monthly_income = monthly_income;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", monthly_income=" + monthly_income +
                '}';
    }
}
