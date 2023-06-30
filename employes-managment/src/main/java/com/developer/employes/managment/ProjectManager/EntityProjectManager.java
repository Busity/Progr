
package com.developer.employes.managment.ProjectManager;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
@Entity
@Table(name ="ProjectManager")
public class EntityProjectManager {



    @Id
    @Column(name = "ProjName")
    private String ProjName;
    @Column(name = "ProjAdress")
    private String ProjAdress;
    @Column(name = "ProjBday")
    private Date ProjBday;
    @Column(name = "ProjPhoneNumber")
    private Integer ProjPhoneNumber;
    @Column(name = "ProjEmail")
    private String ProjEmail;
    @Column(name = "Projects")
    private String Projects;
    @Column(name = "Suborditanes")
    private String Subordinates;

    public EntityProjectManager() {
    }

    public EntityProjectManager(String projName, String projAdress, Date projBday, Integer projPhoneNumber, String projEmail, String projects, String subordinates) {
        ProjName = projName;
        ProjAdress = projAdress;
        ProjBday = projBday;
        ProjPhoneNumber = projPhoneNumber;
        ProjEmail = projEmail;
        Projects = projects;
        Subordinates = subordinates;
    }

    public String getProjName() {
        return ProjName;
    }

    public void setProjName(String projName) {
        ProjName = projName;
    }

    public String getProjAdress() {
        return ProjAdress;
    }

    public void setProjAdress(String projAdress) {
        ProjAdress = projAdress;
    }

    public Date getProjBday() {
        return ProjBday;
    }

    public void setProjBday(Date projBday) {
        ProjBday = projBday;
    }

    public Integer getProjPhoneNumber() {
        return ProjPhoneNumber;
    }

    public void setProjPhoneNumber(Integer projPhoneNumber) {
        ProjPhoneNumber = projPhoneNumber;
    }

    public String getProjEmail() {
        return ProjEmail;
    }

    public void setProjEmail(String projEmail) {
        ProjEmail = projEmail;
    }

    public String getProjects() {
        return Projects;
    }

    public void setProjects(String projects) {
        Projects = projects;
    }

    public String getSubordinates() {
        return Subordinates;
    }

    public void setSubordinates(String subordinates) {
        Subordinates = subordinates;
    }
}
