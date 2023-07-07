package com.developer.employes.managment.Service.Imple;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Repository.ProgrammerRepository;
import com.developer.employes.managment.Service.ProgrammerService;
import com.sun.jdi.BooleanValue;
import jdk.jfr.BooleanFlag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammerImplements implements ProgrammerService {

    private final ProgrammerRepository programmerrepository;

    public ProgrammerImplements(ProgrammerRepository programmerrepository) {
        this.programmerrepository = programmerrepository;
    }

    @Override
    public List<EntityProgrammer> FindallList() {
        return programmerrepository.findAll();
    }


    @Override
    public List<EntityProgrammer> list(EntityProgrammer entityProgrammer) {
        return programmerrepository.findAll();
    }


    @Autowired
    public ResponseEntity<String> Create(EntityProgrammer entityProgrammer) {
        if (entityProgrammer.existsEntityProgrammerByEmail(entityProgrammer.getEmail())) {
            return ResponseEntity.badRequest().body("Error,this email is already in use");
        } else {
            programmerrepository.save(entityProgrammer);
            return ResponseEntity.ok().body("Good Email");
        }
    }


    public ResponseEntity<String> MODIFY(EntityProgrammer entityProgrammer) {
        if (entityProgrammer.existsEntityProgrammerByEmail(entityProgrammer.getEmail())) {
            return ResponseEntity.badRequest().body("Error,this email is already in use");
        } else {
            programmerrepository.save(entityProgrammer);
            return ResponseEntity.ok().body("Good Email");
        }
    }
    
    //return programmerrepository.findById(id).orElseThrow(() ->new EntityNotFoundException());


    public boolean deleteprogrammer(ResponseEntity<EntityProgrammer> entityProgrammer) {
        if (entityProgrammer.getBody().getDelete() == false) {
            return Boolean.parseBoolean(ResponseEntity.badRequest() + ("Cant delete this project"));
        } else if (entityProgrammer.getBody().getDelete() == true) {
       entityProgrammer.getBody().setDelete(Boolean.TRUE);
       programmerrepository.save(entityProgrammer.getBody());
            return Boolean.parseBoolean(ResponseEntity.accepted() + ("Deleted Flag"));
            
        }
        return entityProgrammer.getStatusCode().is4xxClientError();
    }
}
    //return programmerrepository.findById(id).orElseThrow(() ->new EntityNotFoundException());

