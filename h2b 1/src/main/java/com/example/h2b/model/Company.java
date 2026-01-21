package com.example.h2b.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_com;

    public int getId_com() {
        return Id_com;
    }

    public void setId_com(int id_com) {
        Id_com = id_com;
    }

    private String department;
    private String name;
    private String title;



    @Embedded
    @JsonProperty("address")
    private CompanyAddress companyAddress;

    // Getters and Setters

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CompanyAddress getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(CompanyAddress companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public String toString() {
        return "Company{" +
                "Id_com=" + Id_com +
                ", department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", companyAddress=" + companyAddress +
                '}';
    }
}
