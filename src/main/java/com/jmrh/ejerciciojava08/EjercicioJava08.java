
package com.jmrh.ejerciciojava08;

/**
 *
 * @author josep
 */
public class EjercicioJava08 {

    public static void main(String[] args) {
        
        Zoologico zoo = new Zoologico("Mi Zoo");
        
        Zona zona1 = new Zona("01FEL", "Felinos", 400);
        Zona zona2 = new Zona("02PRI", "Primates", 300);
        Zona zona3 = new Zona("03PMA", "Pequeños mamíferos", 230);
        Zona zona4 = new Zona("04RES", "Restaurante", 400);
        
        zoo.introducirZona(zona1);
        zoo.introducirZona(zona2);
        zoo.introducirZona(zona3);
        zoo.introducirZona(zona4);
        
        Instalacion insta1 = new Instalacion(143,"Jaula amplia con dos árboles en el centro", 2012, zona1);
        Instalacion insta2 = new Instalacion(144, "Jaula alta con barrotes separados", 2014, zona1);
        Instalacion insta3 = new Instalacion(150, "Jaula con distintos niveles y zona de juegos", 2013, zona2);
        
        zoo.introducirInstalacion(insta1);
        zoo.introducirInstalacion(insta2);
        zoo.introducirInstalacion(insta3);
        
        Animal ani1 = new Animal("SI-01", "Simba", 2010, "leon", insta1);
        Animal ani2 = new Animal("NA-12", "Nala", 2011, "leon", insta1);
        Animal ani3 = new Animal("SA-11", "Bruto", 2001, "gorila", insta3);
        
        zoo.introducirAnimal(ani1);
        zoo.introducirAnimal(ani2);
        zoo.introducirAnimal(ani3);
        
        Trabajador tra1 = new Trabajador("11223344H", "Ana", "García", "Rojas", "Veterinario");
        
        zoo.introducirTrabajador(tra1);
        
        Asignacion asig1 = new Asignacion(tra1,zona1,"Lunes y Miércoles de 9 a 11");
        Asignacion asig2 = new Asignacion(tra1, zona2, "Jueves por la tarde");
        Asignacion asig3 = new Asignacion(tra1, zona3, "Sábado por la mañana");
        
        zoo.introducirAsignacion(asig1);
        zoo.introducirAsignacion(asig2);
        zoo.introducirAsignacion(asig3);
        
        zoo.listadoInstalaciones();
        System.out.println("\n");
        zoo.listadoAnimales();
        System.out.println("\n");
        zoo.listadoZonasTrabajador("11223344H");
        
    }
}
