package com.cursojava.curso.controllers;


import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario")
    public Usuario getUsuario(){
            Usuario usuario = new Usuario();
            usuario.setNombre("Jose");
            usuario.setApellido("Bravo");
            usuario.setEmail("jose@mail.com");
            usuario.setTelefono("12321412");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jose");
        usuario.setApellido("Bravo");
        usuario.setEmail("jose@mail.com");
        usuario.setTelefono("12321412");
        return usuario;
    }

}
