package com.developer.employes.managment;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Repository.ProgrammerRepository;
import com.developer.employes.managment.Service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.validation.constraints.Email;
import java.util.ArrayList;
@ComponentScan("Prog")
@SpringBootApplication
public class EmployesManagmentApplication  {

	public static void main(String[] args) {
		SpringApplication.run(EmployesManagmentApplication.class, args);

	}
    }


