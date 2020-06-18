package com.tech.and.project.tech.and.project.persistence;


import com.tech.and.project.tech.and.project.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer,String> {

    @Query(value = "SELECT D FROM Developer D WHERE D.id.idType = (:idType) AND D.id.developerId = (:developerId)")
    Developer getDeveloper(@Param("developerId") String developerId, @Param("idType") String idType);

}
