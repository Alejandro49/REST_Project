package com.sw2.liga;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Equipo {
	
	private @Id @GeneratedValue Long id;
	private String nombre;
	private String pais;
	private int titulos;
	
	Equipo() {}
	
	Equipo(String nombre, String pais, int titulos) {
	    this.nombre = nombre;
	    this.pais = pais;
	    this.titulos = titulos;
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
		Equipo other = (Equipo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	  public String toString() {
	    return "Equipo{" + "id=" + this.id + ", nombre='" + this.nombre + '\'' + ", pais='" + this.pais + '\'' + " titulos: " + this.titulos + "}";
	  }
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getTitulos() {
		return titulos;
	}
	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}
	
	

}
