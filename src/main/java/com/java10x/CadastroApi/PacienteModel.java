package com.java10x.CadastroApi;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_cadastro")
public class PacienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String telefone;
    private int idade;
    private LocalDate dataAniversario;

    public PacienteModel() {
    }

    public PacienteModel(LocalDate dataAniversario, int idade, String telefone, String nome) {
        this.dataAniversario = dataAniversario;
        this.idade = idade;
        this.telefone = telefone;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
}
