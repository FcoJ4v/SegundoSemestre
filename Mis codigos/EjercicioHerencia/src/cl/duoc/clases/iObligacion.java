
package cl.duoc.clases;

import java.text.DecimalFormat;


public interface iObligacion {
    
    public final String NOMBRE_EMPRESA = "DELTA";
    public final int SUELDO_BASE  = 301000;
    public int VALOR_PROYECTO = 1000000;
    public final DecimalFormat FORMATO_MONEDA = new DecimalFormat("#,##0");
    
    //METODOS
    
    
    
    public double sueldo();
    
    
    
    
}
