package clases;

public class Barco {

    //Atributos
    private String codigo;
    private String nombre;
    private String pais;
    private int capacidadMaxima;
    private int pesoActual;
    private int cantContenedoresCargados;
    private int gastoTransporte;

    //Constructores
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
    
    //Getters y Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.length() == 5)
        {
            this.codigo = codigo;
        }
        else
        {
            System.out.print("El código debe ser de 5 caracteres de longitud.");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if(capacidadMaxima >= 10000 && capacidadMaxima <= 20000)
        {
            this.capacidadMaxima = capacidadMaxima;
        }
        else
        {
            System.out.print("La capacidad del barco debe ser entre 10.000 y 20.000 kilogramos.");
        }
    }

    public int getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(int pesoActual) {
        this.pesoActual = pesoActual;
    }

    public int getCantContenedoresCargados() {
        return cantContenedoresCargados;
    }

    public void setCantContenedoresCargados(int cantContenedoresCargados) {
        this.cantContenedoresCargados = cantContenedoresCargados;
    }

    public int getGastoTransporte() {
        return gastoTransporte;
    }

    public void setGastoTransporte(int gastoTransporte) {
        this.gastoTransporte = gastoTransporte;
    }
    
    //Métodos CUSTOM
    public void subirContenedor(int peso,int tamaño){
        this.pesoActual += peso;
        if(tamaño == 20)
        {
            this.cantContenedoresCargados+=1;
        }
        else
        {
            this.cantContenedoresCargados+=2;
        }
        
    }
    
    
}
