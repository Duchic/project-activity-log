package com.example.projectactivitylog.controllers;

import com.example.projectactivitylog.entities.ProjectEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    private List<ProjectEntity> projectsDB = List.of(new ProjectEntity(1, "test", "test", "test"));

    @PostMapping("/project/create")
    public String createNewProject() {
        return "project";
    }

    @GetMapping("/project/get{id}")
    public String getProject(@PathVariable int id) {
        return "project";
    }

    @GetMapping("/project")
    public List<ProjectEntity> get() {
        return projectsDB;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
