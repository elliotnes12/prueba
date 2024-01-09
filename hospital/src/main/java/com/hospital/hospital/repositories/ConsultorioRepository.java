package com.hospital.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.entities.Consultorio;

@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio,Long>{
    
}
