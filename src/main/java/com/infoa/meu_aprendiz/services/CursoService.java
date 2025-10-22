package com.infoa.meu_aprendiz.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infoa.meu_aprendiz.models.Curso;
import com.infoa.meu_aprendiz.repositories.CursoRepository;
import java.util.List;

@Service
public class CursoService {
    
    @Autowired
    CursoRepository cursoRepository;
    
    public Long contador() {
        return cursoRepository.count();
    };

    public Curso salvar(Curso curso){
        return cursoRepository.save(curso);
    }
    public List<Curso> listarCursos(){
        return cursoRepository.findAll();
    }
}


