package com.infoa.meu_aprendiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoa.meu_aprendiz.models.Usuario;
import com.infoa.meu_aprendiz.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    public boolean login(String email, String cpf) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public Usuario cadastrarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}

