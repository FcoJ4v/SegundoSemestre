
package cl.duoc.clases;

public abstract class Empleado extends Departamento implements iObligacion{
    
    protected String rut;
    protected String nombre;
    protected String apellido;
    protected int antiguedad;

    public Empleado() {
    }

    public Empleado(String rut, String nombre, String apellido, int antiguedad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.antiguedad = antiguedad;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getAntiguedad() {
        return antiguedad;
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

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    //metodos
    
    public String identificarse(){
    
    return this.getClass().getSimpleName() + ": Hola me llamo " + nombre + " " + apellido;
    
    }
    
    @Override
    public double sueldo(){
        return SUELDO_BASE;
    }
    
}
