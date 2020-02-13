package com.wolf.queston.domain.enums;


public enum TipoPergunta {

    UNICA(1, "ùnica"), MULTIPLA_ESCOLHA(2, "Multipla Escolha");

    private int cod;
    private String descricao;

    private TipoPergunta(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }
}
