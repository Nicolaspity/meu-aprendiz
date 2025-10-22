package com.infoa.meu_aprendiz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.infoa.meu_aprendiz.models.Usuario;
import com.infoa.meu_aprendiz.services.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        boolean sucesso = usuarioService.login(usuario.getEmail(), usuario.getCpf())
        if (sucesso) {
            return ResponseEntity.ok("Usuário logado com sucesso!");
        }else {
            return ResponseEntity.status(401).body("Login ingalido");
     }
    }
    
    @PostMapping("/usuario/cadastrar")
    public ResponseEntity<String> cadastrarUsuario(@RequestBody Usuario usuario){
        try{
            usuarioService.cadastrarUsuario(usuario);
            return ResponseEntity.ok("Usuário Cadastrado com sucesso!");
        } catch (Exception e){
            return ResponseEntity.status(401).body("Falha ao cadastrar o usuário: " + e);
        }
    }
}