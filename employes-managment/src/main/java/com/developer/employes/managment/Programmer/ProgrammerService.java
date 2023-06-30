package com.developer.employes.managment.Programmer;

import com.developer.employes.managment.Project.EntityProject;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public interface ProgrammerService {


     List<EntityProgrammer> FindallList();

    List<EntityProgrammer> list(EntityProgrammer entityProgrammer);

    EntityProgrammer save(EntityProgrammer entityProgrammer);
    EntityProgrammer modify(EntityProgrammer entityProgrammer);
    String Deleteprogrammer();



}
