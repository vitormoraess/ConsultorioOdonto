package com.java10x.CadastroApi.Dentista;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_dentista")
public class DentistaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String especialidade;


    public DentistaModel() {
    }

    public DentistaModel(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }


    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}