package com.dio.projectAPI.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Empresa {
    @Id
    private long codigo;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairo;
    private String cidade;
    private String estado;
    private String telefone;
}
