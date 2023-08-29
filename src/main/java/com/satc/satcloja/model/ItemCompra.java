package com.satc.satcloja.model;

public class ItemCompra {
    private Produto produto;
    private Double valorUnitário;
    private Double quantidade;
    private Double desconto;

    public Produto getProduto() {
        return produto;
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
