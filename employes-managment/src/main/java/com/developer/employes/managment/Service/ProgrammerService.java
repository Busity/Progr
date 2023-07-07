package com.developer.employes.managment.Service;

import com.developer.employes.managment.Entity.EntityProgrammer;
import jdk.jfr.BooleanFlag;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public interface ProgrammerService {


    public List<EntityProgrammer> FindallList();

    List<EntityProgrammer> list(EntityProgrammer entityProgrammer);

    //List<EntityProgrammer> findById(String id);

    ResponseEntity<String> MODIFY(EntityProgrammer entityProgrammer);

    ResponseEntity<String> Create(EntityProgrammer entityProgrammer);


    boolean deleteprogrammer(ResponseEntity<EntityProgrammer> entityProgrammer);

    }



