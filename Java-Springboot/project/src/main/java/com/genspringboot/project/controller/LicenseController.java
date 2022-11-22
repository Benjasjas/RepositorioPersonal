package com.genspringboot.project.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genspringboot.project.model.License;
import com.genspringboot.project.service.LicenseService;

@RestController
@CrossOrigin("*")
public class LicenseController {
    
    private LicenseService licenseService;

    public LicenseController(@Autowired LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @PostMapping(value = "/License/save", consumes = {"application/json"})
    public void guardarLicencia(@RequestBody License license){
        licenseService.saveLicense(license);
    }

    @PostMapping("/License/update")
    public void actualizarLicencia(@RequestBody License license){
        licenseService.updateLicense(license);
    }

    @GetMapping("/License/findAll")
    public List<License> todasLasLicencias(){
        return licenseService.findAll();
    }

    @GetMapping("/License/buscarClase/{clase}")
    public List<License> buscarClase(@PathVariable String clase){
        return licenseService.buscarPorClase(clase);
    }

    @GetMapping("/License/buscarEstado/{estado}")
    public List<License> buscarEstado(@PathVariable String estado){
        return licenseService.buscarPorEstado(estado);
    }

    @GetMapping("/License/buscarFechaVencimiento/{fechaVencimiento}")
    public List<License> buscarFechaVencimiento(@PathVariable Date fechaVencimiento){
        return licenseService.buscarPorFechaVencimiento(fechaVencimiento);
    }
}
