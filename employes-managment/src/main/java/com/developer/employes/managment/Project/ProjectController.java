package com.developer.employes.managment.Project;

import com.developer.employes.managment.Programmer.EntityProgrammer;
import com.developer.employes.managment.Programmer.ProgrammerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Project")
public class ProjectController {

    private final ProjectService projectService;


    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<EntityProject> listofproject() {
        return projectService.listingproject();
    }

    @PostMapping
    public EntityProject CreateProject(@RequestBody EntityProject entityProject){
        return projectService.saveinProject(entityProject);
    }
    @PutMapping
    public EntityProject ModifyProject(@RequestBody EntityProject entityProject){
        return projectService.projectively(entityProject);
    }
    //@DeleteMapping
    @DeleteMapping    public String Deleteprog(@RequestBody EntityProject entityProject){
        return projectService.deleteProjectEntity(entityProject);
    }

}

