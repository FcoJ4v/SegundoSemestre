
package cl.duoc.clases;


public  class Ingeniero extends Empleado {
    private String especialidad;
    private int nro_proyectos;

    public Ingeniero() {
    }

    public Ingeniero(String especialidad, int nro_proyectos) {
        this.especialidad = especialidad;
        this.nro_proyectos = nro_proyectos;
    }

    public Ingeniero(String rut, String nombre, String apellido, int antiguedad,String especialidad, int nro_proyectos) {
        super(rut, nombre, apellido, antiguedad);
        this.especialidad = especialidad;
        this.nro_proyectos = nro_proyectos;
    }
    
    @Override
    public String identificarse(){
        
        String saludar = super.identificarse();
        
        return saludar + " soy de "+especialidad+ "y tengo "+nro_proyectos+" y no soy feliz";
        
    }
    
    @Override
    public double sueldo(){
        return SUELDO_BASE * nro_proyectos;
    }
    
    
}
