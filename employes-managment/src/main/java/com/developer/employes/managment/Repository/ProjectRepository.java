
package com.developer.employes.managment.Repository;

import com.developer.employes.managment.Entity.EntityProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<EntityProject, Long> {

}