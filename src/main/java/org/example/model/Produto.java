package org.example.model;
import java.time.LocalDate;

public class Produto extends EntityId {
  private String nome;

  private String descicao;
  private Double precoVenda;
  private Double precoCompra;
  private LocalDate dataValidade;
  private LocalDate dataPrazo;
  private Status status;

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
    if(this.calcularMargemDeLucro() < 20.0){
      System.out.println("A Margem de lucro deve ser maior ou igual a 20");
    }
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

  public Produto() {
  }

  public Produto(String nome, String descicao) {
    this.nome = nome;
    this.descicao = descicao;
  }

  public Produto(String nome, String descicao, Double precoVenda, Double precoCompra, LocalDate dataValidade, LocalDate dataPrazo, Status status) {
    this.nome = nome;
    this.descicao = descicao;
    this.precoVenda = precoVenda;
    this.precoCompra = precoCompra;
    this.dataValidade = dataValidade;
    this.dataPrazo = dataPrazo;
    this.status = status;
  }
}
