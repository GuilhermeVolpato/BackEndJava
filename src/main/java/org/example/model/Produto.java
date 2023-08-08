package org.example.model;
import java.time.LocalDate;

public class Produto {
  public Integer id;

  public String nome;

  public String descicao;
  public Double precoVenda;
  public Double precoCompra;
  public LocalDate dataValidade;
  public LocalDate dataPrazo;
  public Status status;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescicao() {
    return descicao;
  }

  public void setDescicao(String descicao) {
    this.descicao = descicao;
  }

  public Double getPrecoVenda() {
    return precoVenda;
  }

  public void setPrecoVenda(Double precoVenda) {
    this.precoVenda = precoVenda;
  }

  public Double getPrecoCompra() {
    return precoCompra;
  }

  public void setPrecoCompra(Double precoCompra) {
    this.precoCompra = precoCompra;
  }

  public LocalDate getDataValidade() {
    return dataValidade;
  }

  public void setDataValidade(LocalDate dataValidade) {
    this.dataValidade = dataValidade;
  }

  public LocalDate getDataPrazo() {
    return dataPrazo;
  }

  public void setDataPrazo(LocalDate dataPrazo) {
    this.dataPrazo = dataPrazo;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public Double calcularMargemDeLucro(){
    double lucro =precoVenda - precoCompra;
    double margemLucro = (lucro/precoCompra)*100;
    return margemLucro;
  }

  public Produto(Integer id, String nome, String descicao, Double precoVenda, Double precoCompra, LocalDate dataValidade, LocalDate dataPrazo, Status status) {
    this.id = id;
    this.nome = nome;
    this.descicao = descicao;
    this.precoVenda = precoVenda;
    this.precoCompra = precoCompra;
    this.dataValidade = dataValidade;
    this.dataPrazo = dataPrazo;
    this.status = status;
  }
}
