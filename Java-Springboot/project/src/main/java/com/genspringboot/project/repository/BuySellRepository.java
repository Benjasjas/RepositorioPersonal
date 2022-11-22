package com.genspringboot.project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.genspringboot.project.model.BuySell;

public interface BuySellRepository extends JpaRepository<BuySell, Integer>{
    
    @Query(value = "SELECT * FROM BuySell WHERE monto > ?1}", nativeQuery = true)
    List<BuySell> findAllmontoBuySell(int monto);

    @Query(value = "SELECT * FROM BuySell WHERE fechaCompra > ?1 AND fechaCompra < ?2", nativeQuery = true)
    List<BuySell> findAllfechaCompraBuySell(Date fechaCompra);
}
