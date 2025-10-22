package com.senai.infoab.meu_aprendiz.models;

class Conta {
    private int id;
    private int idEndereco; //Foreign key
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String escolaridade;
    private String interesses;
    private String experiencias;

    public Conta(){}
    public Conta(int idEndereco, String nome, String email, String cpf, String telefone, String escolaridade, String interesses, String experiencias){
        this.idEndereco = idEndereco;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.escolaridade = escolaridade;
        this.interesses = interesses;
        this.experiencias = experiencias;
    }
    // Getters e setters
    public int getIdEndereco() {
        return this.idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getInteresses() {
        return this.interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public String getExperiencias() {
        return this.experiencias;
    }

    public void setExperiencias(String experiencias) {
        this.experiencias = experiencias;
    }

}