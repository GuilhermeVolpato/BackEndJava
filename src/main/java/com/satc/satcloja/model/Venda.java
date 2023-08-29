package com.satc.satcloja.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda extends EntityId implements OperacaoFinanceira{
  private LocalDate dataVenda;
  private FormaPagamento formaPagamento;
  private Cliente cliente;
  private String observacao;

  private List<ItemVenda> itens = new ArrayList<>();

  public LocalDate getDataVenda() {
    return dataVenda;
  }

  public void setDataVenda(LocalDate dataVenda) {
    this.dataVenda = dataVenda;
  }

  public FormaPagamento getFormaPagamento() {
    return formaPagamento;
  }

  public void setFormaPagamento(FormaPagamento formaPagamento) {
    this.formaPagamento = formaPagamento;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public void addItemVenda(ItemVenda item) {
    itens.add(item);
  }

  public void delItemVenda(ItemVenda item) {
    itens.remove(item);
  }

  public List<ItemVenda> getItens() {
    return itens;
  }

  @Override
  public LocalDate getDataOperacao() {
    return this.getDataVenda();
  }

  @Override
  public Double getValorTotalOperacao() {
    return this.getItens().stream().mapToDouble(ItemVenda::getVendaValorCalculado).sum();
  }

  @Override
  public TipoOperacao getTipoOperacao() {
    return TipoOperacao.CREDITO;
  }
}
