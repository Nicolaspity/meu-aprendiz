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
@Table(name="provedor")
public class Provedor {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idProvedor")
    private int idProvedor;

    @Column(name="nome")
    private String nome;

    @Column(name="cnpj")
    private String cnpj;

    

    
}
