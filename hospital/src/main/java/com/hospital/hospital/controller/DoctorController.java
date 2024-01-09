package com.hospital.hospital.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.hospital.models.request.DoctorRequest;
import com.hospital.hospital.services.DoctorServiceImpl;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/doctores")
@Validated
public class DoctorController {


    @Autowired
    private DoctorServiceImpl doctorService;

    @PostMapping("/agregar")
    public ResponseEntity<String> agregarDoctor(@Valid @RequestBody DoctorRequest doctor) {
      
        doctorService.add(doctor);
        return ResponseEntity.status(HttpStatus.CREATED).body("Doctor agregado correctamente");
    }

}
