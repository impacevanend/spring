package com.cursojava.curso.controllers;


import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController  {

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



    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(234L);
        usuario.setNombre("Jose");
        usuario.setApellido("Bravo");
        usuario.setEmail("jose@mail.com");
        usuario.setTelefono("12321412");

        Usuario usuario2 = new Usuario();
        usuario2.setId(567L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Gonzales");
        usuario2.setEmail("maraigo@mail.com");
        usuario2.setTelefono("54542534");

        Usuario usuario3 = new Usuario();
        usuario3.setId(456L);
        usuario3.setNombre("Grabriel");
        usuario3.setApellido("Aliaga");
        usuario3.setEmail("alaiga124@mail.com");
        usuario3.setTelefono("4546546");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return  usuarios;
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
