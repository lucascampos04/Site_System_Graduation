package com.colegio.jorgina.colegiojorginasite.service;

import com.colegio.jorgina.colegiojorginasite.Repository.ContratarFuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContratarFuncionarioService {

    private final ContratarFuncionarioRepository repository;

    @Autowired
    public ContratarFuncionarioService(ContratarFuncionarioRepository repository){
        this.repository = repository;
    }

    // Consulta de login
    public boolean verificarMatricula(Integer matricula, String nome){
        return repository.existsByMatriculaAndNome(matricula, nome);
    }

}
