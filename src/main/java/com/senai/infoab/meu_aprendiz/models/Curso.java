package com.senai.infoab.meu_aprendiz.models;

// Curso.java
public class Curso {
    private int idCurso;
    private String nome;
    private float duracaoHoras;
    private float avaliacao;
    private String descricao;
    private double preco;
    private String nivel;
    private int idEndereco;

    public Curso() {}

    public Curso(String nome, float duracaoHoras, float avaliacao, String descricao, double preco, String nivel, int idEndereco) {

        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
        this.avaliacao = avaliacao;
        this.descricao = descricao;
        this.preco = preco;
        this.nivel = nivel;
        this.idEndereco = idEndereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(float duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }
}
