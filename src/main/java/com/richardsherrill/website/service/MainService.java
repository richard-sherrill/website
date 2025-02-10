package com.richardsherrill.website.service;

import com.richardsherrill.website.model.PersonalInfo;
import com.richardsherrill.website.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    @Autowired
    MainRepository mainRepository;

    /**
     * Method to retrieve personal information
     * @return the PersonalInfo object from the repository or an empty PersonalInfo object if none found
     */
    public PersonalInfo retrievePersonalInfo(Long id) {

        return mainRepository.findById(id).isPresent() ? mainRepository.findById(id).get() : new PersonalInfo();
    }

}
