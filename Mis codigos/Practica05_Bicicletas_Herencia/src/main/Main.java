package main;

import clases.*;
import java.text.DecimalFormat;

/**
 *
 * @author Codename 47
 */
public class Main {

    public static void main(String[] args) {
        Bodega bo = new Bodega();
        MountainBike mb1 = new MountainBike(111111, "Cannondale", "Catalyst", 600, "3x9", "Disco Hidráulico", 10, "Delantera", "M", 29);
        MountainBike mb2 = new MountainBike(111111, "Cannondale", "Catalyst", 600, "3x9", "Disco Hidráulico", 10, "Delantera", "M", 29);
        Gravel gr1 = new Gravel(22222, "Norca", "Search 105", 2000, "2x11", "Disco Mecánico", 15, 51);
        System.out.println(bo.registraBicicleta(mb1));
        System.out.println(bo.registraBicicleta(mb2));
        System.out.println(bo.registraBicicleta(gr1));
        System.out.println(bo.buscarBicicleta(111111));
        
        
        for(Bicicleta b: bo.getBicicletas() )
        {
            System.out.println(b.informacion() + "\nStock: "  + b.getStock()) ;
        }
        
        System.out.println("Cantidad Bicicletas Gravel: " + bo.listarBicicletasGravel().size());
        
        System.out.println("Total ganancias al vender las bicis: " + new DecimalFormat("$ ###,###").format(bo.totalPosiblesGanancias()));
    }
    
}
