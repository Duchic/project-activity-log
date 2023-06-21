package com.example.projectactivitylog.controllers;

import com.example.projectactivitylog.entities.ProjectEntity;
import com.example.projectactivitylog.util.Constants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    private List<ProjectEntity> projectsDB = List.of(new ProjectEntity(1, "test", "test", Constants.STATUS_ACTIVE),
                                                    new ProjectEntity(2, "test2", "Test2",Constants.STATUS_DONE),
                                                    new ProjectEntity(3, "test3", "test3", Constants.STATUS_STOPPED));

    @PostMapping("/project/create")
    public String createNewProject() {
        return "project";
    }

    @GetMapping("/project/get{id}")
    public String getProject(@PathVariable int id) {
        return "project";
    }

    @GetMapping("/project")
    public List<ProjectEntity> getAllProjects() {
        return projectsDB;
    }

    @PostMapping("/project/update/{id}")
    public String updateProject(@PathVariable int id) {
        return "project";
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }
}
