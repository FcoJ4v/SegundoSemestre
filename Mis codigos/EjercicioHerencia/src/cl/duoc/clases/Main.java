
package cl.duoc.clases;


public class Main {
    public static void main(String[] args) {
        Departamento depto = new Departamento();
        Administrativo a1 = new Administrativo("1111-1","Juan","Rivera",5,'c');
        Administrativo a2 = new Administrativo("2222-2","Juana","Rios",5,'a');
        Ingeniero i1 = new Ingeniero("3333-3","Andres","Araya",6,"Informatica",2);
        
        
        System.out.println(depto.registrar(i1));
        System.out.println(depto.registrar(a1));
        System.out.println(depto.getListaEmpleado());
        System.out.println(a1.identificarse());
        
        
        }
    
}
