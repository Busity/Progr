
package com.developer.employes.managment.Project;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "Projects")
public class EntityProject {


    @Id
    @Column(name = "projectManager")
    public String projectManager;
    @Column(name = "subordinates")
    private String subordinates;
    @Column(name = "`order`")
    private String order;
    @Column(name = "startofProject")
    private Date startofproject;
    @Column(name = "details")
    private String details;

    public EntityProject() {
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
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

    public Date getStartofproject() {
        return startofproject;
    }

    public void setStartofproject(Date startofproject) {
        this.startofproject = startofproject;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

}