package com.developer.employes.managment.Service;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Entity.EntityProject;
import com.developer.employes.managment.Entity.EntityProjectManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public interface ProgrammerService {


    public List<EntityProgrammer> FindallList();

    List<EntityProgrammer> list(EntityProgrammer entityProgrammer);

    ResponseEntity<String> MODIFY(EntityProgrammer entityProgrammer);

    ResponseEntity<String> Create(EntityProgrammer entityProgrammer);

    String deleteprogrammer(EntityProgrammer entityProgrammer);

    }



