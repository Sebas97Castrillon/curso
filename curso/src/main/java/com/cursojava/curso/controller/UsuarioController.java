package com.cursojava.curso.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.models.Usuario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class UsuarioController {
    
    @RequestMapping(value="usuario/{id}", method=RequestMethod.GET)
    public Usuario obtenerUsuario(@PathVariable String id) {
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Juan");
        usuario.setApellido("Perez");
        usuario.setEmail("kenaa@example.com");
        usuario.setTelefono("123456789");
        usuario.setPassword("123456");
        return usuario;
    }

    // Crud usuario
    @RequestMapping(value="usuario", method=RequestMethod.POST)
    public Usuario crearUsuario(Usuario usuario) {
        return usuario;
    }
    
    @RequestMapping(value="usuario/{id}", method=RequestMethod.PUT)
    public Usuario actualizarUsuario(@PathVariable String id, Usuario usuario) {
        return usuario;
    }
    
    @RequestMapping(value="usuario/{id}", method=RequestMethod.DELETE)
    public void eliminarUsuario(@PathVariable String id) {
        
    }
    
}