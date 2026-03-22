package com.java10x.CadastroApi.Dentista;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.java10x.CadastroApi.Agenda.AgendaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_dentista")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DentistaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String especialidade;

    // Um dentista atende várias agendas
    @OneToMany(mappedBy = "dentista")
    @JsonIgnore
    private List<AgendaModel> agendas;


}