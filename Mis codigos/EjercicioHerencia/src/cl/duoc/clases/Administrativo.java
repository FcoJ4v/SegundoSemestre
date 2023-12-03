
package cl.duoc.clases;


public final class Administrativo extends Empleado {
    
    private char cargo;

    public Administrativo() {
    }
    

    public Administrativo(char cargo) {
        this.cargo = cargo;
    }

    public Administrativo(String rut, String nombre, String apellido, int antiguedad, char cargo) {
        super(rut, nombre, apellido, antiguedad);
        this.cargo = cargo;
    }

    @Override
    public String identificarse(){
        
        String saludar = super.identificarse();
        
        return saludar + " soy de "+cargo+ " y soy feliz";
        
    }
    
    @Override
    public double sueldo(){
        return SUELDO_BASE;
    }

  
    
}
