package com.genspringboot.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.genspringboot.project.model.CarSell;

public interface CarSellRepository extends JpaRepository<CarSell, Integer>{
    
    @Query(value = "SELECT * FROM CarSell WHERE cantidad < ?1}", nativeQuery = true)
    List<CarSell> findAllcantidadCarSells(int cantidad);
}
