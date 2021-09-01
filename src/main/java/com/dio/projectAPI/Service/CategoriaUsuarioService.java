package com.dio.projectAPI.Service;

import com.dio.projectAPI.Repository.CategoriaUsuarioRepository;
import com.dio.projectAPI.model.CategoriaUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {
    @Autowired
    CategoriaUsuarioRepository categoriaUsuarioRepository;


    public CategoriaUsuario saveCategoria(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }

    public List<CategoriaUsuario> findAll(){
        return categoriaUsuarioRepository.findAll();
    }
    public Optional<CategoriaUsuario> findById(long id){
        return categoriaUsuarioRepository.findById(id);
    }
    public void delId(long id){
        categoriaUsuarioRepository.deleteById(id);
    }
    public CategoriaUsuario updateCategoria(CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepository.save(categoriaUsuario);
    }
}
