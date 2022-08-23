package io.github.springdatarest.springdatarest.controllers;

import io.github.springdatarest.springdatarest.domains.Usuario;
import io.github.springdatarest.springdatarest.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario creatUsuer(@RequestBody Usuario usuario) {
        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return usuarioSalvo;
    }


}
