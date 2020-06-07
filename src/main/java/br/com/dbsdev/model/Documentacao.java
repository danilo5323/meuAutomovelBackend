package br.com.dbsdev.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Documentacao implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue
  Long id;
  private String descricaoDocumentacao;
  private String valorDocumentacao;
  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataPagamento;

  public Documentacao() {
    super();
  }

  public Documentacao(Long id, String descricaoDocumentacao, String valorDocumentacao, LocalDate dataPagamento) {
    super();
    this.id = id;
    this.descricaoDocumentacao = descricaoDocumentacao;
    this.valorDocumentacao = valorDocumentacao;
    this.dataPagamento = dataPagamento;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricaoDocumentacao() {
    return descricaoDocumentacao;
  }

  public void setDescricaoDocumentacao(String descricaoDocumentacao) {
    this.descricaoDocumentacao = descricaoDocumentacao;
  }

  public String getValorDocumentacao() {
    return valorDocumentacao;
  }

  public void setValorDocumentacao(String valorDocumentacao) {
    this.valorDocumentacao = valorDocumentacao;
  }

  public LocalDate getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(LocalDate dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  @Override
  public String toString() {
    return "Documentacao [descricaoDocumentacao=" + descricaoDocumentacao + ", valorDocumentacao=" + valorDocumentacao
        + ", dataPagamento=" + dataPagamento + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Documentacao other = (Documentacao) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
