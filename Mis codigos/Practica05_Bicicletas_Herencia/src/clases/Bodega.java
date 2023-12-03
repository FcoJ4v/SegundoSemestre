package clases;

import java.util.ArrayList;

/**
 *
 * @author Codename 47
 */
public class Bodega {
    
    private ArrayList<Bicicleta> bicicletas; //Bicicleta es el nombre de la clase y bicicletas es el nombre de la coleccion

    public Bodega() {
        bicicletas = new ArrayList<>();
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }
    
    
    
    public int registraBicicleta(Bicicleta nueva){
        if(buscarBicicleta(nueva.getCodigo()) == null)
        {
            bicicletas.add(nueva);
            return 0;
        }
        else
        {
            for (Bicicleta b : bicicletas) 
            {
                if(b.getCodigo() == nueva.getCodigo())
                {
                    b.setStock(b.getStock() + nueva.getStock());
                    return 1;
                }
            }
        }
        return -1;
    }
    
    public boolean venderBicicleta(int codigo){
        for (Bicicleta b : bicicletas) 
        {
            if(b.getCodigo() == codigo)
            {
                bicicletas.remove(b);
                return true;
            }
        }
        return false;
    }
    
    public Bicicleta buscarBicicleta(int codigo){
        for (Bicicleta b : bicicletas) 
        {
            if(b.getCodigo() == codigo)
            {
                return b;
            }
        }
        return null;
    }
    
    public ArrayList<Gravel> listarBicicletasGravel(){
        ArrayList<Gravel> gravel = new ArrayList<>();
        for (Bicicleta b : bicicletas) 
        {
            if(b instanceof Gravel)
            {
                gravel.add((Gravel)b);
            }
        }
        return gravel;
    }
    
    public double totalPosiblesGanancias(){
        double total = 0;
        for (Bicicleta b : bicicletas) 
        {
            total += b.valorTotalBicicletas();
        }
        return total;
    }
    
    
    
    
}
