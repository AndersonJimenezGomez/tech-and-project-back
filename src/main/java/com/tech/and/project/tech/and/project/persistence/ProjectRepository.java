package com.tech.and.project.tech.and.project.persistence;

import com.tech.and.project.tech.and.project.model.Customer;
import com.tech.and.project.tech.and.project.model.Developer;
import com.tech.and.project.tech.and.project.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    List<Project> findByCustomer(Customer customer);
    List<Project> findByDeveloper(Developer developer);
}
