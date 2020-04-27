package br.com.dbsdev.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemManutencao implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue
  private Long id;
  private String descricaoItem;
  private BigDecimal custoItem;

  public ItemManutencao() {
    super();
  }

  public ItemManutencao(Long id, String descricaoItem, BigDecimal custoItem) {
    super();
    this.id = id;
    this.descricaoItem = descricaoItem;
    this.custoItem = custoItem;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricaoItem() {
    return descricaoItem;
  }

  public void setDescricaoItem(String descricaoItem) {
    this.descricaoItem = descricaoItem;
  }

  public BigDecimal getCustoItem() {
    return custoItem;
  }

  public void setCustoItem(BigDecimal custoItem) {
    custoItem = custoItem;
  }

  @Override
  public String toString() {
    return "ItemManutencao [id=" + id + ", descricaoItem=" + descricaoItem + ", CustoItem=" + custoItem + "]";
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
    ItemManutencao other = (ItemManutencao) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
