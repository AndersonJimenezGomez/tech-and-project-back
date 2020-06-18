package com.tech.and.project.tech.and.project.dto.mapper;

import com.tech.and.project.tech.and.project.dto.DeveloperDto;
import com.tech.and.project.tech.and.project.model.Developer;
import org.springframework.stereotype.Component;


@Component
public class DeveloperMapper {

    public DeveloperDto buildDeveloperDto(Developer developer){
        DeveloperDto developerDto = new DeveloperDto();
        developerDto.setDeveloperId(developer.getId().getDeveloperId());
        developerDto.setIdType(developer.getId().getIdType());
        developerDto.setEmail(developer.getEmail());
        developerDto.setName(developer.getDeveloperName());
        developerDto.setLastName(developer.getDeveloperLastName());
        return developerDto;
    }
}
