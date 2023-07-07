package com.developer.employes.managment.Controller;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Service.ProgrammerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.RequestEntity.delete;
import static org.springframework.http.RequestEntity.get;

@RestController
@RequestMapping("/Programmer")
public class ProgrammerController {

    public final ProgrammerService programmerService;

    public ProgrammerController(ProgrammerService programmerService) {
        this.programmerService = programmerService;
    }


    @GetMapping("/list")
    public List<EntityProgrammer> list() {
        try {
            List<EntityProgrammer> list = new ArrayList<>();
            if (list.isEmpty()) {
                return (List<EntityProgrammer>) new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return (List<EntityProgrammer>) new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception ex) {
            return (List<EntityProgrammer>) new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/Details")
    public List<EntityProgrammer> FindAllList(EntityProgrammer entityProgrammer) {
        return FindAllList(entityProgrammer);
    }

    @PostMapping({"/CreateProgrammer"})
    public ResponseEntity<EntityProgrammer> Create(EntityProgrammer entityProgrammer) {
        return (ResponseEntity<EntityProgrammer>) ResponseEntity.status(HttpStatus.CREATED);
    }
//Ha kellene keresni ID-keresztül.
    //@GetMapping(value = "/{id}")
    //public EntityProgrammer findById(@PathVariable("id") Long id, HttpServletResponse response) {
    // try {
    // Foo resourceById = RestPreconditions.checkFound(service.findOne(id));
    // eventPublisher.publishEvent(new SingleResourceRetrievedEvent(this, response));
    //  return resourceById;
    //   }
    //    catch (MyResourceNotFoundException exc) {
    //         throw new ResponseStatusException(
    //           HttpStatus.NOT_FOUND, "entity programmer Not Found", exc);
    //    }
    //}

    @PutMapping("/ModifyProgrammer")
    public ResponseEntity<EntityProgrammer> ModifyProgrammer(@RequestBody EntityProgrammer entityProgrammer) {
        return (ResponseEntity<EntityProgrammer>) ResponseEntity.status(HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/delete")
    public ResponseEntity<EntityProgrammer> Deleteprog(@RequestBody ResponseEntity<EntityProgrammer> entityProgrammerResponseEntity) {
       return entityProgrammerResponseEntity.ok().build();



    }

    }


