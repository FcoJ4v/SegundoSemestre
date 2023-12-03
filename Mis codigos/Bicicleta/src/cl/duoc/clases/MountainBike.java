
package cl.duoc.clases;


public final class MountainBike extends Bicicleta {
    private String suspension;
    private double aro;

    public MountainBike() {
    }
    
    

    public MountainBike(String suspension, double aro) {
        this.suspension = suspension;
        this.aro = aro;
    }

    public MountainBike(int codigo, String marca, String modelo, double valorUSD, String transmision, String frenos, int stock, String suspension, double aro) {
        super(codigo, marca, modelo, valorUSD, transmision, frenos, stock);
        this.suspension = suspension;
        this.aro = aro;
    }

    public String getSuspension() {
        return suspension;
    }

    public double getAro() {
        return aro;
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

    public void setSuspension(String suspension) {
        this.suspension = suspension;
    }

    public void setAro(double aro) {
        this.aro = aro;
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
