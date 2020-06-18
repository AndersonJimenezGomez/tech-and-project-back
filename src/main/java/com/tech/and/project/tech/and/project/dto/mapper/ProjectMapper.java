package com.tech.and.project.tech.and.project.dto.mapper;

import com.tech.and.project.tech.and.project.dto.CustomerDto;
import com.tech.and.project.tech.and.project.dto.DeveloperDto;
import com.tech.and.project.tech.and.project.dto.ProjectDto;
import com.tech.and.project.tech.and.project.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProjectMapper {

    @Autowired
    DeveloperMapper developerMapper;

    @Autowired
    CustomerMapper customerMapper;

    public ProjectDto buildProject(Project project){

        ProjectDto projectDto = new ProjectDto();
        projectDto.setProjectId(project.getIdProject());
        CustomerDto customerDto = customerMapper.buildCustomer(project.getCustomer());
        DeveloperDto developerDto = developerMapper.buildDeveloperDto(project.getDeveloper());
        projectDto.setCustomerDto(customerDto);
        projectDto.setDeveloperDto(developerDto);
        projectDto.setProjectDescription(project.getProjectDescription());
        return projectDto;

    }

    public List<ProjectDto> buildListProject(List<Project> projects){
        List<ProjectDto> projectsDto = new ArrayList<>();
        projects.stream().forEach(project->{
            ProjectDto projectDto;
            projectDto = buildProject(project);
            projectsDto.add(projectDto);
        });
        return projectsDto;
    }
}
