
package cl.duoc.clases;

public class Barco {
    private String codigo;
    private String nombre;
    private String pais;
    private int capacidadMaxima;
    private int pesoActual;
    private int cantContenedoresCargados;
    private int gastoTransporte;
    
    //constructor

    public Barco() {
    }

    public Barco(String codigo, String nombre, String pais, int capacidadMaxima, int pesoActual, int cantContenedoresCargados, int gastoTransporte) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pais = pais;
        this.capacidadMaxima = capacidadMaxima;
        this.pesoActual = pesoActual;
        this.cantContenedoresCargados = cantContenedoresCargados;
        this.gastoTransporte = gastoTransporte;
    }
    
    //setters y getters

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPesoActual() {
        return pesoActual;
    }

    public int getCantContenedoresCargados() {
        return cantContenedoresCargados;
    }

    public int getGastoTransporte() {
        return gastoTransporte;
    }

    public void setCodigo(String codigo) {
        if(codigo.length()==5){
            System.out.println("El codigo ingresado esta correcto");
            this.codigo = codigo;
        }else{
            System.out.println("El codigo ingresado no esta correcto ");
        }
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if(this.capacidadMaxima >=10000 && this.capacidadMaxima<=20000){
            System.out.println("La capacidad cumple.");
        
        
        this.capacidadMaxima = capacidadMaxima;
        }else{
            System.out.println("La capacidad del barco no cumple las condiciones");
        }
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setPesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }

    public void setCantContenedoresCargados(int cantContenedoresCargados) {
        this.cantContenedoresCargados = cantContenedoresCargados;
    }

    public void setGastoTransporte(int gastoTransporte) {
        this.gastoTransporte = gastoTransporte;
    }
    
    
    //metodos
    
    public void subirContenedor(int peso,int tamaño){
        if(tamaño==20 || tamaño==40){
            cantContenedoresCargados++;
        }
    }
}
