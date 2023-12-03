
package cl.duoc.clases;


public class Main {
    public static void main(String[] args) {
        
        Vehiculo vehi01 = new Vehiculo("aaa12","Camaro","Chevrolet",2022,35000000,12000,"DIESEL");
        Vehiculo vehi02 = new Vehiculo("bbb22","Morning","Kia",2022,8000000,0,"DIESEL");
        
        Cliente cli01 = new Cliente("10101010-0","Aquiles","Baeza","227710101",'a',vehi01);
        Cliente cli02 = new Cliente("12121212-3","Susana","Horia","93213451",'n',vehi02);
        Cliente cli03 = new Cliente("13131313-7","Armando","Casas","227712151",'a',vehi01);
        
        
        
        System.out.println(cli01.informacionCliente());
        System.out.println("Estado del vehiculo: "+cli01.comprarVehiculo(vehi01));
        System.out.println(cli01.getVehiculo().recomendaciones());
        
        
        System.out.println("El valor final del vehiculo es: "+cli01.getVehiculo().obtenerDescuento(cli01.getTipo_cliente()));
        
    }
    
}
