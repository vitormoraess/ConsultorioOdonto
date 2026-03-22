package com.java10x.CadastroApi.Pacientes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.java10x.CadastroApi.Agenda.AgendaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "tb_paciente")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PacienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @Column(unique = true)
    private String telefone;
    private LocalDate dataAniversario;
    @Column(unique = true)
    private String cpf;

    // Um paciente pode ter várias agendas
    @OneToMany(mappedBy = "paciente")
    @JsonIgnore // evita loop infinito no JSON
    private List<AgendaModel> agendas;

}
