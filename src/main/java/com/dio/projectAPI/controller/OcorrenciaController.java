package com.dio.projectAPI.controller;

import com.dio.projectAPI.Service.OcorrenciaService;
import com.dio.projectAPI.model.Ocorrencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/ocorrencias")
public class OcorrenciaController {
    @Autowired
    OcorrenciaService ocorrenciaService;
    @PostMapping
    public Ocorrencia saveOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.saveOcorrencia(ocorrencia);
    }
    @GetMapping
    public List<Ocorrencia> getOcorrenciaList(){
        return ocorrenciaService.findAll();
    }
    @GetMapping("/{idOcorrencia}")
    public ResponseEntity<Ocorrencia> getOcorrenciaById(@PathVariable("idOcorrencia") long idOcorrencia) throws Exception{
        return ResponseEntity.ok(ocorrenciaService.findById(idOcorrencia).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idOcorrencia}")
    public void delOcorrencia(@PathVariable("idOcorrencia") long idOcorrencia){
        ocorrenciaService.delId(idOcorrencia);
    }
    @PutMapping
    public Ocorrencia updateOcorrencia(@RequestBody Ocorrencia ocorrencia){
        return ocorrenciaService.updateOcorrencia(ocorrencia);
    }
}
