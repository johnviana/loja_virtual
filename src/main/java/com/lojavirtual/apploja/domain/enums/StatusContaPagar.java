package com.lojavirtual.apploja.domain.enums;

public enum StatusContaPagar {

    COBRANCA("Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("Quitada"),
    ALUGUEL("Aluguel"),
    FUNCIONARIO("Funcionario"),
    NEGOCIADA("Re-Negociada");

    private String descricao;

    private StatusContaPagar(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public String toString(){
        return this.descricao;
    }

}
