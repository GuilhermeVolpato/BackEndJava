package com.satc.satcloja.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemCompra extends EntityId{
    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;
    @Column(name = "valor_unitario")
    private Double valorUnitário;
    @Column(name = "quantidade")
    private Double quantidade;
    @Column(name = "desconto")
    private Double desconto;

    @ManyToOne
    @JoinColumn(name = "compra_id")
    private Compra compra;

    public Produto getProduto() {
        return produto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getValorUnitário() {
        return valorUnitário;
    }

    public void setValorUnitário(Double valorUnitário) {
        this.valorUnitário = valorUnitário;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getValorCalculado(){
        double valorTotal = this.getValorUnitário() * this.getQuantidade();
        double descontoCalculado = valorTotal * (this.getDesconto() / 100);
        return valorTotal - descontoCalculado;
    }

    public ItemCompra(Produto produto, Double valorUnitário, Double quantidade, Double desconto) {
        this.produto = produto;
        this.valorUnitário = valorUnitário;
        this.quantidade = quantidade;
        this.desconto = desconto;
    }
}
