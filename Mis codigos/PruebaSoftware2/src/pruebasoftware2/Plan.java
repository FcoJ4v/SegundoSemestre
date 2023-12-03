package pruebasoftware2;
public class Plan
{
    int nroEquipo;
    int datosGB;
    int minutosIncluidos;
    int valorMensual;
    Cliente clientePlan;

    public Plan() {
    }

    public Plan(int nroEquipo, int datosGB, int minutosIncluidos, int valorMensual, Cliente clientePlan) {
        setNroEquipo(nroEquipo);
        this.datosGB = datosGB;
        this.minutosIncluidos = minutosIncluidos;
        this.valorMensual = valorMensual;
        this.clientePlan = clientePlan;
    }

    public int getNroEquipo() {
        return nroEquipo;
    }

    public void setNroEquipo(int nroEquipo) 
    {
        String numero = Integer.toString(nroEquipo);
        if (numero.length() == 9) 
        {
            this.nroEquipo = nroEquipo;
        }
        else
        {
            System.out.println("Error: el numero debe tener solo 9 digitos.");
        }
        
    }

    public int getDatosGB() {
        return datosGB;
    }

    public void setDatosGB(int datosGB) {
        this.datosGB = datosGB;
    }

    public int getMinutosIncluidos() {
        return minutosIncluidos;
    }

    public void setMinutosIncluidos(int minutosIncluidos) {
        this.minutosIncluidos = minutosIncluidos;
    }

    public int getValorMensual() {
        return valorMensual;
    }

    public void setValorMensual(int valorMensual) {
        this.valorMensual = valorMensual;
    }

    public Cliente getClientePlan() {
        return clientePlan;
    }

    public void setClientePlan(Cliente clientePlan) {
        this.clientePlan = clientePlan;
    }

    @Override
    public String toString() {
        return "Plan{" + "nroEquipo=" + nroEquipo + ", datosGB=" + datosGB + ", minutosIncluidos=" + minutosIncluidos + ", valorMensual=" + valorMensual + ", clientePlan=" + clientePlan + '}';
    }
    
    /*
    public String listarDatos()
    {
          String mensajeSalida;
          String mensajeTipo;
          
          if (getClientePlan().getTipoCliente().equals("P")) 
          {
            mensajeTipo = "Cliente Premium";
            mensajeSalida = getClientePlan().getNombreCompleto() + " +569 "+getNroEquipo()+" "+mensajeTipo;
              return mensajeSalida;
          }
          else if (getClientePlan().getTipoCliente().equals("G")) 
          {
            mensajeTipo = "Cliente general";
            mensajeSalida = getClientePlan().getNombreCompleto() + " +569 "+getNroEquipo()+" "+mensajeTipo;
              return mensajeSalida;
          }
          else
          {
              mensajeSalida = getClientePlan().getNombreCompleto() + " +569 "+getNroEquipo()+" cliente sin tipo";
                return mensajeSalida;
          }
          */
    
    
    
    public void listarDatos()
    {
        String mensajeTipo;
        if (getClientePlan().getTipoCliente().equals("P")) 
        {
            mensajeTipo = "Cliente premium";
            System.out.println(getClientePlan().getNombreCompleto()+" +56 "+getNroEquipo()+" "+mensajeTipo);
        }
        else if (getClientePlan().getTipoCliente().equals("G")) 
        {
            mensajeTipo = "Cliente general";
            System.out.println(getClientePlan().getNombreCompleto()+" +56 "+getNroEquipo()+" "+mensajeTipo);
        }
        else
        {
            mensajeTipo = "Cliente sin tipo";
            System.out.println(getClientePlan().getNombreCompleto()+" +56 "+getNroEquipo()+" "+mensajeTipo);
        }    
    }
    
    public double minutosExtra(int minutos)
    {
        double  totalExtra= 0;
        if (minutos >= 0 && minutos <=300) 
        {
            
            totalExtra = minutos * 150;

            if (getClientePlan().getTipoCliente().equals("P"))
            {
                totalExtra = totalExtra * 0.9;
                System.out.println("El total a pagar por minutos extra es de "+totalExtra);
                return totalExtra;
            }
            else
            {
                 System.out.println("El total a pagar por minutos extra es de "+totalExtra);
                 return totalExtra;
            }
        }
        else
        {
            
            System.out.println("Error: Los minutos extra solo van de 0 a 300 minutos.");
            return totalExtra;
        }
        
        
    }
    
    
    public void totalAPagar(int minutos)
    {
        double valorExtra =  this.minutosExtra(minutos);
        System.out.println("El total a pagar por minutos extra es de "+valorExtra);
        double valorTotal = this.getValorMensual() + valorExtra;
        
        System.out.println("El total a pagar este mes, teniendo en cuenta que el valor mensual es de $"+ getValorMensual()+" sumandole \n"
                + " los minutos extra es de $"+valorTotal);
        
    }
        
    public void aumentarCuota(int aumento)
    {
        int nuevoTotalGb = getDatosGB() + aumento;
        System.out.println("Se aumentara la cuota de navegación en "+aumento+" Gbs, la cuota actual es de "+getDatosGB());
        setDatosGB(nuevoTotalGb);
        System.out.println("La cuota aumentada es de "+getDatosGB());
        
    }
    
    public void validarPlan(String rutIngresado, int numeroIngresado)
    {
        if (rutIngresado.equals(getClientePlan().getRut())) 
        {
            System.out.println("Rut valido.");
            if (numeroIngresado == getNroEquipo()) 
            {
                System.out.println("Datos validos, este plan existe.");
            }
            else
            {
                System.out.println("No existe un número asociado a ese rut.");
            }
        }
        else
        {
            System.out.println("Rut no valido , no existe un plan asociado a ese rut.");
        }
    }
 }
        

