package com.senai.infoa.meu_aprendiz.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;s
import java.util.Set;

// Vaga.java
@Entity
@Table(name="vaga")
public class Vaga {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idVaga")
    private int idVagas;

    @Column(name="nome")
    private String nome;

    @Column(name="descricao")
    private String descricao;

    @Column(name="salario")
    private double salario;

    //Foreign key
    @Column(name="idProvedor")
    private int idProvedor;

    //Foreign key
    @Column(name="idEndereco")
    private int idEndereco;

    public Vaga() {}

    

    
}
