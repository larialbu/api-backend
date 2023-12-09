package com.example.oxeqarti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.oxeqarti.model.Usuario;
import com.example.oxeqarti.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @GetMapping("/email/{email}")
    public Usuario encontrarUsuarioPorEmail(@PathVariable String email) {
        return usuarioService.encontrarUsuarioPorEmail(email);
    }

}
