package com.infoa.meu_aprendiz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infoa.meu_aprendiz.models.Curso;
import com.infoa.meu_aprendiz.services.CursoService;
import java.util.List;

@RestController
public class CursoController {
    
    @Autowired
        private CursoService cursoService;

    @GetMapping("curso/count")
    public Long contador(){
        return cursoService.contador();
    }

    @PostMapping("curso/salvar/{curso}")
    public Curso Salvar(@RequestBody Curso curso) {
        return cursoService.salvar(curso);
    }
    
    @GetMapping("curso/listar")
    public List<Curso> listarCursos(){
        return cursoService.listarCursos();
    }
}
