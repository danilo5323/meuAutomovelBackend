package br.com.dbsdev.descontinuar.externo.fipe.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VeiculoSimplificado implements Serializable{

	@JsonProperty(value = "fipe_codigo")
	String fipeCodigo;
	String name;
	String key;
	String veiculo;
	String id;
	
	
	
	public VeiculoSimplificado() {
		super();
	}
	public VeiculoSimplificado(String fipeCodigo, String name, String key, String veiculo, String id) {
		super();
		this.fipeCodigo = fipeCodigo;
		this.name = name;
		this.key = key;
		this.veiculo = veiculo;
		this.id = id;
	}
	public String getFipeCodigo() {
		return fipeCodigo;
	}
	public void setFipeCodigo(String fipeCodigo) {
		this.fipeCodigo = fipeCodigo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		VeiculoSimplificado other = (VeiculoSimplificado) obj;
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
