package com.developer.employes.managment.Controller;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Entity.EntityProject;
import com.developer.employes.managment.Service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/Details")
    public List<EntityProject> listingproject(){
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

    public ResponseEntity<EntityProject> Deleteprog(@RequestBody ResponseEntity<EntityProject> entityProject) {
        return (ResponseEntity<EntityProject>) ResponseEntity.status(HttpStatus.ACCEPTED);
    }

    }

