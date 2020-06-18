package com.tech.and.project.tech.and.project.service;

import com.tech.and.project.tech.and.project.model.Developer;
import com.tech.and.project.tech.and.project.persistence.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperServiceImpl implements DeveloperService {

    @Autowired
    DeveloperRepository developerRepository;

    @Override
    public Developer getDeveloper(String developerId,String idType) {
        return developerRepository.getDeveloper(developerId,idType);
    }
}
