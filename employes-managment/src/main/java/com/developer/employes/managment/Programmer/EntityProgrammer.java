package com.developer.employes.managment.Programmer;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Data
@Table(name = "EntityProgramm")
public class EntityProgrammer {


    @Id

    @Column(name = "ProgrammerName")
    private String name;
    @Column(name = "ProgrammerAdress")
    private String Adress;
    @Column(name = "Birthday")
    private Date Bday;
    @Column(name = "PhoneNumber")
    private Integer PhoneNumber;
    @Column(name = "Email")
    private String Email;
    @Column(name = "Projects")
    private String Projects;
    @Column(name = "JobPosition")
    private Enum JobPosition;

    @Column(name = "TraineeStatus")
    private Boolean TraineeStatus;

    public EntityProgrammer() {
    }

    public String getProjects() {
        return Projects;
    }

    public void setProjects(String projects) {
        Projects = projects;
    }

    public Enum getJobPosition() {
        return JobPosition;
    }

    public void setJobPosition(Enum jobPosition) {
        JobPosition = jobPosition;
    }

    public Entity Programmer(String name, String adress, Date bday, Integer phoneNumber, String email, Boolean traineeStatus) {
        this.name = name;
        Adress = adress;
        Bday = bday;
        PhoneNumber = phoneNumber;
        Email = email;
        TraineeStatus = traineeStatus;
        return null;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public Date getBday() {
        return Bday;
    }

    public void setBday(Date bday) {
        Bday = bday;
    }

    public Integer getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    public Boolean getTraineeStatus() {
        return TraineeStatus;
    }

    public void setTraineeStatus(Boolean traineeStatus) {
        TraineeStatus = traineeStatus;
    }
}

