package com.tech.and.project.tech.and.project.dto.mapper;

import com.tech.and.project.tech.and.project.dto.CustomerDto;
import com.tech.and.project.tech.and.project.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CustomerMapper {

    public CustomerDto buildCustomer(Customer customer){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustomerId(customer.getCustomerId());
        customerDto.setCustomerName(customer.getCustomerName());
        return customerDto;
    }

    public List<CustomerDto> buildCustomerList(List<Customer> customers){
        List<CustomerDto> customersDto = new ArrayList<>();
        customers.forEach(customer -> {
            CustomerDto customerDto;
            customerDto = buildCustomer(customer);
            customersDto.add(customerDto);
        });
        return customersDto;
    }
}
