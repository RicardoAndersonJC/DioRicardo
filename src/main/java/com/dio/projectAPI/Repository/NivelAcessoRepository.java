package com.dio.projectAPI.Repository;

import com.dio.projectAPI.model.JornadaTrabalho;
import com.dio.projectAPI.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {

}
