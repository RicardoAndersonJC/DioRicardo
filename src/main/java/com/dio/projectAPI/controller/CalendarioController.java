package com.dio.projectAPI.controller;

import com.dio.projectAPI.Service.CalendarioService;
import com.dio.projectAPI.model.Calendario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/calendarios")
public class CalendarioController {
    @Autowired
    CalendarioService calendarioService;
    @PostMapping
    public Calendario saveCalendario(@RequestBody Calendario calendario){
        return calendarioService.saveCalendario(calendario);
    }
    @GetMapping
    public List<Calendario> getUsuariosList(){
        return calendarioService.findAll();
    }
    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> getCalendarioById(@PathVariable("idCalendario") long idCalendario) throws Exception{
        return ResponseEntity.ok(calendarioService.findById(idCalendario).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idCalendario}")
    public void delCalendario(@PathVariable("idCalendario") long idCalendario){
        calendarioService.delId(idCalendario);
    }
    @PutMapping
    public Calendario updateCalendario(@RequestBody Calendario calendario){
        return calendarioService.updateCalendario(calendario);
    }
}
