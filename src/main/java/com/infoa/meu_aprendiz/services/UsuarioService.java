package com.infoa.meu_aprendiz.services;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    public String cadastrar(UserDto user) {
        if (!user.getSenha().equals(user.getConfirmarSenha())) {
            return "As senhas não coincidem.";
        }

        return "Cadastro realizado com sucesso para " + user.getNome();
    }

    public boolean validateUser(UserLogin user) {
        return "admin".equals(user.getUsername()) && "1234".equals(user.getPassword());
    }
}

