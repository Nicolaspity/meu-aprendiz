package com.infoa.meu_aprendiz.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


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

    public Vaga(int idVagas, String nome, String descricao, double salario, int idProvedor, int idEndereco) {
        this.idVagas = idVagas;
        this.nome = nome;
        this.descricao = descricao;
        this.salario = salario;
        this.idProvedor = idProvedor;
        this.idEndereco = idEndereco;
    }

    public int getIdVagas() {
        return idVagas;
    }

    public void setIdVagas(int idVagas) {
        this.idVagas = idVagas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    

    

    
}
