package clases;

public class Contenedor {
    
    //Atributos
    private int codigo;
    private int tamaño;
    private int peso;
    private boolean refrigerado;
    private Barco barco;

    //Constructores
    public Contenedor() {
    }

    public Contenedor(int codigo, int tamaño, int peso, boolean refrigerado, Barco barco) {
        this.codigo = codigo;
        this.tamaño = tamaño;
        this.peso = peso;
        this.refrigerado = refrigerado;
        this.barco = barco;
    }

    //Getters & Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        if(tamaño == 20 || tamaño == 40)
        {
            this.tamaño = tamaño;
        }
        else
        {
            System.out.print("El tamaño ingresado debe ser 20 ó 40 pies.");
        }
        
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if(peso <= 0)
        {
            System.out.print("Debe ingresar un peso mayor a 0");
        }
        else if(peso > barco.getCapacidadMaxima())
        {
            System.out.print("El peso del contenedor no puede exceder el límite de capacidad del barco.");
        }
        else
        {
            this.peso = peso;
        }
    }

    public boolean isRefrigerado() {
        return refrigerado;
    }

    public void setRefrigerado(boolean refrigerado) {
        this.refrigerado = refrigerado;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }
    
    //Métodos CUSTOM
    public boolean eliminarPeso(int kilos){
        if(kilos > 0 && kilos < peso)
        {
            peso -= kilos;
            return true;
        }
        return false;
    }
    
    public int valorPagoInspeccion(){
        int valorKilo = 5;
        return peso * valorKilo;
    }
    
    public int calcularGastoEnvio(){
        int gastoEnvio = barco.getGastoTransporte() / barco.getCantContenedoresCargados();
        int adicional;
        if(tamaño == 20)
        {
            adicional = 3500;
        }
        else
        {
            adicional = 9000;
        }
        return gastoEnvio + adicional;
    }
    
    public boolean puedeSubir(){
        return (barco.getCapacidadMaxima() - barco.getPesoActual()) >= peso;
    }
    
}
