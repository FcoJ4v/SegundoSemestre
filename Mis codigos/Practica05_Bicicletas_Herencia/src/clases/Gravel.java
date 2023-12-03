package clases;

import java.text.DecimalFormat;

/**
 *
 * @author Codename 47
 */
public class Gravel extends Bicicleta{
    
    protected int talla;

    public Gravel() {
    }

    public Gravel(int codigo, String marca, String modelo, double valorUSD, String transmision, String frenos, int stock, int talla) {
        super(codigo, marca, modelo, valorUSD, transmision, frenos, stock);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        if(talla >= 44 && talla <= 58)
        {
            this.talla = talla;
        }
        else
        {
            System.out.println("La talla debe estar entre 44 y 58.");
        }
        
    }    
    

    @Override
    public double valorBicicleta() {
        double valor = valorUSD * PORCENTAJE_IVA + valorUSD;
        double descuento = valor * DESCUENTO_GRAVEL;
        double valorFinal = valor - descuento;
        return valorFinal * VALOR_USD;
    }

    @Override
    public double valorTotalBicicletas() {
        return valorBicicleta() * stock;
    }

    @Override
    public String informacion() {
        return this.getClass().getSimpleName()+ " " + marca + " " +modelo + " | Talla " + talla + 
                " | Transmisión " + transmision + " | Frenos " + frenos + 
                " | Valor " + new DecimalFormat("$ ###,###").format(valorBicicleta());
    }
    
    
    
}
