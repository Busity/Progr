package com.developer.employes.managment.Controller;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Service.ProgrammerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
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


        @PostMapping({"/CreateProgrammer"})
        public ResponseEntity<EntityProgrammer> Create(EntityProgrammer entityProgrammer) {
        return (ResponseEntity<EntityProgrammer>) ResponseEntity.status(HttpStatus.CREATED);
        }

        @PutMapping("/ModifyProgrammer")
        public ResponseEntity<EntityProgrammer> ModifyProgrammer(@RequestBody EntityProgrammer entityProgrammer) {
        return (ResponseEntity<EntityProgrammer>) ResponseEntity.status(HttpStatus.ACCEPTED);
        }

        @DeleteMapping("/Delete")
        public Boolean Deleteprogrammer() {
        return Deleteprogrammer();
        }
        }





