package com.dio.projectAPI.Repository;

import com.dio.projectAPI.model.CategoriaUsuario;
import com.dio.projectAPI.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {

}
