package com.colegio.jorgina.colegiojorginasite.service;

import com.colegio.jorgina.colegiojorginasite.model.Entity.LogFuncionario;
import com.colegio.jorgina.colegiojorginasite.model.LogFuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogFuncionarioService {

    @Autowired
    private LogFuncionarioRepository logFuncionarioRepository;

    public boolean verificarLogin(int matricula, String senha){
        LogFuncionario logFuncionario = logFuncionarioRepository.findById(matricula).orElse(null);

        if (logFuncionario != null && logFuncionario.getSenha().equals(senha)){
            return true;
        } else {
            return false;
        }
    }
}
