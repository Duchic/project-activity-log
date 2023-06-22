package com.example.projectactivitylog.servicess;

import com.example.projectactivitylog.dto.ProjectDto;
import com.example.projectactivitylog.entities.ProjectEntity;
import com.example.projectactivitylog.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    public ProjectDto getProjectById(int id) {
        Optional<ProjectEntity> byId = projectRepository.findById(id);
        ProjectDto projectDto = new ProjectDto();
        if (byId.isPresent()){
            projectDto.setId(byId.get().getId());
            projectDto.setName(byId.get().getName());//dodelat

            return projectDto;
        }
        return null;
    }

    public ProjectDto createNewProject(ProjectDto projectDto) {
        ProjectEntity projectEntity = new ProjectEntity();
        projectEntity.setName(projectDto.getName()); //dodelat

        projectRepository.save(projectEntity);
        projectDto.setId(projectEntity.getId());
        return projectDto;
    }

}
