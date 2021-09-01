package com.dio.projectAPI.controller;

import com.dio.projectAPI.Service.NivelAcessoService;
import com.dio.projectAPI.model.NivelAcesso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/acesso")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;
    @PostMapping
    public NivelAcesso saveAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.saveNivel(nivelAcesso);
    }
    @GetMapping
    public List<NivelAcesso> getAcessoList(){
        return nivelAcessoService.findAll();
    }
    @GetMapping("/{idAcesso}")
    public ResponseEntity<NivelAcesso> getAcessoById(@PathVariable("idAcesso") long idAcesso) throws Exception{
        return ResponseEntity.ok(nivelAcessoService.findById(idAcesso).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idAcesso}")
    public void delAcesso(@PathVariable("idAcesso") long idAcesso){
        nivelAcessoService.delId(idAcesso);
    }
    @PutMapping
    public NivelAcesso updateAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.updateNivelAcesso(nivelAcesso);
    }
}
