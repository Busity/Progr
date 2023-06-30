package com.developer.employes.managment.ProjectManager;

import com.developer.employes.managment.Project.EntityProject;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ProjectManagerImplements implements ProjectManagerService {

    private final com.developer.employes.managment.ProjectManager.ProjectManagerRepository ProjectManagerRepository;


        public ProjectManagerImplements(com.developer.employes.managment.ProjectManager.ProjectManagerRepository projectManagerRepository) {
        ProjectManagerRepository = projectManagerRepository;
    }

        @Override
        public List<EntityProjectManager> findAllProjectManager() {
        return ProjectManagerRepository.findAll();
    }


    @Override
    public EntityProjectManager createProject(EntityProjectManager entityprojectmanager) {
        return ProjectManagerRepository.save(entityprojectmanager);
    }
        @Override
        public EntityProjectManager update(EntityProjectManager entityprojectmanager) {
        return ProjectManagerRepository.saveAndFlush(entityprojectmanager);
       }
           //Törlés helyett kap Stringet.
          @Override
          public String deleteProjectManagerown(){
          return ProjectManagerRepository + ("Black Flag");
        }
        }



