package clases;

/**
 *
 * @author Codename 47
 */
public abstract class Bicicleta implements iCalculable{
    
    protected int codigo;
    protected String marca;
    protected String modelo;
    protected double valorUSD;
    protected String transmision;
    protected String frenos;
    protected int stock;

    public Bicicleta() {
    }

    public Bicicleta(int codigo, String marca, String modelo, double valorUSD, String transmision, String frenos, int stock) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.valorUSD = valorUSD;
        this.transmision = transmision;
        this.frenos = frenos;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.trim().length() > 0)
        {
            this.marca = marca;
        }
        else
        {
            System.out.println("Debe ingresar una marca válida.");
        }
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if(modelo.trim().length() > 0)
        {
            this.modelo = modelo;
        }
        else
        {
            System.out.println("Debe ingresar un modelo válido.");
        }
        
    }

    public double getValorUSD() {
        return valorUSD;
    }

    public void setValorUSD(double valorUSD) {
        this.valorUSD = valorUSD;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public String getFrenos() {
        return frenos;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Bicicleta{" + "codigo=" + codigo + ", marca=" + marca + ", modelo=" + modelo + ", ValorUSD=" + valorUSD + ", transmision=" + transmision + ", frenos=" + frenos + ", stock=" + stock + '}';
    }

//    
//    /**
//     * Este método solo está retornando el tipo de clase, marca y modelo.
//     * @return String
//     */
//    @Override
//    public String informacion() {
//        return this.getClass().getSimpleName()+ " " + marca + " " +modelo;
//    }
    
    
    
}
