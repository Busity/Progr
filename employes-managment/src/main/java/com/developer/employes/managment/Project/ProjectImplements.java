
package com.developer.employes.managment.Project;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class ProjectImplements implements ProjectService {
    private final com.developer.employes.managment.Project.ProjectRepository ProjectRepository;

    public ProjectImplements(com.developer.employes.managment.Project.ProjectRepository projectRepository) {
        ProjectRepository = projectRepository;
    }

    //Lista
    @Override
    public List<EntityProject> listingproject() {
        return ProjectRepository.findAll();
    }

    @Override
    //részletek
    public HashSet<EntityProject> detailprojectofProject(EntityProject entityProject) {
        return (HashSet<EntityProject>) ProjectRepository.findAll();
    }

    @Override
    //Létrehozás
    public EntityProject saveinProject(EntityProject entityProject) {
        return ProjectRepository.save(entityProject);



    }

    @Override
    public EntityProject projectively(EntityProject entityProject) {
        return ProjectRepository.save(entityProject);
    }

    @Override
    public String deleteProjectEntity(EntityProject entityProject) {
        return "AND DeletedFlag = 'Deleted Flag':";
    }
}