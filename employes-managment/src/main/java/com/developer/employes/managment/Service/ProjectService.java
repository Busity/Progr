
package com.developer.employes.managment.Service;

import com.developer.employes.managment.Entity.EntityProject;
import org.springframework.http.ResponseEntity;

import java.util.HashSet;
import java.util.List;

public interface ProjectService {


    List<EntityProject> listingproject();

    EntityProject saveinProject(EntityProject entityProject);

    EntityProject projectively(EntityProject entityProject);

    boolean deleteProjectEntity(ResponseEntity<EntityProject> entityProject);

    HashSet<EntityProject> detailprojectofProject(EntityProject entityProject);

    }