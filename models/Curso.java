package com.infoa.meu_aprendiz.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// Curso.java 
// O model mais importante
@Entity
@Table(name="curso")
public class Curso {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="curso_id")
    private int idCurso;

    @Column(name="nome")
    private String nome;

    @Column(name="duracao_horas")
    private float duracaoHoras;

    @Column(name="avaliacao")
    private float avaliacao;

    @Column(name="descricao")
    private String descricao;

    @Column(name="preco")
    private double preco;

    @Column(name="nivel")
    private String nivel;

    //Foreign key
    @OneToMany
    @JoinColumn(name="endereco_id")
    private Endereco endereco;

    public Curso() {}

    public Curso(int idCurso, String nome, float duracaoHoras, float avaliacao, String descricao, double preco,
            String nivel, Endereco endereco) {
        this.idCurso = idCurso;
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
        this.avaliacao = avaliacao;
        this.descricao = descricao;
        this.preco = preco;
        this.nivel = nivel;
        this.endereco = endereco;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
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

    public Endereco getIdEndereco() {
        return endereco;
    }

    public void setIdEndereco(Endereco endereco) {
        this.endereco = endereco;
    }    
}
