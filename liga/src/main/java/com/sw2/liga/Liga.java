package com.sw2.liga;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity
public class Liga {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String nombre;
    
    @Column
    private String pais;

    
    @OneToMany(mappedBy = "liga")
    private List<Equipo> equipos;
    
    public Liga() {
        super();
        equipos = new ArrayList<>();
    }

    public Liga(String nombre, String pais) {
        super();
        this.nombre = nombre;
        this.pais = pais;
        equipos = new ArrayList<>();
    }

    public long getId() {
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

    
    public void addEquipo(Equipo equipo) {
        equipos.add(equipo);        
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Liga other = (Liga) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "Liga [id=" + id + ", nombre=" + nombre + ", país=" + pais + "]";
    }
}