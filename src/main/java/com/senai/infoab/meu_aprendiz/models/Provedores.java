package com.senai.infoab.meu_aprendiz.models;


public class Provedores {
    private int idProvedor;
    private String nome;
    private String cnpj;

    public Provedores() {}

    public Provedores(int idProvedor, String nome, String cnpj) {
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
