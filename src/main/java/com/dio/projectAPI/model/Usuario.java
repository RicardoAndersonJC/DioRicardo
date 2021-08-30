package com.dio.projectAPI.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalTime;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    private long codigoUsuario;
    @ManyToOne
    private CategoriaUsuario codigoCategoria;
    private String nome;
    @ManyToOne
    private Empresa empresa;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal atraso;
    private LocalTime inicioJornada;
    private  LocalTime fimJornada;
}
