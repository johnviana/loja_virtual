package com.lojavirtual.apploja.domain.model;


import jakarta.persistence.*;

import java.util.Objects;

@Table(name = "nota_item_produto")
@Entity
@SequenceGenerator(name = "seq_nota_item_produto",sequenceName = "seq_nota_item_produto", initialValue = 1, allocationSize = 1)
public class NotaItemProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_nota_item_produto")
    private Long id;

    @Column(nullable = false)
    private Double quantidade;

    @ManyToOne
    @JoinColumn( name = "nota_fiscal_pronta_id", nullable = false, foreignKey =
    @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_pronta_fk"))
    private NotaFiscalPronta notaFiscalPronta;

    @ManyToOne
    @JoinColumn( name = "produto_id",nullable = false, foreignKey =
    @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
    private Produto produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public NotaFiscalPronta getNotaFiscalPronta() {
        return notaFiscalPronta;
    }

    public void setNotaFiscalPronta(NotaFiscalPronta notaFiscalPronta) {
        this.notaFiscalPronta = notaFiscalPronta;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotaItemProduto that = (NotaItemProduto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
