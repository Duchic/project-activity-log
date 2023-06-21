package com.example.projectactivitylog.controllers;

import com.example.projectactivitylog.entities.PersonEntity;
import com.example.projectactivitylog.entities.ProjectEntity;
import com.example.projectactivitylog.util.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class PersonController {

    private List<PersonEntity> personDB = List.of(new PersonEntity(1, "Jan", "Z Rokycan"),
            new PersonEntity(2, "Pavel", "Test"),
            new PersonEntity(3, "Dalsi", "Testovaci"));

    @PostMapping("/person/create")
    public String createNewPerson() {
        return "person";
    }

    @GetMapping("/person/get{id}")
    public String getPerson(@PathVariable int id) {
        return "person";
    }

    @GetMapping("/person")
    public List<PersonEntity> getAllPerson() {
        return personDB;
    }

    @PostMapping("/person/update/{id}")
    public String updatePerson(@PathVariable int id) {
        return "person";
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
