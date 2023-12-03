
package cl.duoc.clases;

import java.util.ArrayList;


public class Catamaran {
    private String pais_fabricacion;
    private int cantidad_max_personas;
    private ArrayList<Persona> personas;

    public Catamaran() {
       personas = new ArrayList<>();
    }

    public Catamaran(String pais_fabricacion, int cantidad_max_personas, ArrayList<Persona> personas) {
        this.pais_fabricacion = pais_fabricacion;
        this.cantidad_max_personas = cantidad_max_personas;
        this.personas = personas;
    }

    public String getPais_fabricacion() {
        return pais_fabricacion;
    }

    public int getCantidad_max_personas() {
        return cantidad_max_personas;
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPais_fabricacion(String pais_fabricacion) {
        this.pais_fabricacion = pais_fabricacion;
    }

    public void setCantidad_max_personas(int cantidad_max_personas) {
        this.cantidad_max_personas = cantidad_max_personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }



//Metodos
    
    
public boolean registrarPersona(Persona p){
     if(buscarPersona(p.getRut()) == null)
        {
            personas.add(p);
            return true;
        }
     return false;
}

public boolean bajarPasajero(String rut){
    for (Persona p : personas) {
            if(p.getRut() == rut){
                personas.remove(p);
                return true;
            }
        }
        return false;
}

public Persona buscarPersona(String codigo){
   for (Persona p : personas){
                if(p.getRut() == codigo){
                    return p;
                }
            }return null;
            
        }

public ArrayList<Pasajero> listadoPasajeros(){
    ArrayList<Pasajero> pasajeros = new ArrayList<>();
    
    for (Persona p : personas) 
        {
            if(p instanceof Pasajero)
            {
                pasajeros.add((Pasajero)p);
            }
        }
        return pasajeros;
}
    
}

