package com.developer.employes.managment.Service.Imple;

import com.developer.employes.managment.Entity.EntityProject;
import com.developer.employes.managment.Entity.EntityProjectManager;
import com.developer.employes.managment.Repository.ProgrammerRepository;
import com.developer.employes.managment.Repository.ProjectManagerRepository;
import com.developer.employes.managment.Service.ProgrammerService;
import com.developer.employes.managment.Service.ProjectManagerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectManagerImplements implements ProjectManagerService {

        private final com.developer.employes.managment.Repository.ProjectManagerRepository ProjectManagerRepository;


        public ProjectManagerImplements(com.developer.employes.managment.Repository.ProjectManagerRepository projectManagerRepository) {
        ProjectManagerRepository = projectManagerRepository;
        }

        @Override
        public List<EntityProjectManager> findAllProjectManager() {
        return ProjectManagerRepository.findAll();
    }


        @Override
        public ResponseEntity<String> createProject(EntityProjectManager entityprojectmanager) {

            if (entityprojectmanager.existsEntityProjectManagerByEmail(entityprojectmanager.getProjEmail())) {
                return ResponseEntity.badRequest().body("Error,this email is already in use");
            } else {
                ProjectManagerRepository.save(entityprojectmanager);
                return ResponseEntity.ok().body("Good Email");
            }
            }

         @Override
         public String deleteProjectManagerown(EntityProjectManager entityProjectManager) {
         if (entityProjectManager.isDelete() == false)
            return entityProjectManager.isDelete()+("Not Deleted");
            else
            return entityProjectManager.isDelete()+("Deleted Flag");
            }

         public ResponseEntity<String> Update(EntityProjectManager entityprojectmanager) {
            if (entityprojectmanager.existsEntityProjectManagerByEmail(entityprojectmanager.getProjEmail())) {
                return ResponseEntity.badRequest().body("Error,this email is already in use");
            } else {
                ProjectManagerRepository.save(entityprojectmanager);
                return ResponseEntity.ok().body("Good Email");}
                }
                }



