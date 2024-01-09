package com.hospital.hospital.controller;
import com.hospital.hospital.entities.Paciente;
import com.hospital.hospital.services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class CitaController {

    private final CitaService citaService;

    @Autowired
    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }

    @GetMapping("/buscarPaciente")
    public ResponseEntity<List<Paciente>> buscarPacientePorRFCYFecha(
            @RequestParam("rfc") String rfc,
            @RequestParam("fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha) {
        List<Paciente> pacientes = citaService.buscarPacientePorRFCYFecha(rfc, fecha);
        return ResponseEntity.ok(pacientes);
    }
}