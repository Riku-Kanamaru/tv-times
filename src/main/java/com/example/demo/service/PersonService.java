package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.mapper.PersonMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonMapper personMapper;

    public PersonService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public List<Person> findAll() {
        return personMapper.findAll();
    }

    public void insert(Person person) {
        personMapper.insert(person);
    }
}
