package br.com.dbsdev.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OutrosCustos implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue
  private Long id;
  private String descricao;
  private Double custo;
  private LocalDate data;

  public OutrosCustos() {
    super();
  }

  public OutrosCustos(Long id, String descricao, Double custo, LocalDate data) {
    super();
    this.id = id;
    this.descricao = descricao;
    this.custo = custo;
    this.data = data;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public Double getCusto() {
    return custo;
  }

  public void setCusto(Double custo) {
    this.custo = custo;
  }

  public LocalDate getData() {
    return data;
  }

  public void setData(LocalDate data) {
    this.data = data;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((data == null) ? 0 : data.hashCode());
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
    OutrosCustos other = (OutrosCustos) obj;
    if (data == null) {
      if (other.data != null)
        return false;
    } else if (!data.equals(other.data))
      return false;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "OutrosCustos [id=" + id + ", descricao=" + descricao + ", custo=" + custo + ", data=" + data + "]";
  }

}
