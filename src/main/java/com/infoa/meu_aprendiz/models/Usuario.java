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

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idUsuario")
    private int idUsuario;

    //Foreign key
    @Column(name="endereco_id")
    private int idEndereco; 

    @Column(name="nome")
    private String nome;

    @Column(name="email")
    private String email;

    @Column(name="cpf")
    private String cpf;

    @Column(name="telefone")
    private String telefone;

    @Column(name="escolaridade")
    private String escolaridade;

    @Column(name="interesses")
    private String interesses;

    @Column(name="experiencias")
    private String experiencias;

    public usuario(){}



}