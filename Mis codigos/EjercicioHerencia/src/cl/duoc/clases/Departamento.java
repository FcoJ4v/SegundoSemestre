
package cl.duoc.clases;

import java.util.ArrayList;

public class Departamento {
    
    private ArrayList <Empleado> listaEmpleado = new ArrayList<>();

    public Departamento() {
    }

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }
    
    //metodos
    
    public boolean registrar(Empleado nuevo){
        
        if(buscar(nuevo.getRut()) == null){
            listaEmpleado.add(nuevo);
            return true;
        }
        return false;        
        }
    
    public boolean despedir (String rut){
        Empleado e = buscar(rut);
        if(e != null){
            listaEmpleado.remove(e);
            return true;
        }
        return false;
        }
    
    public Empleado buscar(String rut){
        for(Empleado e: listaEmpleado){
            if(e.getRut().equals(rut)){
                return e;
            }
        }
        return null;
        }
    
      
      public double totalSueldos(){
          return Empleado.SUELDO_BASE;
      }
      
    }
    
    

    
    

