package com.tech.and.project.tech.and.project.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProjectDto {

    private long projectId;
    private DeveloperDto developerDto;
    private CustomerDto customerDto;
    private String projectDescription;
}
