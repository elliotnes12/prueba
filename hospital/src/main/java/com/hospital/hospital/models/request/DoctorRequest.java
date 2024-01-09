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
public class DoctorRequest {
    
    @NotEmpty(message = "El nombre del doctor no puede estar en blanco")
    @NotNull
    private String nombre;

    @NotBlank(message = "El apellido paterno del doctor no puede estar en blanco")
    private String apellidoPaterno;

    @NotBlank(message = "El apellido materno del doctor no puede estar en blanco")
    private String apellidoMaterno;

    @NotBlank(message = "La especialidad del doctor no puede estar en blanco")
    private String especialidad;
}
