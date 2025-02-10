package com.richardsherrill.website.service;

import com.richardsherrill.website.model.PersonalInfo;

public interface PersonService {

    /**
     * Retrieve personal information
     * @return the PersonalInfo object from the repository or an empty PersonalInfo object if none found
     */
    PersonalInfo retrievePersonalInfo(Long id);

}
