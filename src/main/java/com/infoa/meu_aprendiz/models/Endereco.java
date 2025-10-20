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

// Endereco.java
@Entity
@Table(name="endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idEndereco")
    private int idEndereco;

    @Column(name="nome")
    private String nome;

    @Column(name="cep")
    private String cep;

    @Column(name="cidade")
    private String cidade;

    @Column(name="uf")
    private String uf;

    public Endereco() {}

    
}
