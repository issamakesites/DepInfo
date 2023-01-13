package com.deptInfo.magasin.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Fourniture implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false,updatable = false)
	private long id;
	private String type;
	private int nombre;


	public Fourniture(){}
	public long getId() {
		return id;
	}

	public void setId(long idFourniture) {
		this.id = idFourniture;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Fourniture{" +
				"id=" + id +
				", type='" + type + '\'' +
				", nombre=" + nombre +
				'}';
	}
}
