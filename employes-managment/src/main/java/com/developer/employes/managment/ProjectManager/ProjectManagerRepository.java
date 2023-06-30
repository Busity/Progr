package com.developer.employes.managment.ProjectManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectManagerRepository extends JpaRepository<EntityProjectManager, Long > {

}
