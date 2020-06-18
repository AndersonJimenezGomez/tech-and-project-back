package com.tech.and.project.tech.and.project.persistence;

import com.tech.and.project.tech.and.project.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
