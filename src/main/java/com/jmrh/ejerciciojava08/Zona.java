package com.jmrh.ejerciciojava08;

/**
 *
 * @author josep
 */
public class Zona {
    
    private String codigo;
    private String nombre;
    private int metros;
    
    public Zona(String codigo, String nombre, int metros) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.metros = metros;
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

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }
    
    
    
}
