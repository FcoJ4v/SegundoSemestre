
package cl.duoc.clases;

import java.text.DecimalFormat;


public class Pasajero extends Persona {
   private String destino;
   private char categoria;

    public Pasajero() {
    }

   

    public Pasajero( String rut, String nombre, String apellido, int edad, String destino, char categoria) {
        super(rut, nombre, apellido, edad);
        this.destino = destino;
        this.categoria = categoria;
    }

    public String getDestino() {
        return destino;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
    
   //Metodos
    public double valorPasaje(){
        double calculo= 0;
     {
      return 0; //falto    
         
     }
        
    }
    @Override
    public String mostrarInformacion(){
         return this.getClass().getSimpleName()+ " Pasajero " + rut + " | " +nombre +" "+apellido+ " "+edad+" años "+ " | Pasajero " + categoria + 
                " | Destino " + destino + " | Valor Pasaje $" +new DecimalFormat("$ ###,###").format(valorPasaje()); 
                
    }
   
}
