package com.dio.projectAPI.controller;

import com.dio.projectAPI.Service.LocalidadeService;
import com.dio.projectAPI.model.Localidade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/localidades")
public class LocalidadeController {
    @Autowired
    LocalidadeService localidadeService;
    @PostMapping
    public Localidade saveLocalidade(@RequestBody Localidade localidade){
        return localidadeService.saveLocalidade(localidade);
    }
    @GetMapping
    public List<Localidade> getLocalidadeList(){
        return localidadeService.findAll();
    }
    @GetMapping("/{idLocalidade}")
    public ResponseEntity<Localidade> getLocalidadeById(@PathVariable("idLocalidade") long idLocalidade) throws Exception{
        return ResponseEntity.ok(localidadeService.findById(idLocalidade).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idLocalidade}")
    public void delLocalidade(@PathVariable("idLocalidade") long idLocalidade){
        localidadeService.delId(idLocalidade);
    }
    @PutMapping
    public Localidade updateLocalidade(@RequestBody Localidade usuario){
        return localidadeService.updateLocalidade(usuario);
    }
}
