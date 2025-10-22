package com.infoa.meu_aprendiz.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Endereco.java
@Entity
@Table(name="endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="endereco_id")
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

    

    public Endereco(int idEndereco, String nome, String cep, String cidade, String uf) {
        this.idEndereco = idEndereco;
        this.nome = nome;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }



    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }    
}
