package com.dio.projectAPI.Repository;

import com.dio.projectAPI.model.Empresa;
import com.dio.projectAPI.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
