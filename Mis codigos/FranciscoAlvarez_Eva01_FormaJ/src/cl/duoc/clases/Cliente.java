
package cl.duoc.clases;

public class Cliente {
    
    //variables
    private String rut;
    private String nombre;
    private String apellido;
    private String fono;
    private char tipo_cliente;
    private Vehiculo vehiculo;
    
    //constructores

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String apellido, String fono, char tipo_cliente, Vehiculo vehiculo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fono = fono;
        this.tipo_cliente = tipo_cliente;
        this.vehiculo = vehiculo;
    }
    
    //Getters y Setters

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFono() {
        return fono;
    }

    public char getTipo_cliente() {
        return tipo_cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFono(String fono) {
        this.fono = fono;
    }

    public void setTipo_cliente(char tipo_cliente) {
        this.tipo_cliente = tipo_cliente;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
    //Metodos
    
   public boolean comprarVehiculo(Vehiculo vehiculo){
       
       
       if(vehiculo.isVendido() && tipo_cliente=='a'){
           vehiculo.obtenerDescuento('a');
           return true;
       }else if(vehiculo.isVendido() && tipo_cliente=='n'){
           vehiculo.obtenerDescuento('n');
           return true;
           
       }
       return false;
   }
   
   public String informacionCliente(){
       return"\t\t\t Informacion Detallada del Cliente\n"+
               "Rut     :"+rut+"\n"+
                "Nomber     :"+nombre+"\n"+
                "Apellido :"+apellido+"\n"+
                "Fono     :"+fono+"\n"+
                "Tipo Cliente:"+tipo_cliente+"\n"+
                "Vehiculo:"+vehiculo.informacionVehiculo();
                
   }
}
