package com.cursojava.curso.controllers;


import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
            Usuario usuario = new Usuario();
            usuario.setId(id);
            usuario.setNombre("Jose");
            usuario.setApellido("Bravo");
            usuario.setEmail("jose@mail.com");
            usuario.setTelefono("12321412");
        return usuario;
    }

    @RequestMapping(value = "usuario12")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jose");
        usuario.setApellido("Bravo");
        usuario.setEmail("jose@mail.com");
        usuario.setTelefono("12321412");
        return usuario;
    }

    @RequestMapping(value = "usuario34")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jose");
        usuario.setApellido("Bravo");
        usuario.setEmail("jose@mail.com");
        usuario.setTelefono("12321412");
        return usuario;
    }

    @RequestMapping(value = "usuario56")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jose");
        usuario.setApellido("Bravo");
        usuario.setEmail("jose@mail.com");
        usuario.setTelefono("12321412");
        return usuario;
    }

}
