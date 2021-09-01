package com.dio.projectAPI.controller;

import com.dio.projectAPI.Service.MovimentacaoService;
import com.dio.projectAPI.model.Movimentacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/movimentacao")
public class MovimentacaoController {
    @Autowired
    MovimentacaoService movimentacaoService;
    @PostMapping
    public Movimentacao saveMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.saveMovimentacao(movimentacao);
    }
    @GetMapping
    public List<Movimentacao> getMovimentacaoList(){
        return movimentacaoService.findAll();
    }
    @GetMapping("/{idMovimentacao}")
    public ResponseEntity<Movimentacao> getMovimentacaoById(@PathVariable("idMovimentacao") long idMovimentacao) throws Exception{
        return ResponseEntity.ok(movimentacaoService.findById(idMovimentacao).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idMovimentacao}")
    public void delMovimentacao(@PathVariable("idMovimentacao") long idMovimentacao){
        movimentacaoService.delId(idMovimentacao);
    }
    @PutMapping
    public Movimentacao updateMovimentacao(@RequestBody Movimentacao movimentacao){
        return movimentacaoService.updateMovimentacao(movimentacao);
    }
}
