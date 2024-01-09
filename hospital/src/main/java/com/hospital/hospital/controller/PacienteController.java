package com.hospital.hospital.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.models.request.PacienteRequest;
import com.hospital.hospital.services.PacientesServiceImpl;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/paciente")
@Validated
public class PacienteController {


    @Autowired
    private PacientesServiceImpl Consultorio;

    @PostMapping("/agregar")
    public ResponseEntity<String> agregarPaciente(@Valid @RequestBody PacienteRequest paciente) {
      
        Consultorio.add(paciente);
        return ResponseEntity.status(HttpStatus.CREATED).body("Paciente agregado correctamente");
    }

}
