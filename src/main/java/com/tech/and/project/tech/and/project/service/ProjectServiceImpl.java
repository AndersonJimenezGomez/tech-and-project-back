package com.tech.and.project.tech.and.project.service;

import com.tech.and.project.tech.and.project.dto.ProjectDto;
import com.tech.and.project.tech.and.project.dto.mapper.ProjectMapper;
import com.tech.and.project.tech.and.project.model.Customer;
import com.tech.and.project.tech.and.project.model.Developer;
import com.tech.and.project.tech.and.project.persistence.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private ProjectMapper mapper;

    @Autowired
    private CustomerServiceImpl customerService;

    @Autowired
    private DeveloperService developerService;

    @Override
    public List<ProjectDto> getAllProjects() {
        return mapper.buildListProject(projectRepository.findAll());
    }

    @Override
    public List<ProjectDto> getProjectsByCustomer(Long customerId) {
        Customer customer = customerService.findById(customerId);
        return mapper.buildListProject(projectRepository.findByCustomer(customer));
    }

    @Override
    public List<ProjectDto> getProjectsByDeveloper(String developerId) {
        Developer developer = developerService.findDeveloperById(developerId);
        return mapper.buildListProject(projectRepository.findByDeveloper(developer));
    }
}
