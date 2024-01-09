package com.hospital.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.entities.Paciente;

@Repository
public interface PacientesRepository extends JpaRepository<Paciente,Long>{
    
}
