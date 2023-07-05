
package com.developer.employes.managment.Service;

import com.developer.employes.managment.Entity.EntityProject;

import java.util.HashSet;
import java.util.List;

public interface ProjectService {


    List<EntityProject> listingproject();

    EntityProject saveinProject(EntityProject entityProject);

    EntityProject projectively(EntityProject entityProject);

    String deleteProjectEntity(EntityProject entityProject);

    HashSet<EntityProject> detailprojectofProject(EntityProject entityProject);
}