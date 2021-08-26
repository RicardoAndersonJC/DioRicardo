package com.dio.projectAPI.Repository;

import com.dio.projectAPI.model.Calendario;
import com.dio.projectAPI.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository extends JpaRepository<Calendario, Long> {

}
