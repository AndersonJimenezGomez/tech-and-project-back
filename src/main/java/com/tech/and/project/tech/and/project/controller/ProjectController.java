package com.tech.and.project.tech.and.project.controller;

import com.tech.and.project.tech.and.project.config.SystemParameter;
import com.tech.and.project.tech.and.project.dto.ProjectDto;
import com.tech.and.project.tech.and.project.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(SystemParameter.BASE_PATH+"/projects")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @GetMapping("/customer")
    public List<ProjectDto> getProjectsByCustomer(@RequestParam("customerId")long customerId){
        return projectService.getProjectsByCustomer(customerId);
    }

}
