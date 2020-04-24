package br.com.dbsdev.descontinuar.externo.fipe.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Veiculo implements Serializable{
	String key;
	String name;
	String id;
	@JsonProperty(value = "fipe_name")
	String fipeName;

	public Veiculo() {
		super();
	};

	public Veiculo(String key, String name, String id, String fipeName) {
		super();
		this.key = key;
		this.name = name;
		this.id = id;
		this.fipeName = fipeName;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFipeName() {
		return fipeName;
	}

	public void setFipeName(String fipeName) {
		this.fipeName = fipeName;
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
		Veiculo other = (Veiculo) obj;
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
