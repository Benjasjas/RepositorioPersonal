package com.genspringboot.project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.genspringboot.project.model.License;

public interface LicenseRepository extends JpaRepository<License, Integer>{
    
    @Query(value = "SELECT * FROM licenses WHERE clase = ?1", nativeQuery = true)
    List<License> findAllClaseLicencia(String clase);

    @Query(value = "SELECT * FROM licenses WHERE estado = ?1", nativeQuery = true)
    List<License> findAllEstadoLicencia(String estado);

    @Query (value = "SELECT * FROM licenses WHERE fechaVencimiento > ?1", nativeQuery = true)
    List<License> findAllfechaVencimientoLicencia(Date fechaVencimiento);
}
