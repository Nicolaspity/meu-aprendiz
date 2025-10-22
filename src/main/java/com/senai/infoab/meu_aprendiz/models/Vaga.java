package com.senai.infoab.meu_aprendiz.models;

// Vaga.java
public class Vaga {
    private int idVagas;
    private String nome;
    private String descricao;
    private String jornada;
    private double salario;
    private int idProvedor;
    private int idEndereco;

    public Vaga() {}

    public Vaga(int idVagas, String nome, String descricao, String jornada, double salario, int idProvedor, int idEndereco) {
        this.idVagas = idVagas;
        this.nome = nome;
        this.descricao = descricao;
        this.jornada = jornada;
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

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
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
