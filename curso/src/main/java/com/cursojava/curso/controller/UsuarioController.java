package com.cursojava.curso.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class UsuarioController {
    @RequestMapping(value="prueba", method=RequestMethod.GET)
    public String prueba() {
        return "prueba";
    }
}