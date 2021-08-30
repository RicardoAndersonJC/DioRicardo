package com.dio.projectAPI.Repository;

import com.dio.projectAPI.model.JornadaTrabalho;
import com.dio.projectAPI.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {

}
