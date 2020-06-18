package com.tech.and.project.tech.and.project.service;

import com.tech.and.project.tech.and.project.dto.ProjectDto;
import com.tech.and.project.tech.and.project.model.Customer;
import com.tech.and.project.tech.and.project.model.Developer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {

    List<ProjectDto> getAllProjects();

    List<ProjectDto> getProjectsByCustomer(Long customerId);

    List<ProjectDto> getProjectsByDeveloper(String developerId,String idType);
}
