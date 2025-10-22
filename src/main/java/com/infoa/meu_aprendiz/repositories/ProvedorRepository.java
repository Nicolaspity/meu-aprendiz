package com.infoa.meu_aprendiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.infoa.meu_aprendiz.models.Provedor;

@Repository
public interface ProvedorRepository extends JpaRepository<Provedor, Integer>{

}