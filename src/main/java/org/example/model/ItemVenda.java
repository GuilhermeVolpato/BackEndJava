package org.example.model;

public class ItemVenda extends EntityId{

  private ItemVendavel produtoServico;
  private Double valorUnitario;
  private Double quantidade;
  private Double desconto;

  public ItemVendavel getProdutoServico() {
    return produtoServico;
  }

  public void setProdutoServico(ItemVendavel produtoServico) {
    this.produtoServico = produtoServico;
  }

  public Double getValorUnitario() {
    return valorUnitario;
  }

  public void setValorUnitario(Double valorUnitario) {
    this.valorUnitario = valorUnitario;
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

  public ItemVenda(ItemVendavel produto, Double valorUnitario, Double quantidade, Double desconto) {
    this.produtoServico = produto;
    this.valorUnitario = valorUnitario;
    this.quantidade = quantidade;
    this.desconto = desconto;
  }

  public Double getVendaValorCalculado(){
    double valorTotal = this.getValorUnitario() * this.getQuantidade();
    double descontoCalculado = valorTotal * (this.getDesconto() / 100);
    return valorTotal - descontoCalculado;
  }

  @Override
  public String toString() {
    return "ItemVenda{" +
            "produto=" + produtoServico +
            ", valorUnitario=" + valorUnitario +
            ", quantidade=" + quantidade +
            ", desconto=" + desconto +
            '}';
  }
}