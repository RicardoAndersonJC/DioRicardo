package com.dio.projectAPI.DTO;

import com.dio.projectAPI.model.CategoriaUsuario;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class DtotoObject {

    private Long id;
    @NotBlank(message = "Descricao não pode ser nulo")
    private String descricao;
    public  CategoriaUsuario categoriaObject(){
        return new CategoriaUsuario(id,descricao);
    }
}
