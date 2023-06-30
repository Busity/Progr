
package com.developer.employes.managment.Project;

import java.util.HashSet;
import java.util.List;

public interface ProjectService {


    List<EntityProject> listingproject();

    EntityProject saveinProject(EntityProject entityProject);

    EntityProject projectively(EntityProject entityProject);


    String deleteProjectEntity(EntityProject entityProject);


    //részletek
    HashSet<EntityProject> detailprojectofProject(EntityProject entityProject);
}