package com.lojavirtual.apploja.domain.enums;

public enum TipoEndereco {

    COBRANÇA("Cobrança"),
    ENTREGA("Entrega");

    private String descricao;

    private TipoEndereco(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
}
