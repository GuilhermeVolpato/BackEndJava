package com.satc.satcloja.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@DiscriminatorValue("servico")
public class Servico extends ItemVendavel{
  @Column(name = "qtde_horas", nullable = false)
  private Double quantidadeHoras;

  public Double getQuantidadeHoras() {
    return quantidadeHoras;
  }

  public void setQuantidadeHoras(Double quantidadeHoras) {
    this.quantidadeHoras = quantidadeHoras;
  }

  public Servico(String descricao, Double quantidadeHoras, Double valor) {
    super.setDescricao(descricao);
    this.quantidadeHoras = quantidadeHoras;
    super.setValorUnitario(valor);
  }

  @Override
  public Boolean getEstocavel() {
    return false;
  }

  @Override
  public String toString() {
    return "Produto{" +
            ", descicao= '" + super.getDescricao() + '\'' +
            ",quantidadeHora= " + quantidadeHoras + '\'' +
            '}';
  }
}
