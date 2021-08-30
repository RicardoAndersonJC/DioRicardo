package com.dio.projectAPI.controller;

import com.dio.projectAPI.Service.UsuarioService;
import com.dio.projectAPI.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuarios")
public class MovimentacaoController {
    @Autowired
    UsuarioService usuarioService;
    @PostMapping
    public Usuario saveUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }
    @GetMapping
    public List<Usuario> getUsuariosList(){
        return usuarioService.findAll();
    }
    @GetMapping("{idUser}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("idUsuario") long idUsuario) throws Exception{
        return ResponseEntity.ok(usuarioService.findById(idUsuario).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idUser}")
    public void delUsuario(@PathVariable("idUser") long idUser){
        usuarioService.delId(idUser);
    }
    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return usuarioService.updateUsuario(usuario);
    }
}
