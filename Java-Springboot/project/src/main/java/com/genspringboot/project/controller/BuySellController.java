package com.genspringboot.project.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.project.model.BuySell;
import com.genspringboot.project.service.BuySellService;

@RestController
@CrossOrigin("*")
public class BuySellController {
    
    private BuySellService buySellService;
    
    public BuySellController(@Autowired BuySellService buySellService) {
        this.buySellService = buySellService;
    }

    @PostMapping(value = "/BuySell/save", consumes = {"application/json"})
    public void guardarBuySell(@RequestBody BuySell buySell){
        buySellService.saveBuySell(buySell);
    }

    @PostMapping("/Buysell/update")
    public void updateBuySell(@RequestBody BuySell buySell){
        buySellService.updateBuySell(buySell);
    }

    @GetMapping("/BuySell/findAll")
    public List<BuySell> todosLosBuySell(){
        return buySellService.findAll();
    }

    @GetMapping("/BuySell/buscarMonto/{monto}")
    public List<BuySell> buscarMonto(@PathVariable int monto){
        return buySellService.buscarPorMonto(monto);
    }

    @GetMapping("/BuySell/buscarPorFechaCompra/{fechaCompra}")
    public List<BuySell> buscarFechaCompra(@PathVariable Date fechaCompra){
        return buySellService.buscarPorfechaCompra(fechaCompra);
    }
}
