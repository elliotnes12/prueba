package com.hospital.hospital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital.entities.Consultorio;
import com.hospital.hospital.models.request.ConsultorioRequest;
import com.hospital.hospital.repositories.ConsultorioRepository;

@Service
public class ConsultorioServiceImpl implements HospitalService<ConsultorioRequest>{

    @Autowired
    private ConsultorioRepository repository;

    @Override
    public ConsultorioRequest add(ConsultorioRequest consultorioRequest) {
        Consultorio consultorio = new Consultorio();
        consultorio.setActivo(consultorioRequest.getActivo());
        consultorio.setPiso(consultorioRequest.getPiso());
        repository.save(consultorio);
        return consultorioRequest;
    }
    
}
