package com.dio.projectAPI.Service;

import com.dio.projectAPI.Repository.UsuarioRepository;
import com.dio.projectAPI.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public Usuario saveUsuario(Usuario usuario) { return usuarioRepository.save(usuario); }
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> findById(long id){
        return usuarioRepository.findById(id);
    }
    public void delId(long id){
        usuarioRepository.deleteById(id);
    }
    public Usuario updateUsuario(Usuario usuario) {return usuarioRepository.save(usuario);}
}
