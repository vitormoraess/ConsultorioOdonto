package com.java10x.CadastroApi.Pacientes;

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
    private LocalDate dataAniversario;
    private String cpf;


    public PacienteModel() {
    }


    public PacienteModel(String nome, String cpf, String telefone, LocalDate dataAniversario) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataAniversario = dataAniversario;
    }

    // GETTERS E SETTERS

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataAniversario() {
        return dataAniversario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}