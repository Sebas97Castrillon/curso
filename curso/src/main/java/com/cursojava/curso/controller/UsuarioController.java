package com.cursojava.curso.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class UsuarioController {
    
    @RequestMapping(value="prueba", method=RequestMethod.GET)
    public List<String> prueba() {
        return List.of("Manzana", "Kiwi", "Banana");
    }
}