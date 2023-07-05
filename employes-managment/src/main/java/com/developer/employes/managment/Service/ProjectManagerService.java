package com.developer.employes.managment.Service;

import com.developer.employes.managment.Entity.EntityProjectManager;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProjectManagerService {

    List<EntityProjectManager> findAllProjectManager();

    ResponseEntity<String> createProject(EntityProjectManager entityprojectmanager);

    ResponseEntity<String> Update(EntityProjectManager entityprojectmanager);

    String deleteProjectManagerown(EntityProjectManager entityProjectManager);
}
