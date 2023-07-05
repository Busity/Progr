package com.developer.employes.managment.Controller;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Entity.EntityProject;
import com.developer.employes.managment.Entity.EntityProjectManager;
import com.developer.employes.managment.Service.ProjectManagerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ProjectManager")

public class ProjectManagerController {
    public final ProjectManagerService projectManagerService;


    public ProjectManagerController(ProjectManagerService projectManagerService) {
        this.projectManagerService = projectManagerService;
    }

    @GetMapping("/List")
    public List<EntityProjectManager> listofproject() {
        return projectManagerService.findAllProjectManager();
    }

    @GetMapping("/Details")
    public List<EntityProjectManager> listingproject() {
        return projectManagerService.findAllProjectManager();
    }

    @PostMapping("/CreateProjectManager")
    public ResponseEntity<EntityProjectManager> CreateProjectManager(@RequestBody EntityProjectManager entityProjectManager) {
        return (ResponseEntity<EntityProjectManager>) ResponseEntity.status(HttpStatus.CREATED);
    }

    @PutMapping("/ModifyProjectManager")
    public ResponseEntity<EntityProjectManager> ModifyProjectManager(@RequestBody EntityProjectManager entityProjectManager) {
        return (ResponseEntity<EntityProjectManager>) ResponseEntity.status(HttpStatus.ACCEPTED);
    }
    //@DeleteMapping
    @DeleteMapping ("/DeleteProjectManager")   public String Deleteprog(@RequestBody EntityProjectManager entityProjectManager ){
        return projectManagerService.deleteProjectManagerown(entityProjectManager);
//Van visszatérési érték,mert a feladat,úgy kéri ne legyen törölve.
    }

}


