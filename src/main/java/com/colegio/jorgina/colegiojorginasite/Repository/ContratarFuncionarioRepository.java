package com.colegio.jorgina.colegiojorginasite.Repository;

import com.colegio.jorgina.colegiojorginasite.model.ContratarFuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratarFuncionarioRepository extends JpaRepository<ContratarFuncionarioModel, Integer> {

    // Consulta de login
    boolean existsByMatriculaAndNome(Integer matricula, String nome);
}
