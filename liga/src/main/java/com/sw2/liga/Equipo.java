package com.sw2.liga;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Equipo {
	
	@Id 
	@GeneratedValue 
	private long id;
	
	@Column(nullable=false)
	private String nombre;
	
	@Column(nullable=false)
	private String entrenador;
	
	@Column(nullable=false)
	private int titulos;
	
	@ManyToOne
    @JoinColumn(name="liga_id")
    private Liga liga;
	
	public Equipo() {
		super();
	}
	
	public Equipo(String nombre, String entrenador, int titulos) {
	    this.nombre = nombre;
	    this.entrenador = entrenador;
	    this.titulos = titulos;
	}
	
	
/*	 @Override
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
*/
	@Override
	  public String toString() {
	    return "Equipo{" + "id=" + this.id + ", nombre='" + this.nombre + '\'' + ", entrenador='" + this.entrenador + '\'' + " titulos: " + this.titulos + "}";
	  }
	
	
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEntrenador() {
		return entrenador;
	}
	public void setEntrenador(String entrenador) {
		this.entrenador = entrenador;
	}
	public int getTitulos() {
		return titulos;
	}
	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}
	
	

}
