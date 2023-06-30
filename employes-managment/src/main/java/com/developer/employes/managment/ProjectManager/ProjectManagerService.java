package com.developer.employes.managment.ProjectManager;

import org.springframework.data.domain.Page;

import java.util.Date;
import java.util.List;

public interface ProjectManagerService {

    List<EntityProjectManager> findAllProjectManager();


    EntityProjectManager createProject(EntityProjectManager entityprojectmanager);
    EntityProjectManager update(EntityProjectManager entityprojectmanager);


    String deleteProjectManagerown();
}
