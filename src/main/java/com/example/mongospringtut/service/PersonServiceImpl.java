package com.example.mongospringtut.service;

import com.example.mongospringtut.model.Person;
import com.example.mongospringtut.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
    @Autowired
    private PersonRepository personRepository;
    @Override
    public String save(Person person) {
        return personRepository.save(person).getPersonId();
    }
}
