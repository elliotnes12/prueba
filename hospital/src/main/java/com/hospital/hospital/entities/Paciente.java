package com.hospital.hospital.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@Entity
@Table(name="pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rfc;

    private String nombre;

    @Column(name = "segundo_nombre")
    private String segundoNombre;

    private Integer edad;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    private boolean activo;

    @PrePersist
    protected void onCreate() {
        createAt = new Date();
    }
}
