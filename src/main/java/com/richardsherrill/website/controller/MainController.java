package com.richardsherrill.website.controller;

import com.richardsherrill.website.model.PersonalInfo;
import com.richardsherrill.website.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/")
    public String index() {
        return "Howdy";
    }

    /**
     * Method to retrieve personal information
     *
     * @return the PersonalInfo object
     */
    @GetMapping("/person")
    public PersonalInfo getPersonalInfo(@RequestParam Long id) {
        // call service to retrieve personal info
        return mainService.retrievePersonalInfo(id);
    }
}
