package com.infoa.meu_aprendiz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoa.meu_aprendiz.models.Usuario;
import com.infoa.meu_aprendiz.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    public boolean login(String email, String cpf) {
        Usuario usuario = usuarioRepository.findByEmailAndCpf(email, cpf);
        return usuario != null;
    }

    public Usuario cadastrarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}

