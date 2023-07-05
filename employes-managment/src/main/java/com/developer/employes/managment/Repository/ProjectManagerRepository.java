package com.developer.employes.managment.Repository;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Entity.EntityProjectManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Email;

@Repository
public interface ProjectManagerRepository extends JpaRepository<EntityProjectManager, Integer> {



}
