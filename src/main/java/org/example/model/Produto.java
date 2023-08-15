package org.example.model;
import java.time.LocalDate;

public class Produto extends ItemVendavel {
  private String nome;
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

  public Produto() {
  }

  public Produto(String nome, String descicao) {
    this.nome = nome;
    super.setDescricao(descicao);
  }

  public Produto(String nome, String descicao, Double precoVenda, Double precoCompra, LocalDate dataValidade, LocalDate dataPrazo, Status status) {
    this.nome = nome;
    super.setDescricao(descicao);
    super.setValorUnitario(precoVenda);
    this.precoCompra = precoCompra;
    this.dataValidade = dataValidade;
    this.dataPrazo = dataPrazo;
    this.status = status;
  }

  @Override
  public String toString() {
    return "Produto{" +
            "nome='" + nome + '\'' +
            ", descicao='" + super.getDescricao() + '\'' +
            '}';
  }
}
