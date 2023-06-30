package com.developer.employes.managment.ProjectManager;

import com.developer.employes.managment.Project.EntityProject;
import com.developer.employes.managment.Project.ProjectService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ProjectManager")

public class ProjectManagerController {
    private final ProjectManagerService projectManagerService;


    public ProjectManagerController(ProjectManagerService projectManagerService) {
        this.projectManagerService = projectManagerService;
    }

    @GetMapping
    public List<EntityProjectManager> listofproject() {
        return projectManagerService.findAllProjectManager();
    }

    @PostMapping
    public EntityProjectManager CreateProject(@RequestBody EntityProjectManager entityProjectManager){
        return projectManagerService.createProject(entityProjectManager);
    }
    @PutMapping
    public EntityProjectManager ModifyProject(@RequestBody EntityProjectManager entityProjectManager){
        return projectManagerService.update(entityProjectManager);
    }
    //@DeleteMapping
    @DeleteMapping    public String Deleteprog(@RequestBody EntityProjectManager entityProjectManager){
        return projectManagerService.deleteProjectManagerown();
    }

}


