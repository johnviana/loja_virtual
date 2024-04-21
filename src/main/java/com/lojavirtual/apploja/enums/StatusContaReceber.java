package com.lojavirtual.apploja.enums;

public enum StatusContaReceber {

    COBRANÇA("Pagar"),
    VENCIDA("Vencida"),
    ABERTA("Aberta"),
    QUITADA("qUITADA");

    private String descricao;

    private StatusContaReceber(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString(){
        return this.descricao;
    }

}
