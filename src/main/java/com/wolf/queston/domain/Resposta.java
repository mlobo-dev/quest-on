package com.wolf.queston.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "tbl_resposta")
public class Resposta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cod_resposta")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "selecionada")
    private boolean selecionada;

    @Column(name = "valor")
    private Double valor;
}
