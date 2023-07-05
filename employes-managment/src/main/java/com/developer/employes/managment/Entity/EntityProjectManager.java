
package com.developer.employes.managment.Entity;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
@Entity
@Table(name ="ProjectManager")
public class EntityProjectManager {

    @Id
    @GeneratedValue

    @NotNull
    @Size(max = 20)
    @PrimaryKeyJoinColumn
    @JoinColumn(name = "ProjName")
    private String ProjName;
    @Column(name = "ProjAdress")
    private String ProjAdress;
    @Column(name = "ProjBday")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date ProjBday;
    @NotNull
    @Pattern(regexp = "^(\\+\\d+)?([ -/]?\\d+){4,20}$", message = "Projectmanager.phone.number.is.invalid")
    @Column(name = "ProjPhoneNumber")
    private Integer ProjPhoneNumber;
    @Size(max = 150)
    @Column(name = "ProjEmail", unique = true)
    @Pattern(regexp = "^[_A-Za-z0-9-+]+(.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(.[A-Za-z0-9]+)*(.[A-Za-z]{2,})$", message = "{user.email.invalid}")
    private String ProjEmail;
    @NotNull
    @Column(name = "Projects")
    private String Projects;
    @NotNull
    @Column(name = "Suborditanes")
    private String Subordinates;

    private boolean Delete;


 //   public EntityProjectManager(boolean delete) {
      //  Delete = delete;
    //}

    public EntityProjectManager( boolean delete) {

        Delete = delete;
    }

    public EntityProjectManager(String projName, String projAdress, Date projBday, Integer projPhoneNumber, String projEmail, String projects, String subordinates, boolean Delete) {

        ProjName = projName;
        ProjAdress = projAdress;
        ProjBday = projBday;
        ProjPhoneNumber = projPhoneNumber;
        ProjEmail = projEmail;
        Projects = projects;
        Subordinates = subordinates;


    }


    public boolean isDelete() {
        return Delete;
    }
    public void setDelete(boolean delete) {
        this.Delete = delete;
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
    public void setSubordinates(String subordinates) {Subordinates = subordinates;}

    public boolean existsEntityProjectManagerByEmail(String email) {
        return existsEntityProjectManagerByEmail(getProjEmail());}
    }
