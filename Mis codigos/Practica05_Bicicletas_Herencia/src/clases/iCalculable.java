package clases;

/**
 *
 * @author Codename 47
 */
public interface iCalculable {
    
    final double PORCENTAJE_IVA = .019;
    final double DESCUENTO_MTB = 0.15;
    final double DESCUENTO_GRAVEL = 0.25;
    final double VALOR_USD = 725;
    
    public double valorBicicleta();
    
    public double valorTotalBicicletas();
    
    public String informacion();
    
}
