package com.developer.employes.managment.Controller;

import com.developer.employes.managment.Entity.EntityProject;
import com.developer.employes.managment.Service.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Project")
public class ProjectController {

    public final ProjectService projectService;


    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/list")
    public List<EntityProject> listofproject() {
        return projectService.listingproject();
    }

    @PostMapping("/Create")
    public EntityProject CreateProject(@RequestBody EntityProject entityProject){
        return projectService.saveinProject(entityProject);
    }
    @PutMapping("/Modify")
    public EntityProject ModifyProject(@RequestBody EntityProject entityProject){
        return projectService.projectively(entityProject);
    }

    @DeleteMapping  ("/delete")  public String Deleteprog(@RequestBody EntityProject entityProject){
        return projectService.deleteProjectEntity(entityProject);
    }

}

