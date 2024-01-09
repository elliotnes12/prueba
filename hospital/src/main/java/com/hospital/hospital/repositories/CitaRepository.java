package com.hospital.hospital.repositories;


import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.entities.Cita;
import com.hospital.hospital.entities.Paciente;

@Repository
public interface CitaRepository extends JpaRepository<Cita,Long>{
   

    @Query("SELECT c.paciente FROM Cita c WHERE c.paciente.rfc = :rfcPaciente AND c.fecha = :fechaConsulta")
    List<Paciente> buscarPacientePorRFCYFecha(@Param("rfcPaciente") String rfcPaciente, @Param("fechaConsulta") Date fechaConsulta);
}
