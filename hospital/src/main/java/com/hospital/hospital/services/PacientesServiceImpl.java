package com.hospital.hospital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital.entities.Paciente;
import com.hospital.hospital.models.request.PacienteRequest;
import com.hospital.hospital.repositories.PacientesRepository;

@Service
public class PacientesServiceImpl implements HospitalService<PacienteRequest>{

    @Autowired
    private PacientesRepository repository;

    @Override
    public PacienteRequest add(PacienteRequest pacienteRequest) {
        Paciente paciente = new Paciente();
        
        paciente.setSegundoNombre(pacienteRequest.getSegundoNombre());
        paciente.setNombre(pacienteRequest.getNombre());
        paciente.setRfc(pacienteRequest.getRfc());
        paciente.setEdad(pacienteRequest.getEdad());
        paciente.setActivo(true);

        repository.save(paciente);
        return pacienteRequest;
    }
    
}
