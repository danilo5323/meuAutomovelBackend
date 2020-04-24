package br.com.dbsdev.descontinuar.externo.fipe.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DetalhesVeiculo implements Serializable {

	String id;
	@JsonProperty( value = "ano_modelo")
	String anoModelo;
	String marca;
	String name;
	String veiculo;
	String preco;
	String combustivel;
	String referencia;
	@JsonProperty(value = "fipe_codigo")
	String fipeCodigo;
	String key;
	
	
	public DetalhesVeiculo() {super();}
	
	public DetalhesVeiculo(String id, String anoModelo, String marca, String name, String veiculo, String preco,
			String combustivel, String referencia, String fipeCodigo, String key) {
		super();
		this.id = id;
		this.anoModelo = anoModelo;
		this.marca = marca;
		this.name = name;
		this.veiculo = veiculo;
		this.preco = preco;
		this.combustivel = combustivel;
		this.referencia = referencia;
		this.fipeCodigo = fipeCodigo;
		this.key = key;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getFipeCodigo() {
		return fipeCodigo;
	}
	public void setFipeCodigo(String fipeCodigo) {
		this.fipeCodigo = fipeCodigo;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fipeCodigo == null) ? 0 : fipeCodigo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
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
		DetalhesVeiculo other = (DetalhesVeiculo) obj;
		if (fipeCodigo == null) {
			if (other.fipeCodigo != null)
				return false;
		} else if (!fipeCodigo.equals(other.fipeCodigo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		return true;
	}
	 
	
	
}
