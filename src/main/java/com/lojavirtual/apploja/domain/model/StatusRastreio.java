package com.lojavirtual.apploja.domain.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@SequenceGenerator(name = "seq_status_rastreio", sequenceName = "seq_status_rastreio", initialValue = 1, allocationSize = 1)
public class StatusRastreio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_status_rastreio")
    private Long id;

    private String centroDestribuicao;

    private String cidade;

    private String estado;

    private String Status;

    @ManyToOne
    @JoinColumn(name = "venda_compra_loja_virt_id", nullable = false, foreignKey =
    @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "venda_compra_loja_virt_fk"))
    private VendaCompraLojaVirtual vendaCompraLojaVirtual;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusRastreio that = (StatusRastreio) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCentroDestribuicao() {
        return centroDestribuicao;
    }

    public void setCentroDestribuicao(String centroDestribuicao) {
        this.centroDestribuicao = centroDestribuicao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
