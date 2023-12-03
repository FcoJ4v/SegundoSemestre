
package cl.duoc.clases;


public class Gravel extends Bicicleta{
    
    protected int talla;

    public Gravel() {
    }

    public Gravel(int talla) {
        this.talla = talla;
    }

    public Gravel(int codigo, String marca, String modelo, double valorUSD, String transmision, String frenos, int stock,int talla ) {
        super(codigo, marca, modelo, valorUSD, transmision, frenos, stock);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public double getValorUSD() {
        return valorUSD;
    }

    @Override
    public String getTransmision() {
        return transmision;
    }

    public String getFrenos() {
        return frenos;
    }

    @Override
    public int getStock() {
        return stock;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setValorUSD(double valorUSD) {
        this.valorUSD = valorUSD;
    }

    @Override
    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public void setFrenos(String frenos) {
        this.frenos = frenos;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
}
