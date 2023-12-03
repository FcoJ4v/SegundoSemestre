
package javaapplication1;

public class JavaApplication1 {

   
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        System.out.println("Mi nombre es Francisco Alvarez \n y esto es un salto de linea");
        
        
        //VARIABLES PRIMITIVAS
        
        //NUMERICAS
        
        byte edad = 10;
        short valorHora = 10000;
        int sueldo = 5000000;
        long edadUniverso = 1231232131231232223L;
        float promedio = 5.6f;
        double porcentaje = 0.16;
        
        //Texto
        
        char letra = 'a';
        char otraLetra = 'a';
        
        //Si bien no es una variable todos la usan como tal
        String frase = "Saludos";
        String nombreCompleto = "Elba Lazo Perdido";
        String nombre_Completo = "Armando Casas de Adobe";
        
        boolean respuesta =  true;
        boolean isVivo = true;
        boolean isEgresado  = false;
        double _10 = 10; //se puede con el guion bajo, pero si es solo el numero no se puede
        final double PI = 3.141592654; //con el final se declara una variable constante
        
        
        System.out.println(nombreCompleto);
        System.out.println("Hola me llamo" + nombreCompleto);
        System.out.printf("Hola me llamo %s y tengo %d años",nombreCompleto,edad);
        
        
    }
    
}
