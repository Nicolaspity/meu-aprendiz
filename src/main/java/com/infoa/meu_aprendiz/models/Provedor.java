package com.infoa.meu_aprendiz.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

    public Provedor() {
    }

    public Provedor(int idProvedor, String nome, String cnpj) {
        this.idProvedor = idProvedor;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    

    

    
}
