
package cl.duoc.clases;


public class Contenedor {
    private int codigo;
    private int tama�o;
    private int peso;
    private boolean refrigerado;
    private Barco barco;
    
    //constructores

    public Contenedor() {
    }

    public Contenedor(int codigo, int tama�o, int peso, boolean refrigerado, Barco barco) {
        this.codigo = codigo;
        this.tama�o = tama�o;
        this.peso = peso;
        this.refrigerado = refrigerado;
        this.barco = barco;
    }

    public int getCodigo() {
        
        return codigo;
    }

    public int getTama�o() {
        return tama�o;
    }

    public int getPeso() {
        return peso;
    }

    public boolean isRefrigerado() {
        return refrigerado;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTama�o(int tama�o) {
        this.tama�o = tama�o;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    //metodos
    
    public boolean eliminarPeso(int kilos){
        int diferencia;
        if(kilos >0 && kilos<peso){
            diferencia= peso - kilos;
            return true;
        }
        return false;
    }
    
    public int valorPagoInspeccion(){
        int calculo;
        calculo = 5 * peso;
        
        return calculo;
    }
    
    public int calcularGastoEnvio(){
        int calculoEnvio = 0;
        if(tama�o ==20){
            calculoEnvio = (barco.getGastoTransporte()/barco.getCapacidadMaxima() )*3500;
            
        }else if(tama�o ==40){
            calculoEnvio = (barco.getGastoTransporte()/barco.getCantContenedoresCargados())*9000;
        }
        return calculoEnvio;
    }
    
    public boolean puedeSubir(){
        if(peso < barco.getCapacidadMaxima()){
            return true;
        }
        return false;
    }
}
