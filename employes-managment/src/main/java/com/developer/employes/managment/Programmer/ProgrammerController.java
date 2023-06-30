package com.developer.employes.managment.Programmer;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.css.Counter;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("/Programmer12")
public class ProgrammerController {

    private final ProgrammerService programmerService;

    public ProgrammerController(ProgrammerService programmerService) {
        this.programmerService = programmerService;
    }

    @GetMapping
    public List<EntityProgrammer> list() {
        return programmerService.FindallList();
    }

    @PostMapping
    public EntityProgrammer CreateProgrammer(){
        return programmerService.save(new EntityProgrammer());
    }
    @PutMapping
    public EntityProgrammer ModifyProgrammer(@RequestBody EntityProgrammer entityProgrammer){
        return programmerService.modify(entityProgrammer);
    }
//@DeleteMapping
    @DeleteMapping
    public String Deleteprogrammer(){
        return programmerService.Deleteprogrammer();
    }

}



