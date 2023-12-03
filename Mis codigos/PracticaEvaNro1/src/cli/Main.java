package cli;

import clases.Barco;
import clases.Contenedor;

public class Main {
    
    public static void main(String[] args) {
        Barco b1 = new Barco("B1SCL","Esmeraldo","Chile",15000,0,0,20000);
        Barco b2 = new Barco("B2SCL","Cobadongo","Chile",10000,0,0,20000);

        Contenedor c1 = new Contenedor(11111, 20, 5000, true, b1);
        Contenedor c2 = new Contenedor(22222, 20, 10000, true, b1);
        Contenedor c3 = new Contenedor(33333, 40, 5000, true, b1);
        Contenedor c4 = new Contenedor(44444, 40, 5000, true, b1);
        
        System.out.println(c1.puedeSubir());
        b1.subirContenedor(c1.getPeso(), c1.getTamaño());
        b1.subirContenedor(c4.getPeso(), c4.getTamaño());
        System.out.println(b1.getCantContenedoresCargados());
        
    }
    
   
    
}
