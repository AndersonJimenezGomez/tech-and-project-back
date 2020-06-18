package com.tech.and.project.tech.and.project.service;

import com.tech.and.project.tech.and.project.dto.CustomerDto;
import com.tech.and.project.tech.and.project.dto.mapper.CustomerMapper;
import com.tech.and.project.tech.and.project.model.Customer;
import com.tech.and.project.tech.and.project.persistence.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomerDto> listAll() {
        return  customerMapper.buildCustomerList(customerRepository.findAll());
    }

    @Override
    public Customer findById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }
}
