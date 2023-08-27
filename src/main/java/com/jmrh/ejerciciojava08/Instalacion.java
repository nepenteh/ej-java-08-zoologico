
package com.jmrh.ejerciciojava08;

/**
 *
 * @author josep
 */
public class Instalacion {
    
    private int codigo;
    private String descripcion;
    private int anio;
    
    private Zona zona;

    public Instalacion(int codigo, String descripcion, int anio, Zona zona) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.anio = anio;
        this.zona = zona;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    
}
