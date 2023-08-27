
package com.jmrh.ejerciciojava08;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class Zoologico {
    
    private String nombre;
    private ArrayList<Zona> zonas;
    private ArrayList<Instalacion> instalaciones;
    private ArrayList<Animal> animales;
    private ArrayList<Trabajador> trabajadores;
    private ArrayList<Asignacion> asignaciones;

    public Zoologico(String nombre) {
        this.nombre = nombre;
        zonas = new ArrayList<>();
        instalaciones = new ArrayList<>();
        animales = new ArrayList<>();
        trabajadores = new ArrayList<>();
        asignaciones = new ArrayList<>();
    }
    
    public void listadoZonasTrabajador(String dni) {
        for(Trabajador trabajador: trabajadores) {
            if(trabajador.getDNI().equals(dni)) {
                System.out.println(trabajador.getNombre() + " " + trabajador.getApellido1() + " " + trabajador.getApellido2() + 
                        " " + trabajador.getEspecialidad());
            }
        }
        
        for(Asignacion asignacion: asignaciones) {
            if(asignacion.getTrabajador().getDNI().equals(dni)) {
                System.out.println(asignacion.getZona().getNombre() + " " + asignacion.getHorario());
            }
        }
    }
    
    public void listadoAnimales() {
        for(Animal animal: animales) {
            System.out.println(animal.getEspecie() + " " + animal.getNombre() + " " + animal.getAnio() +
                    " " + animal.getInstalacion().getCodigo() + " " + animal.getInstalacion().getZona().getNombre());
        }
    }
    
    public void listadoInstalaciones() {
        for(Instalacion instalacion: instalaciones) {
            System.out.println(instalacion.getCodigo() + " " + instalacion.getAnio() + " " + 
                    instalacion.getDescripcion() + " " + instalacion.getZona().getNombre());
        }
    }
    
    public void introducirZona(Zona zona) {
        zonas.add(zona);
    }
    
    public void introducirInstalacion(Instalacion instalacion) {
        instalaciones.add(instalacion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }

    public ArrayList<Instalacion> getInstalaciones() {
        return instalaciones;
    }

    public void setInstalaciones(ArrayList<Instalacion> instalaciones) {
        this.instalaciones = instalaciones;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public ArrayList<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignaciones(ArrayList<Asignacion> asignaciones) {
        this.asignaciones = asignaciones;
    }

    void introducirAnimal(Animal animal) {
        animales.add(animal);
    }

    void introducirTrabajador(Trabajador trabajador) {
       trabajadores.add(trabajador);
    }

    void introducirAsignacion(Asignacion asignacion) {
        asignaciones.add(asignacion);
    }
    
    
}
