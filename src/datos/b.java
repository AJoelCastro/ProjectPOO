/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.*;
import java.util.*;
/**
 *
 * @author artur
 */
public class b {
    private ArrayList<Cliente> cliente = new ArrayList<>();
   
   public ClienteNatural ingresoDatosClienteNatural(){
     Scanner scanner = new Scanner(System.in);
     
    System.out.print("Ingrese el nombre: ");
    String nombre = scanner.nextLine();
    
    System.out.print("Ingrese el apellido: ");
    String apellido = scanner.nextLine();
    
    System.out.print("Ingrese la identificación (DNI o  pasaporte): ");
    String identificacion = scanner.nextLine();
    
    System.out.print("Ingrese la dirección:");
    String direccion = scanner.nextLine();
    
    System.out.print("Ingrese el teléfono: ");
    String telefono = scanner.nextLine();
    
    System.out.print("Ingrese el email:");
    String email = scanner.nextLine();
    
    System.out.print("Ingrese el estado civil:");
    String estadoCivil = scanner.nextLine(); 
    
    ClienteNatural clienteNatural = new ClienteNatural(identificacion, fechaNacimiento(), estadoCivil, telefono, email, direccion, nombre, apellido,1);
   
    cliente.add(clienteNatural);
    
    return clienteNatural;
   }
   
   public ClienteJuridico ingresarDatosClienteJuridico(){
     Scanner scanner = new Scanner(System.in);
    
   System.out.print("Ingrese el nombre del representante legal:");
    String nombre= scanner.nextLine();
     
    System.out.print("Ingrese el apellido: ");
    String apellido = scanner.nextLine();
    
    System.out.print("Ingrese el teléfono:");
    String telefono = scanner.nextLine();
    
    System.out.print("Ingrese el email: ");
    String email = scanner.nextLine();
    
    System.out.print("Ingrese el nombre de la empresa (razón social): ");
    String razonSocial = scanner.nextLine();

    System.out.print("Ingrese el RUC:");
    String ruc = scanner.nextLine();
    
    System.out.print("Ingrese la dirección fiscal y/o operaciones: ");
    String direccion = scanner.nextLine();
    
    System.out.print("Ingrese el documento de constitucion de la empresa: ");
    String documento = scanner.nextLine();
        
    ClienteJuridico clienteJuridico = new ClienteJuridico(razonSocial, ruc, documento, telefono, email, direccion, nombre, apellido,2);
   
    cliente.add(clienteJuridico);
    
    return clienteJuridico; 
   }
    public void mostrarClientesNaturales() {
            for (Cliente clientes : cliente) {
                if (clientes instanceof ClienteNatural) {  
                    System.out.println(clientes);  
                }
            }
        }
    public void mostrarClientesJuridicos() {
        for (Cliente clientes : cliente) {
            if (clientes instanceof ClienteJuridico) {  
                System.out.println(clientes);  
            }
        }
    }
    
    public String fechaNacimiento (){
        GregorianCalendar fechaNacimiento = solicitarFecha("Ingresa tu fecha de nacimiento en el formato dd-mm-aaaa:");
        
        return  String.format("%02d/%02d/%04d%n",
                fechaNacimiento.get(GregorianCalendar.DAY_OF_MONTH),
                fechaNacimiento.get(GregorianCalendar.MONTH),
                fechaNacimiento.get(GregorianCalendar.YEAR));
    }
   public static GregorianCalendar solicitarFecha(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar fecha = null;

        while (fecha == null) {
            System.out.println(mensaje);
            String entrada = scanner.nextLine();

            try {
                String[] partes = entrada.split("-");
                if (partes.length != 3) throw new IllegalArgumentException("Formato incorrecto");

                int dia = Integer.parseInt(partes[0]);
                int mes = Integer.parseInt(partes[1]) - 1;
                int anio = Integer.parseInt(partes[2]);

                GregorianCalendar tempFecha = new GregorianCalendar(anio, mes, dia);

                if (tempFecha.get(GregorianCalendar.YEAR) == anio &&
                        tempFecha.get(GregorianCalendar.MONTH) == mes &&
                        tempFecha.get(GregorianCalendar.DAY_OF_MONTH) == dia) {
                    fecha = tempFecha; 
                } else {
                    throw new IllegalArgumentException("Fecha no válida");
                }
            } catch (Exception e) {
                System.out.println("Fecha inválida o formato incorrecto,inténtalo nuevamente");
            }
        }

        return fecha; 
    }
}
