package com.colegio.jorgina.colegiojorginasite.model.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "logsFuncionarios")
public class LogFuncionario {

    @Id
    private int matricula;
    private String usuario;
    private String senha;

}
