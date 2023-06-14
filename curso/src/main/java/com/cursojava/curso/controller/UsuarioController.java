package com.cursojava.curso.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.models.Usuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}", method = RequestMethod.GET)
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

    @RequestMapping(value = "usuarios")
    public List<Usuario> mostrar() {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Juan");
        usuario.setApellido("Perfasfez");
        usuario.setEmail("kenaa@example.com");
        usuario.setTelefono("123456789");
        usuario.setPassword("123456");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2);
        usuario2.setNombre("Juan");
        usuario2.setApellido("Perez");
        usuario2.setEmail("kenaa@example.com");
        usuario2.setTelefono("123456789");
        usuario2.setPassword("123456");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3);
        usuario3.setNombre("saf");
        usuario3.setApellido("Pefasfrez");
        usuario3.setEmail("kenaa@example.com");
        usuario3.setTelefono("123456789");
        usuario3.setPassword("123456");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

}