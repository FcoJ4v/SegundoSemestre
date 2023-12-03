
package cl.duoc.clases;

import java.util.ArrayList;


public class Bodega {
    private ArrayList <Bicicleta> bicicletas = new ArrayList<>();

    public Bodega() {
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }
    
    
    //metodos
    public int registrarBicicleta(Bicicleta nueva){
       if(buscarPorCodigo(nueva.getCodigo()) == null){
           bicicletas.add(nueva);
           return 0;
       }else{
           for(Bicicleta b: bicicletas){
               if(b.getCodigo()==nueva.getCodigo()){
                  b.setStock(b.getStock()+nueva.getStock());
                  return 1;
               }
               
           }
           
       }
       return -1;                
    }   
            
    public Bicicleta buscarPorCodigo(int codigo){
        for(Bicicleta b: bicicletas){
            if(b.getCodigo()==codigo){
                return b;
            }
        }
        return null;
    }
    
    public boolean venderBicicleta(int codigo){
        for(Bicicleta b: bicicletas){
            if(b.getCodigo()==codigo && b.getStock()>0){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Gravel> listarBicicletasGravel(){
        ArrayList<Gravel> gravel = new ArrayList();
        
        for(Bicicleta b: bicicletas){
            if(b instanceof Gravel){
                gravel.add((Gravel)b);
            }
        }return gravel;
    }
    
}
    
    

