
package cl.duoc.clases;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    

    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        Suma suma = new Suma();
        AreaCircunferencia area = new AreaCircunferencia();
        TresCalculos tresc  = new TresCalculos();
        
        int opc=0;
        
        while (opc != 4){
           System.out.println("1. Calcular una suma de dos numeros");
           System.out.println("2. Calcular area circunferencia");
           System.out.println("3. Opcion 3");
           System.out.println("4. Salir");
           try{
               
               System.out.println("Escribe una de las opciones");
               opc = sc.nextInt();
        
                switch (opc){

                    case 1:
                        System.out.println("Opcion1: Suma de dos numeros.");

                            System.out.println("Ingrese el primer numero: ");
                            suma.setNum1(sc.nextInt());
                            System.out.println("Ingrese el segundo numero: ");
                            suma.setNum2(sc.nextInt());
                            System.out.println("El resultado de la suma es: "+suma.CalcularSuma());

                        break;
                    case 2:
                        System.out.println("Opcion2: Calculo de circunferencias.");
                        
                            System.out.println("Ingrese el valor del radio");
                            area.setR(sc.nextInt());
                            
                            System.out.println("El resultado del area de la circunferencia es: "+area.CalculoCircunferencia());
                           
                        break;
                    
                    case 3:
                        System.out.println("Opcion3: Calcular suma, resta, multiplicacion, division.");
                        System.out.println("Ingrese el primer numero: ");
                        tresc.setNum1(sc.nextInt());
                        System.out.println("Ingrese el segundo numero: ");
                        tresc.setNum2(sc.nextInt());
                        
                        System.out.println("El resultado de la suma es: "+tresc.CalculoSuma()+
                                "\nEl resultado de la resta es: "+tresc.CalculoResta()+"\nEl resultado de la multiplicacion es: "+tresc.CalculoMult()+
                                "\nEl resultado de la division es: "+tresc.CalculoDiv());
                        
                        
                        break;
                    default:
                        System.out.println("Opcion ingresada no valida.");

                }
            } catch (InputMismatchException e){
                System.out.println("Debe ingresar un numero");
                sc.nextInt();
            }   
        }
        
    }    
        
}
