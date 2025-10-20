package com.senai.infoa.meu_aprendiz.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.Set;

// Curso.java 
// O model mais importante
@Entity
@Table(name="curso")
public class Curso {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idCurso")
    private int idCurso;

    @Column(name="nome")
    private String nome;

    @Column(name="duracaoHoras")
    private float duracaoHoras;

    @Column(name="avaliacao")
    private float avaliacao;

    @Column(name="descricao")
    private String descricao;

    @Column(name="preco")
    private double preco;

    @Column(name="nivel")
    private String nivel;

    //Foreign key
    @Column(name="endereco_id")
    private int idEndereco;

    public Curso() {}

    
}
