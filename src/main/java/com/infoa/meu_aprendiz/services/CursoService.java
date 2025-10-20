package com.infoa.meu_aprendiz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoa.meu_aprendiz.models.Curso;
import com.infoa.meu_aprendiz.repositories.CursoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    
    public Long contador() {
        return CursoRepository.count();
    };

               public Curso salvar (Curso estudante){
        return cursoRepository.save(estudante);
    }
}