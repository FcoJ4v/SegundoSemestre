package clases;

import java.text.DecimalFormat;

/**
 *
 * @author Codename 47
 */
public final class MountainBike extends Bicicleta{
    
    private String suspension;
    private String tamaño;
    private double aro;

    public MountainBike() {
    }
        
    
    public MountainBike(int codigo, String marca, String modelo, double valorUSD, String transmision, String frenos, int stock, String suspension, String tamaño, double aro) {
        super(codigo, marca, modelo, valorUSD, transmision, frenos, stock);
        this.suspension = suspension;
        this.tamaño = tamaño;
        this.aro = aro;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamano(String tamaño) {
        if(tamaño.equals("XS") || tamaño.equals("S") || tamaño.equals("M") || tamaño.equals("L") || tamaño.equals("XL"))
        {
            this.tamaño = tamaño;
        }
        else
        {
            System.out.println("El tamaño debe ser XS, S, M, L o XL");
        }
        
    }

    public double getAro() {
        return aro;
    }

    public void setAro(double aro) {
        this.aro = aro;
    }
    
    @Override
    public double valorBicicleta() {
        double valor = valorUSD * PORCENTAJE_IVA + valorUSD;
        double descuento = valor * DESCUENTO_MTB;
        double valorFinal = valor - descuento;
        return valorFinal * VALOR_USD;
    }

    @Override
    public double valorTotalBicicletas() {
        return valorBicicleta() * stock;
    }

    @Override
    public String informacion() {
        return this.getClass().getSimpleName()+ " " + marca + " " +modelo + " | Suspensión " + suspension + " | Transmisión " + transmision + 
                " | Tamaño " + tamaño + " - " + "Aro " + aro + " | Frenos " + frenos +
                " | Valor " + new DecimalFormat("$ ###,###").format(valorBicicleta());
    }
    
    
    
    
    
}
