package com.sw2.liga;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



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
    public String toString() {
        return "Liga [id=" + id + ", nombre=" + nombre + ", país=" + pais + "]";
    }
}