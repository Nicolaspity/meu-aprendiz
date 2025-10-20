package com.senai.infoa.meu_aprendiz.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.meu_aprendiz.models.Curso;
import com.senai.infoa.meu_aprendiz.services.CursoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.example.demo.model.UserLogin;
import com.example.demo.service.LoginService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class CursoRepository {
    
    @Autowired
        private CursoService cursoService;

    @GetMapping("/count")
    public Long contador(){
        return CursoService.contador();
    };

   @PostMapping("/salvar/{curso}")
        public Curso Salvar(@RequestBody Curso curso) {
            return CursoService.salvar(curso);
        };
}
