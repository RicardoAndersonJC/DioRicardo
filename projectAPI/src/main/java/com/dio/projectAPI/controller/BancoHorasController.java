package com.dio.projectAPI.controller;

import com.dio.projectAPI.Service.BancoHorasService;
import com.dio.projectAPI.model.BancoHoras;
import com.dio.projectAPI.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/usuarios")
public class BancoHorasController {
    @Autowired
    BancoHorasService bancoHorasService;
    @PostMapping
    public BancoHoras saveBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.saveJornada(bancoHoras);
    }
    @GetMapping
    public List<Usuario> getUsuariosList(){
        return bancoHorasService.findAll();
    }
    @GetMapping("{idUser}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("idUsuario") long idUsuario) throws Exception{
        return ResponseEntity.ok(bancoHorasService.findById(idUsuario).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idUser}")
    public void delUsuario(@PathVariable("idUser") long idUser){
        bancoHorasService.delId(idUser);
    }
    @PutMapping
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return bancoHorasService.updateUsuario(usuario);
    }
}
