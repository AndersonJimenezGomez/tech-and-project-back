package com.tech.and.project.tech.and.project.service;

import com.tech.and.project.tech.and.project.dto.CustomerDto;
import com.tech.and.project.tech.and.project.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    List<CustomerDto> listAll();
    Customer findById(Long customerId);

}
