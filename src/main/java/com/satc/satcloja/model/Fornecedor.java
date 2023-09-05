package com.satc.satcloja.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Fornecedor extends Pessoa {
  @Column (name = "cnpj")
  private String cnpj;
  @Column (name = "inscricao_estadual")
  private String inscricaoEstadual;

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }

  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  @Override
  public String getDocumentoPricipal() {
    return this.getCnpj();
  }
}
