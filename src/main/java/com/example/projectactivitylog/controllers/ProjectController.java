package com.example.projectactivitylog.controllers;

import com.example.projectactivitylog.dto.ProjectDto;
import com.example.projectactivitylog.entities.ProjectEntity;
import com.example.projectactivitylog.servicess.ProjectService;
import com.example.projectactivitylog.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectController {

    private List<ProjectEntity> projectsDB = List.of(new ProjectEntity(1, "test", "test", Constants.STATUS_ACTIVE),
                                                    new ProjectEntity(2, "test2", "Test2",Constants.STATUS_DONE),
                                                    new ProjectEntity(3, "test3", "test3", Constants.STATUS_STOPPED));
    private final ProjectService projectService;
    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/project/create")
    public ProjectDto createNewProject(@RequestBody ProjectDto projectDto) {
        return projectService.createNewProject(projectDto);
    }

    @GetMapping("/project/get/{id}")
    public ProjectDto getProject(@PathVariable int id) {
        return projectService.getProjectById(id);
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
