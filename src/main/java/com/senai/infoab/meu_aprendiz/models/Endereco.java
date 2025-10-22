package com.senai.infoab.meu_aprendiz.models;

// Endereco.java
public class Endereco {
    private int idEndereco;
    private String nome;
    private String cep;
    private String cidade;
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
