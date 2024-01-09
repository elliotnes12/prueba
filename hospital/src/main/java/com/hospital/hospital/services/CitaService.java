package com.hospital.hospital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital.entities.Paciente;
import com.hospital.hospital.repositories.CitaRepository;

import java.util.Date;
import java.util.List;

@Service
public class CitaService {

    private final CitaRepository citaRepository;

    @Autowired
    public CitaService(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    public List<Paciente> buscarPacientePorRFCYFecha(String rfcPaciente, Date fechaConsulta) {
        return citaRepository.buscarPacientePorRFCYFecha(rfcPaciente, fechaConsulta);
    }
}