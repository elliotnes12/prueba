package com.hospital.hospital.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.models.request.ConsultorioRequest;
import com.hospital.hospital.services.ConsultorioServiceImpl;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/consultorio")
@Validated
public class ConsultorioController {


    @Autowired
    private ConsultorioServiceImpl Consultorio;

    @PostMapping("/agregar")
    public ResponseEntity<String> agregarConsultorio(@Valid @RequestBody ConsultorioRequest consultorio) {
      
        Consultorio.add(consultorio);
        return ResponseEntity.status(HttpStatus.CREATED).body("Consultorio agregado correctamente");
    }

}
