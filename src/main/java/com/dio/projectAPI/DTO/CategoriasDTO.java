package com.dio.projectAPI.DTO;

import com.dio.projectAPI.model.CategoriaUsuario;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CategoriasDTO {
   private Long id;
   private String descricao;

   public static CategoriasDTO categoriaResponseDTO(CategoriaUsuario categoriaUsuario){
       return new CategoriasDTO(categoriaUsuario.getId(),categoriaUsuario.getDescricao());
   }

}
