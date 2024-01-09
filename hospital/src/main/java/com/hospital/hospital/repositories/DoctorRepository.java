package com.hospital.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.entities.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long>{
    
}
