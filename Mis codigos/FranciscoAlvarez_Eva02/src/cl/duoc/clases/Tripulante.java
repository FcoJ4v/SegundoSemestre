
package cl.duoc.clases;

public final class Tripulante extends Persona {
    private String cargo;
    private String email;

    public Tripulante() {
    }

    public Tripulante(String rut, String nombre, String apellido, int edad,String cargo) {
        super(rut, nombre, apellido, edad);
        this.cargo = cargo;
        this.email = email;
        generarEmail();
    }

    public String getCargo() {
        return cargo;
    }

    public String getEmail() {  
        this.generarEmail();
        return email;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    private void setEmail(String email) {
        this.email = email;
    }
    
    

    

    //Metodos    
    public String generarEmail(){
        String nombreMail = nombre;
        if(nombre.length() >= 3){
            nombreMail = nombre.substring(0, 1);
        }
        return email = (nombreMail + "." + apellido + "@"+NOMBRE_COMPANIA).toLowerCase();        
   
    }
    
     @Override
    public String mostrarInformacion(){
         return this.getClass().getSimpleName()+ " Tripulante: "+cargo+ " " +nombre +" "+apellido+ " - "+ " " + generarEmail();
                
                
    }
    
}
