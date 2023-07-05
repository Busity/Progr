
package com.developer.employes.managment.Service.Imple;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Entity.EntityProject;
import com.developer.employes.managment.Service.ProjectService;
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
        return (HashSet<EntityProject>) ProjectRepository.findAll();}

    @Override
    public EntityProject saveinProject(EntityProject entityProject) {
        return ProjectRepository.save(entityProject);}

    @Override
    public EntityProject projectively(EntityProject entityProject) {
        return ProjectRepository.save(entityProject);
    }

    public String deleteProjectEntity(EntityProject entityProject) {
        if (entityProject.getDelete() == false)
            return entityProject.getDelete()+("Not Deleted");
        else
            return (entityProject.getDelete())+("Deleted Flag");
    }
    }