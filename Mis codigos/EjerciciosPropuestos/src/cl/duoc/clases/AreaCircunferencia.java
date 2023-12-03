
package cl.duoc.clases;

public class AreaCircunferencia {
    
    //declaracion de vaariables
    
    private int r, calculo;
    final double pi = 3.1416;
    
    //constructores

    public AreaCircunferencia() {
    }

    public AreaCircunferencia(int r, int calculo) {
        this.r = r;
        this.calculo = calculo;
    }
    
    
    //getters y setters

    public int getR() {
        return r;
    }

    public int getCalculo() {
        return calculo;
    }

    public double getPi() {
        return pi;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void setCalculo(int calculo) {
        this.calculo = calculo;
    }
    
    
    //metodo calculo
    
    public double CalculoCircunferencia(){
        double calculo =  pi * Math.pow(r, 2);
        return calculo;
    }
    
}
