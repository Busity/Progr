package com.developer.employes.managment.Programmer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgrammerRepository extends JpaRepository<EntityProgrammer, Long> {



}
