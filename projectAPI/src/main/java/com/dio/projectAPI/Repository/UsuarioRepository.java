package com.dio.projectAPI.Repository;

import com.dio.projectAPI.model.JornadaTrabalho;
import com.dio.projectAPI.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
