
package com.developer.employes.managment.Service.Imple;

import com.developer.employes.managment.Entity.EntityProject;
import com.developer.employes.managment.Service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class ProjectImplements implements ProjectService {
    private final com.developer.employes.managment.Repository.ProjectRepository ProjectRepository;

    public ProjectImplements(com.developer.employes.managment.Repository.ProjectRepository projectRepository) {
        ProjectRepository = projectRepository;
    }


    @Override
    public List<EntityProject> listingproject() {
        return ProjectRepository.findAll();
    }

    @Override
    public HashSet<EntityProject> detailprojectofProject(EntityProject entityProject) {
        return (HashSet<EntityProject>) ProjectRepository.findAll();
    }

    @Override
    public EntityProject saveinProject(EntityProject entityProject) {
        return ProjectRepository.save(entityProject);
    }

    @Override
    public EntityProject projectively(EntityProject entityProject) {
        return ProjectRepository.save(entityProject);
    }

    public boolean deleteProjectEntity(ResponseEntity<EntityProject> entityProject) {
        if (entityProject.getBody().getDelete() == false) {
            return Boolean.parseBoolean(ResponseEntity.badRequest() + ("Cant delete this project"));
        } else if (entityProject.getBody().getDelete() == true){
            ProjectRepository.save(entityProject.getBody());
            return Boolean.parseBoolean(ResponseEntity.accepted() + ("Deleted Flag"));
        }
        return entityProject.getStatusCode().is4xxClientError();
        }
        }

