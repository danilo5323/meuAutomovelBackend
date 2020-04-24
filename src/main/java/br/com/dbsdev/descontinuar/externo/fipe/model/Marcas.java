package br.com.dbsdev.descontinuar.externo.fipe.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Marcas implements Serializable{

	private String key;
	private Long id;
	@JsonProperty( value = "fipe_name" )
	private String fipeName;
	private String name;
	
	 
	
	public Marcas() {
		super(); 
	}
	
	public Marcas(String key, Long id, String fipe_name, String name) {
		super();
		this.key = key;
		this.id = id;
		this.fipeName = fipe_name;
		this.name = name;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFipe_name() {
		return fipeName;
	}
	public void setFipe_name(String fipe_name) {
		this.fipeName = fipe_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		Marcas other = (Marcas) obj;
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

	@Override
	public String toString() {
		return "Marcas [key=" + key + ", id=" + id + ", fipeName=" + fipeName + ", name=" + name + "]";
	}
	
	
	
}
