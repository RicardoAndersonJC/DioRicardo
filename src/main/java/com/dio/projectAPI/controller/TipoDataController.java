package com.dio.projectAPI.controller;

import com.dio.projectAPI.Service.TipoDataService;
import com.dio.projectAPI.model.TipoData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/tipodata")
public class TipoDataController {
    @Autowired
    TipoDataService tipoDataService;
    @PostMapping
    public TipoData saveTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.saveTipoData(tipoData);
    }
    @GetMapping
    public List<TipoData> getTipoDataList(){
        return tipoDataService.findAll();
    }
    @GetMapping("/{idTipoData}")
    public ResponseEntity<TipoData> getTipoDataById(@PathVariable("idTipoData") long idUsuario) throws Exception{
        return ResponseEntity.ok(tipoDataService.findById(idUsuario).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idTipoData}")
    public void delTipoData(@PathVariable("idTipoData") long idTipoData){
        tipoDataService.delId(idTipoData);
    }
    @PutMapping
    public TipoData updateTipoData(@RequestBody TipoData tipoData){
        return tipoDataService.updateTipoData(tipoData);
    }
}
