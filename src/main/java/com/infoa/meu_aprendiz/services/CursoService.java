package com.senai.infoa.meu_aprendiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.meu_aprendiz.models.Curso;
import com.senai.infoa.meu_aprendiz.repositories.CursoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserLogin;

@Service
public class CursoService {
    
    public Long contador() {
        return CursoRepository.count();
    };

               public Estudante salvar (Estudante estudante){
        return estudanteRepository.save(estudante);
    }
}