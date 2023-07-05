package com.developer.employes.managment.Service.Imple;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Entity.EntityProjectManager;
import com.developer.employes.managment.Repository.ProgrammerRepository;
import com.developer.employes.managment.Service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
                    };


        public ResponseEntity<String> MODIFY(EntityProgrammer entityProgrammer) {
          if (entityProgrammer.existsEntityProgrammerByEmail(entityProgrammer.getEmail())) {
            return ResponseEntity.badRequest().body("Error,this email is already in use");
             } else {
               programmerrepository.save(entityProgrammer);
                 return ResponseEntity.ok().body("Good Email");
                  }
                   };
    //return programmerrepository.findById(id).orElseThrow(() ->new EntityNotFoundException());


        public String deleteprogrammer(EntityProgrammer entityProgrammer) {
          if (entityProgrammer.getDelete() == false)
            return entityProgrammer.getDelete()+("Not Deleted");
              else
                return (entityProgrammer.getDelete())+("Deleted Flag");
                 }
    //return programmerrepository.findById(id).orElseThrow(() ->new EntityNotFoundException());
                  }