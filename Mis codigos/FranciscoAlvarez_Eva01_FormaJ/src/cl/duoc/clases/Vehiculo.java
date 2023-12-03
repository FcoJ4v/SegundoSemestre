
package cl.duoc.clases;


public class Vehiculo {
    //variables
    private String patente;
    private String modelo;
    private String fabricante;
    private int año_fabricacion;
    private int precio;
    private double kilometraje;
    private String combustible;
    private boolean vendido = false;
    
    //constructores

    public Vehiculo() {
    }

    public Vehiculo(String patente, String modelo, String fabricante, int año_fabricacion, int precio, double kilometraje, String combustible) {
        this.patente = patente;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.año_fabricacion = año_fabricacion;
        this.precio = precio;
        this.kilometraje = kilometraje;
        this.combustible = combustible;
    }
    
    //Getters y Setters

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAño_fabricacion() {
        return año_fabricacion;
    }

    public int getPrecio() {
        return precio;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setAño_fabricacion(int año_fabricacion) {
        this.año_fabricacion = año_fabricacion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
    
    
    
    //Metodos 
    
     public double obtenerDescuento(char tipo_cliente){
        double calculoDcto;
        if(tipo_cliente=='a' && precio > 15000000){
            calculoDcto = precio-(precio * 0.05) ;
            return Math.round(calculoDcto);
        }else if(tipo_cliente=='n'){
            calculoDcto = precio;
            return Math.round(calculoDcto);
        }
        return 0;
    }
    
    public String recomendaciones(){
        if(combustible=="DIESEL"){
            return"Considere revisar inyectores cada 20.000kms";
        }return "Sin recomendaciones";
    }
    
    public String informacionVehiculo(){
        return"\t\t\t Informacion Detallada del Vehiculo\n"+
               "Patente     :"+patente+"\n"+
                "Modelo     :"+modelo+"\n"+
                "Fabricante :"+fabricante+"\n"+
                "Precio     :"+precio+"\n"+
                "Kilometraje:"+kilometraje+"\n"+
                "Combustible:"+combustible+"\n"+
                "vendido    :"+vendido;//Cambiar el false por no vendido con palabras
    }
    
   
    
    
}
