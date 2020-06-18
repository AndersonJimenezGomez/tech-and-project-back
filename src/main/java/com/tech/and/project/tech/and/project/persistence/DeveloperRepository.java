package com.tech.and.project.tech.and.project.persistence;


import com.tech.and.project.tech.and.project.model.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer,String> {

    /*@Query("SELECT C FROM Cliente C WHERE C.id.tipoIdCliente = :tipoDocumento AND C.id.idCliente = :numeroDocumento")
    Cliente obtenerCliente(@Param("tipoDocumento") String tipoDocumento, @Param("numeroDocumento") String numeroDocumento);*/
}
