package com.dio.projectAPI.controller;

import com.dio.projectAPI.Service.EmpresaService;
import com.dio.projectAPI.model.Empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    EmpresaService empresaService;
    @PostMapping
    public Empresa saveEmpresa(@RequestBody Empresa empresa){
        return empresaService.saveEmpresa(empresa);
    }
    @GetMapping
    public List<Empresa> getEmpresaList(){
        return empresaService.findAll();
    }
    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaById(@PathVariable("idEmpresa") long idEmpresa) throws Exception{
        return ResponseEntity.ok(empresaService.findById(idEmpresa).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idEmpresa}")
    public void delEmpresa(@PathVariable("idEmpresa") long idEmpresa){
        empresaService.delId(idEmpresa);
    }
    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa){
        return empresaService.updateEmpresa(empresa);
    }
}
