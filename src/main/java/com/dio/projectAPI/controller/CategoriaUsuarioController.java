package com.dio.projectAPI.controller;

import com.dio.projectAPI.DTO.CategoriasDTO;
import com.dio.projectAPI.DTO.DtotoObject;
import com.dio.projectAPI.Service.CategoriaUsuarioService;
import com.dio.projectAPI.model.CategoriaUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categorias")
public class CategoriaUsuarioController {
    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;
    @PostMapping
    public ResponseEntity<CategoriasDTO> saveCategoria(@RequestBody DtotoObject dtotoObject){
        CategoriaUsuario categoriaUsuario = categoriaUsuarioService.saveCategoria(dtotoObject.categoriaObject());
        return new ResponseEntity<>(CategoriasDTO.categoriaResponseDTO(categoriaUsuario), HttpStatus.CREATED);
    }
    @GetMapping
    public List<CategoriaUsuario> getCategoriaList(){
        return categoriaUsuarioService.findAll();
    }
    @GetMapping("/{idCategoria}")
    public ResponseEntity<CategoriaUsuario> getCategoriaById(@PathVariable("idCategoria") long idCategoria) throws Exception{
        return ResponseEntity.ok(categoriaUsuarioService.findById(idCategoria).orElseThrow(() -> new NoSuchElementException("Not Found")));
    }

    @DeleteMapping("/{idCategoria}")
    public void delCategoria(@PathVariable("idCategoria") long idCategoria){
        categoriaUsuarioService.delId(idCategoria);
    }
    @PutMapping
    public CategoriaUsuario updateCategoria(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoria(categoriaUsuario);
    }
}
