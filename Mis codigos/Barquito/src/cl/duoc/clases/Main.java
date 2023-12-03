
package cl.duoc.clases;


public class Main {
    public static void main(String[] args) {
        Barco bar01 = new Barco("Bar01","Barquito bonito","Chile",20000,18000,4,250000);
        Contenedor co01 = new Contenedor(001,25,15000,true,bar01);
        
        System.out.println(co01.valorPagoInspeccion());
        
        System.out.println(co01.eliminarPeso(2000));
        System.out.println(co01.puedeSubir());
        
        
    }
}
