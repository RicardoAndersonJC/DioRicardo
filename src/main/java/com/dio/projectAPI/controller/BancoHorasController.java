package com.dio.projectAPI.controller;

import com.dio.projectAPI.Service.BancoHorasService;

import com.dio.projectAPI.model.BancoHoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/bancos")
public class BancoHorasController {
    @Autowired
    BancoHorasService bancoHorasService;
    @PostMapping
    public BancoHoras saveBancoHoras(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.saveJornada(bancoHoras);
    }
    @GetMapping
    public List<BancoHoras> getBancoList(){
        return bancoHorasService.findAll();
    }
    @GetMapping("/{idBanco}")
    public ResponseEntity<BancoHoras> getBancoById(@PathVariable("idBanco") long idBanco) throws Exception{
        return ResponseEntity.ok(bancoHorasService.findById(idBanco).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idBanco}")
    public void delBanco(@PathVariable("idBanco") long idBanco){
        bancoHorasService.delId(idBanco);
    }
    @PutMapping
    public BancoHoras updateBanco(@RequestBody BancoHoras bancoHoras){
        return bancoHorasService.update(bancoHoras);
    }
}
