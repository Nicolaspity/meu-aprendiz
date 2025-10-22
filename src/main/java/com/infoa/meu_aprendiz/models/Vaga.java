package com.infoa.meu_aprendiz.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


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
    @ManyToOne
    @JoinColumn(name="provedor_id")
    private Provedor provedor;

    //Foreign key
    @ManyToOne
    @JoinColumn(name="endereco_id")
    private Endereco endereco;

    public Vaga() {}

    public Vaga(String nome, String descricao, double salario, Provedor provedor, Endereco endereco){
        this.nome = nome;
        this.descricao = descricao;
        this.salario = salario;
        this.provedor = provedor;
        this.endereco = endereco;
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

    public Provedor getProvedor() {
        return provedor;
    }

    public void setProvedor(Provedor provedor) {
        this.provedor = provedor;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }    
}
