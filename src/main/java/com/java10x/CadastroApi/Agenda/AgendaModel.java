package com.java10x.CadastroApi.Agenda;

import com.java10x.CadastroApi.Dentista.DentistaModel;
import com.java10x.CadastroApi.Pacientes.PacienteModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_agenda")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AgendaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime data;

    // Muitas agendas para UM paciente
    @ManyToOne
    @JoinColumn(name = "paciente_id") //Foreign Key ou chave estrangeira
    private PacienteModel paciente;

    // Muitas agendas para UM dentista
    @ManyToOne
    @JoinColumn(name = "dentista_id")
    private DentistaModel dentista;

    private String status;
}

