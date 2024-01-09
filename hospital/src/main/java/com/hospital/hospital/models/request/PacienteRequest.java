package com.hospital.hospital.models.request;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Validated
@Valid
public class PacienteRequest {
    
    @NotEmpty(message = "El nombre del paciente no puede estar en blanco")
    @NotNull
    private String nombre;

    @NotEmpty(message = "El segundo nombre del paciente no puede estar en blanco")
    @NotNull
    private String segundoNombre;

    @NotEmpty(message = "El rfc del paciente no puede estar en blanco")
    @NotNull
    private String rfc;

    @NotEmpty(message = "La edad del paciente no puede estar en blanco")
    @NotNull
    private Integer edad;

    
    private Boolean activo;

    
}
