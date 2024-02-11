package com.example.mongospringtut.controller;

import com.example.mongospringtut.model.Person;
import com.example.mongospringtut.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    public String save(@RequestBody Person person){
        return personService.save(person);
    }
}
