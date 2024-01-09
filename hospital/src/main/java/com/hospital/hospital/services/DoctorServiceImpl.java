package com.hospital.hospital.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital.entities.Doctor;
import com.hospital.hospital.models.request.DoctorRequest;
import com.hospital.hospital.repositories.DoctorRepository;

@Service
public class DoctorServiceImpl implements HospitalService<DoctorRequest>{

    @Autowired
    private DoctorRepository repository;

    @Override
    public DoctorRequest add(DoctorRequest doctorRequest) {
        Doctor doctor = new Doctor();
        doctor.setApellidoMaterno(doctorRequest.getApellidoMaterno());
        doctor.setApellidoPaterno(doctorRequest.getApellidoMaterno());
        doctor.setEspecialidad(doctorRequest.getEspecialidad());
        doctor.setNombre(doctorRequest.getNombre());
        repository.save(doctor);
        return doctorRequest;
    }
    
}
