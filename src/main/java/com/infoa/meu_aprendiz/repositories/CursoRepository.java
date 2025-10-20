package com.senai.infoa.meu_aprendiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senai.infoa.meu_aprendiz.models.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Interger>{

}