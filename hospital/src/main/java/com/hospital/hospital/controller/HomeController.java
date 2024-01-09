package com.hospital.hospital.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller("/home")
public class HomeController {
    

    public ModelAndView registrar(){
        return new ModelAndView("registrar");
    }
}
