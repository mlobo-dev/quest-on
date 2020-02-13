package com.wolf.queston.domain.dto;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Resposta {

    private Long id;
    private String descricao;
    private boolean selecionada;
    private Double valor;
}
