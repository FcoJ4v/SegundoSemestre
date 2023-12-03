package pruebasoftware2;

public class Cliente
{
    String rut;
    String nombreCompleto;
    String correo;
    String tipoCliente;

    public Cliente() 
    {
    }

    public Cliente(String rut, String nombreCompleto, String correo, String tipoCliente)
    {
        this.rut = rut;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        setTipoCliente(tipoCliente);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        if (tipoCliente.toUpperCase().equals("P")) 
        {
            this.tipoCliente = tipoCliente.toUpperCase();
        }
        else if(tipoCliente.toUpperCase().equals("G"))
        {
            this.tipoCliente = tipoCliente.toUpperCase();
        }
        else
        {
            System.out.println("Tipo de cliente no valido.");
        }
        
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombreCompleto=" + nombreCompleto + ", correo=" + correo + ", tipoCliente=" + tipoCliente + '}';
    }
    
    
   
    
    
    

    
}
