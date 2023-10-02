package com.colegio.jorgina.colegiojorginasite.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTRATAR_FUNCIONARIO")
public class ContratarFuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long matricula;
    private String nome;
    private String telefone;
    private String funcao;
    private Float salario;

}
