package com.developer.employes.managment.Programmer;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashSet;
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

    @Override
    public EntityProgrammer save(EntityProgrammer entityProgrammer) {
        return programmerrepository.save(entityProgrammer);
    }

    @Override
    public EntityProgrammer modify(EntityProgrammer entityProgrammer) {
        return programmerrepository.saveAndFlush(entityProgrammer);
    }

    @Override
    public String Deleteprogrammer() {
        return "AND DeletedFlag = 'Deleted Flag':";


    }
}