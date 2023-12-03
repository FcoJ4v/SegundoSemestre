
package cl.duoc.views;

import cl.duoc.clases.*;


public class Main {
    
    public static void main(String[] args) {
        Catamaran c = new Catamaran();
        
       Tripulante tri1 = new Tripulante("1111-1", "Andres", "Bello", 35, "Capitan");
       Pasajero pasaj1 = new Pasajero("12345678-9", "Esteban", "Dido", 35, "Laguna San Rafael",'v');
       Pasajero pasaj2 = new Pasajero("2222-2", "Susana", "Horia", 69, "Lago Todos los Santos",'m'); 
       Pasajero pasaj3 = new Pasajero("3333-3", "Armando", "Casas", 30, "Cabo de Hornos",'t');
       Pasajero pasaj4 = new Pasajero("4444-4", "Arturo", "Prat", 20, "Laguna San Rafael",'t');
       
       
        System.out.println(c.registrarPersona(tri1));
        System.out.println(c.registrarPersona(pasaj1));
        System.out.println(c.registrarPersona(pasaj2));
        System.out.println(c.registrarPersona(pasaj3));
        System.out.println(c.registrarPersona(pasaj4));
        System.out.println(c.buscarPersona("12345678-9"));
        System.out.println(c.buscarPersona("1111-1"));
        System.out.println(c.bajarPasajero("4444-4"));
        
        for(Persona p: c.getPersonas())
        {
            System.out.println(p.mostrarInformacion()) ;
        }
    }
    
    
    
}
