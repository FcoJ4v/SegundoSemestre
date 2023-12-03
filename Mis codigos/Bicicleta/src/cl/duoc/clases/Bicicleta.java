
package cl.duoc.clases;

public abstract class Bicicleta extends Bodega implements iCalculable{
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

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorUSD() {
        return valorUSD;
    }

    public String getTransmision() {
        return transmision;
    }

    public String getFrenos() {
        return frenos;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorUSD(double valorUSD) {
        this.valorUSD = valorUSD;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    
}
