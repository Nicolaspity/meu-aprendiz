package com.infoa.meu_aprendiz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infoa.meu_aprendiz.models.Usuario;
import com.infoa.meu_aprendiz.services.UsuarioService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/cadastro")
    public String cadastrar(@RequestBody UserioDto userDto) {
        return usuarioService.cadastrar(userDto);
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UsuarioLogin user) {
        boolean success = loginService.validateUser(user);

        if (success) {
            return ResponseEntity.ok().body("{\"message\":\"Usuário " + user.getUsername() + " logado com sucesso!\"}");
        } else {
            return ResponseEntity.status(401).body("{\"error\":\"Credenciais inválidas!\"}");
        }
    }
}