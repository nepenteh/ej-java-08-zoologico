
package com.jmrh.ejerciciojava08;

/**
 *
 * @author josep
 */
public class Animal {
    
    private String codigo;
    private String nombre;
    private int anio;
    private String especie;
    
    private Instalacion instalacion;

    public Animal(String codigo, String nombre, int anio, String especie, Instalacion instalacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anio = anio;
        this.especie = especie;
        this.instalacion = instalacion;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Instalacion getInstalacion() {
        return instalacion;
    }

    public void setInstalacion(Instalacion instalacion) {
        this.instalacion = instalacion;
    }
    
    
}
