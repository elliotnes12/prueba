package com.hospital.hospital.models.request;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Validated
@Valid
public class ConsultorioRequest {
    

    private Integer piso;

    private Boolean activo;
   
}
