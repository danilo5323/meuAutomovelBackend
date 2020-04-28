package br.com.dbsdev.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.Valid;

/**
 * Raiz
 * 
 * @author danilo
 *
 */
@Entity
public class Veiculo implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue
  private Long id;
  private Double capacidadeTanque;
  private String placa;
  private String codigoFipe;
  private Double valorCompra;
  private Double autonomiaMinima;
  private Double mediaConsumoTotal;
  private Double autonomiaTanque;
  private Double precoRevendaFipe;

  @OneToMany( mappedBy = "veiculo" )
  private List<Consumo> consumo;
  @OneToMany
  private List<Documentacao> documentacao;
  @OneToMany
  private List<OutrosCustos> outrosCustos;
  @OneToMany
  private List<Manutencao> manutencao;

  public Veiculo() {
    super();
  }

  public Veiculo(Long id, Double capacidadeTanque, String placa, String codigoFipe, Double valorCompra,
      Double autonomiaMinima, Double mediaConsumoTotal, Double autonomiaTanque, Double precoRevendaFipe) {
    super();
    this.id = id;
    this.capacidadeTanque = capacidadeTanque;
    this.placa = placa;
    this.codigoFipe = codigoFipe;
    this.valorCompra = valorCompra;
    this.autonomiaMinima = autonomiaMinima;
    this.mediaConsumoTotal = mediaConsumoTotal;
    this.autonomiaTanque = autonomiaTanque;
    this.precoRevendaFipe = precoRevendaFipe;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getCapacidadeTanque() {
    return capacidadeTanque;
  }

  public void setCapacidadeTanque(Double capacidadeTanque) {
    this.capacidadeTanque = capacidadeTanque;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public String getCodigoFipe() {
    return codigoFipe;
  }

  public void setCodigoFipe(String codigoFipe) {
    this.codigoFipe = codigoFipe;
  }

  public Double getValorCompra() {
    return valorCompra;
  }

  public void setValorCompra(Double valorCompra) {
    this.valorCompra = valorCompra;
  }

  public Double getAutonomiaMinima() {
    return autonomiaMinima;
  }

  public void setAutonomiaMinima(Double autonomiaMinima) {
    this.autonomiaMinima = autonomiaMinima;
  }

  public Double getMediaConsumoTotal() {
    return mediaConsumoTotal;
  }

  public void setMediaConsumoTotal(Double mediaConsumoTotal) {
    this.mediaConsumoTotal = mediaConsumoTotal;
  }

  public Double getAutonomiaTanque() {
    return autonomiaTanque;
  }

  public void setAutonomiaTanque(Double autonomiaTanque) {
    this.autonomiaTanque = autonomiaTanque;
  }

  public Double getPrecoRevendaFipe() {
    return precoRevendaFipe;
  }

  public void setPrecoRevendaFipe(Double precoRevendaFipe) {
    this.precoRevendaFipe = precoRevendaFipe;
  }

  public List<Consumo> getConsumo() {
    if (consumo == null)
      consumo = new ArrayList<Consumo>();
    return consumo;
  }

  public void setConsumo(List<Consumo> consumo) {
    this.consumo = consumo;
  }

  public List<Documentacao> getDocumentacao() {
    if (documentacao == null)
      documentacao = new ArrayList<Documentacao>();
    return documentacao;
  }

  public void setDocumentacao(List<Documentacao> documentacao) {
    this.documentacao = documentacao;
  }

  public List<OutrosCustos> getOutrosCustos() {
    if (outrosCustos == null)
      new ArrayList<OutrosCustos>();
    return outrosCustos;
  }

  public void setOutrosCustos(List<OutrosCustos> outrosCustos) {
    this.outrosCustos = outrosCustos;
  }

  public List<Manutencao> getManutencao() {
    if (manutencao == null)
      manutencao = new ArrayList<Manutencao>();
    return manutencao;
  }

  public void setManutencao(List<Manutencao> manutencao) {
    this.manutencao = manutencao;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    result = prime * result + ((placa == null) ? 0 : placa.hashCode());
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
    Veiculo other = (Veiculo) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    if (placa == null) {
      if (other.placa != null)
        return false;
    } else if (!placa.equals(other.placa))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Veiculo [id=" + id + ", capacidadeTanque=" + capacidadeTanque + ", placa=" + placa + ", codigoFipe="
        + codigoFipe + ", valorCompra=" + valorCompra + ", autonomiaMinima=" + autonomiaMinima + ", mediaConsumoTotal="
        + mediaConsumoTotal + ", autonomiaTanque=" + autonomiaTanque + ", precoRevendaFipe=" + precoRevendaFipe
        + ", consumo=" + consumo + ", documentacao=" + documentacao + ", outrosCustos=" + outrosCustos + ", manutencao="
        + manutencao + "]";
  }

  public static Veiculo setVeiculo(Veiculo c, @Valid Veiculo veiculo) {
    c.setAutonomiaMinima(veiculo.getAutonomiaMinima());
    c.setAutonomiaTanque(veiculo.getAutonomiaTanque());
    c.setCapacidadeTanque(veiculo.getCapacidadeTanque());
    c.setCodigoFipe(veiculo.getCodigoFipe());
    c.setConsumo(veiculo.getConsumo()); 
    c.setPlaca(veiculo.getPlaca());
    c.setMediaConsumoTotal(veiculo.getMediaConsumoTotal());
    c.setPrecoRevendaFipe(veiculo.getPrecoRevendaFipe());
    c.setValorCompra(veiculo.getValorCompra()); 
    return c;
  }

}
