package com.java10x.CadastroApi.Agenda;

import com.java10x.CadastroApi.Dentista.DentistaModel;
import com.java10x.CadastroApi.Pacientes.PacienteModel;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_agenda")
public class AgendaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime data;


    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private PacienteModel paciente;


    @ManyToOne
    @JoinColumn(name = "dentista_id")
    private DentistaModel dentista;

    private String status;

    public AgendaModel() {
    }


    public AgendaModel(LocalDateTime data, PacienteModel paciente, DentistaModel dentista, String status) {
        this.data = data;
        this.paciente = paciente;
        this.dentista = dentista;
        this.status = status;
    }



    public Long getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public PacienteModel getPaciente() {
        return paciente;
    }

    public DentistaModel getDentista() {
        return dentista;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }

    public void setDentista(DentistaModel dentista) {
        this.dentista = dentista;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}