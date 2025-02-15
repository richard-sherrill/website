package com.richardsherrill.website.service.impl;

import com.richardsherrill.website.model.Person;
import com.richardsherrill.website.repository.PersonRepository;
import com.richardsherrill.website.service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    public PersonServiceImpl(final PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person retrievePerson(final Long id) {
        return personRepository.findById(id).isPresent() ? personRepository.findById(id).get() : new Person();
    }
}
