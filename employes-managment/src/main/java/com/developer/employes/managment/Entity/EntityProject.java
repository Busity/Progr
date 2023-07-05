
package com.developer.employes.managment.Entity;

import com.developer.employes.managment.Repository.ProjectManagerRepository;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;
@Entity
@Table(name = "Projects")
public class EntityProject {


    @Id
    @GeneratedValue
    @Column(unique = true, name = "id")
    private Long id;
    @NotNull
    @OneToOne
    private EntityProjectManager entityProjectManager;
    @NotNull
    @Column(name = "subordinates")
    private String subordinates;
    @NotNull
    @Column(name = "`order`")
    private String order;
    @NotNull
    @CreatedDate
    @Column(name = "startofproject")
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private Date startofproject;
    @Column(name = "details")
    private String details;
    private Boolean Delete;

    public EntityProject(EntityProjectManager managertoProject) {
        entityProjectManager = managertoProject;
    }

    public EntityProject(Long id, String ManagertoProject, String subordinates, String order, Date startofproject, String details, Boolean delete) {
        this.id = id;
        this.subordinates = subordinates;
        this.order = order;
        this.startofproject = startofproject;
        this.details = details;
        Delete = delete;
    }

    public EntityProjectManager getManagertoProject() {
        return entityProjectManager;
    }

    public void setManagertoProject(EntityProjectManager managertoProject) {
        entityProjectManager = managertoProject;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }



    public Date getStartofproject() {
        return startofproject;
    }
    public void setStartofproject(Date startofproject) {
        this.startofproject = startofproject;
    }

    public String getSubordinates() {
        return subordinates;
    }
    public void setSubordinates(String subordinates) {
        this.subordinates = subordinates;
    }

    public String getOrder() {
        return order;
    }
    public void setOrder(String order) {
        this.order = order;
    }

    public Date getstartofproject() {return startofproject;}
    public void setstartofproject(Date startofproject) {this.startofproject = startofproject;}

    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public Boolean getDelete() {return Delete;}
    public void setDelete(Boolean delete) {
        Delete = delete;
    }
    }
