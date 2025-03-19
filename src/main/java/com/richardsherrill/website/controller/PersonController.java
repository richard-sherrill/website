package com.richardsherrill.website.controller;

import com.richardsherrill.website.model.Person;
import com.richardsherrill.website.service.PersonService;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for person related endpoints
 */
@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(final PersonService personService) {
        this.personService = personService;
    }

    /**
     * Method to retrieve personal information
     *
     * @return the Person object
     */
    @GetMapping("/person")
    public Person getPerson(@RequestParam Long id) {
        // call service to retrieve personal info
        return personService.retrievePerson(id);
    }
}
