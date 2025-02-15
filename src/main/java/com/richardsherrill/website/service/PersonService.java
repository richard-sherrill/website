package com.richardsherrill.website.service;

import com.richardsherrill.website.model.Person;

public interface PersonService {

    /**
     * Retrieve personal information
     * @return the Person object from the repository or an empty Person object if none found
     */
    Person retrievePerson(Long id);

}
