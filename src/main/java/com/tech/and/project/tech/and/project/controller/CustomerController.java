package com.tech.and.project.tech.and.project.controller;

import com.tech.and.project.tech.and.project.config.SystemParameter;
import com.tech.and.project.tech.and.project.dto.CustomerDto;
import com.tech.and.project.tech.and.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(SystemParameter.BASE_PATH+"/customers")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/")
    public List<CustomerDto> getAllCustomers(){
        return customerService.listAll();
    }
}
