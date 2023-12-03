package pruebasoftware2;

import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        
        Scanner miScanner = new Scanner(System.in);
        
        /*
        Cliente objCliente = new Cliente("777777777-7", "Juanito Perez", "albogb@gmail.com", "P");
        Cliente objCliente2 = new Cliente("111", "Angel qliao", "angel@qliao.cl", "P");
        objCliente.setNombreCompleto("Jorge el Culiao");
        
        
        Plan objPlan = new Plan(987254469, 200, 50, 8000, objCliente);
    
        objPlan.listarDatos();

        objPlan.totalAPagar(250);
        objPlan.aumentarCuota(30);
        objPlan.validarPlan("777777777-7", 987254469);
        */
        
        
        int opcion =0;
        Cliente objCliente1 = new Cliente();
        Plan objPlan1 = new Plan();
        while (opcion != 5) 
        {            
            System.out.println("Menú de la prueba");
            System.out.println("1.- Crear un Plan");
            System.out.println("2.- Modificar el tipo de Cliente");
            System.out.println("3.- Obtener total minutos adicionales");
            System.out.println("4.- Obtener total a pagar.");
            System.out.println("5.- Salir");
            opcion = Integer.parseInt(miScanner.nextLine());
            
            switch (opcion) {
                case 1:
                    
                        System.out.println("Ingrese los datos del cliente: \n");
                        System.out.println("Ingrese el Rut del cliente:");
                        String rutIngresado = miScanner.nextLine();
                        objCliente1.setRut(rutIngresado);
                        
                        System.out.println("Ingrese el Nombre del cliente:");
                        String nombreIngresado = miScanner.nextLine();
                        objCliente1.setNombreCompleto(nombreIngresado);
                        
                        System.out.println("Ingrese Correo del cliente:");
                        String correoIngresado = miScanner.nextLine();
                        objCliente1.setCorreo(correoIngresado);
                        
                        System.out.println("Ingrese el tipo de cliente, puede ser P o G:");
                        String tipoIngresado = miScanner.nextLine();
                        objCliente1.setTipoCliente(tipoIngresado);
                        
                        
                        
                        
                        System.out.println("Ingrese los datos del Plan que va a crear:\n");
                        System.out.println("Ingrese el número de equipo del Plan:");
                        int nroIngresado = Integer.parseInt(miScanner.nextLine());
                        objPlan1.setNroEquipo(nroIngresado);
                        
                        System.out.println("Ingrese la cuota de navegacion en gigabytes: ");
                        int cuotaIngresada =  Integer.parseInt(miScanner.nextLine());
                        objPlan1.setDatosGB(cuotaIngresada);
                        
                        System.out.println("Ingrese la cantidad de minutos del plan:");
                        int minutosIngresados =  Integer.parseInt(miScanner.nextLine());
                        objPlan1.setMinutosIncluidos(minutosIngresados);
                        
                        
                        System.out.println("Ingrese el valor mensual del Plan:");
                        int valorIngresado =  Integer.parseInt(miScanner.nextLine());
                        objPlan1.setValorMensual(valorIngresado);
                        
                        objPlan1.setClientePlan(objCliente1);
                        
                        objPlan1.listarDatos();
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo tipo de cliente para su plan anteriormente creado:");
                    String nuevoTipo = miScanner.nextLine();
                    
                    objCliente1.setTipoCliente(nuevoTipo);
                    System.out.println("Nuevo tipo de cliente: "+ objCliente1.getTipoCliente());
                    
                    
                    break;
                    
                case 3:
                    System.out.println("Ingrese la cantidad de minutos adicionales que se usaron este mes:");
                    int minutos = Integer.parseInt(miScanner.nextLine());
                    
                    objPlan1.minutosExtra(minutos);
                    
                    
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad de minutos adicionales para poder calcular el total del mes:");
                    int minutosTotal = Integer.parseInt(miScanner.nextLine());
                    objPlan1.totalAPagar(minutosTotal);
                    break;
                case 5:
                    System.out.println("Adiós, vayase a la chucha.");
                    break;
                default:
                    throw new AssertionError();
            }
        }
        
    }
    
}
