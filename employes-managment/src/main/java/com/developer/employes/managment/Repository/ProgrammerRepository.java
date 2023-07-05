package com.developer.employes.managment.Repository;

import com.developer.employes.managment.Entity.EntityProgrammer;
import com.developer.employes.managment.Entity.EntityProjectManager;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Email;
import java.io.Serializable;
import java.util.Optional;

@Repository
public interface ProgrammerRepository extends JpaRepository<EntityProgrammer, Integer> {





}
