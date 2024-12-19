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
public class ListaClientes {
    private ArrayList<Cliente> listaClientes=new ArrayList<>();
     
    public ListaClientes(){
        
    }
    
    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    public boolean agregarCliente(Cliente cliente) {
        if(cliente != null) {
            listaClientes.add(cliente);
            return true;
        }
        return false;
    }
    
    public Cliente obtenerCliente(int pos) {
        if(pos>=0 && pos<listaClientes.size()) 
            return listaClientes.get(pos);
        return null;
    }
    
    public Cliente buscarPorApellido(String apellido) {
        for(Cliente client: listaClientes) {
            if(client.getApellido().compareToIgnoreCase(apellido)==0)
                return client;
        }
        return null;
    }
    
    public int getTamanio() {
        return listaClientes.size();
    }
       
    public ArrayList<Cliente> listarClientesPorTipo(int tipo) {
        Cliente cliente;
        ArrayList<Cliente> lista = new ArrayList<>();
        for(int i=0; i<getTamanio(); i++) {
            cliente = listaClientes.get(i);
            if(cliente.getTipoCliente()==tipo) 
                lista.add(cliente);
        }
        return lista;
    }  
    private ArrayList<Cliente> cliente = new ArrayList<>();
   
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
    
    public static boolean validacionLetras(String texto) {
    for (int i = 0; i < texto.length(); i++) {
        char c = texto.charAt(i);
        if (!Character.isLetter(c) && !Character.isSpaceChar(c)) {
            return false; 
        }
    }
    return true;
}
    
    public static boolean validarPasaporte(String pasaporte) {
    if (pasaporte.length() != 8) {
        return false; 
    }
    if (!Character.isLetter(pasaporte.charAt(0))) {
        return false; 
    }
    for (int i = 1; i < pasaporte.length(); i++) {
        if (!Character.isDigit(pasaporte.charAt(i))) {
            return false; 
        }
    }
    return true; 
    }
    
    public static boolean validarDNI(String dni) {
    if (dni.length() != 8) {
        return false; 
    }
    for (int i = 0; i < dni.length(); i++) {
        if (!Character.isDigit(dni.charAt(i))) {
            return false;
        }
    }
    return true; 
}
    
    public  String SolicitarFecha(String fechaTexto) {
    GregorianCalendar fecha = null;

    try {
        String[] partes = fechaTexto.split("-");
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

        return String.format("%02d/%02d/%04d",
                fecha.get(GregorianCalendar.DAY_OF_MONTH),
                fecha.get(GregorianCalendar.MONTH) + 1,
                fecha.get(GregorianCalendar.YEAR));
    } catch (Exception e) {
        return null; 
    } 
    }
    
    public static boolean validacionTelefono(String telefono) {
    if (telefono == null || telefono.length() != 9) {
        return false;
    }
    for (char c : telefono.toCharArray()) {
        if (!Character.isDigit(c)) {
            return false;
        }
    }
    return true; 
    }
    
    public static boolean validarRucNatural(String ruc) {

    if (ruc.length() != 10) {
        return false;
    }
    return ruc.matches("[0-9]+");
    }

    public static boolean validarRucJuridica(String ruc) {

        if (ruc.length() != 11) {
            return false;
        }
        return ruc.matches("[0-9]+");
    }
    
}
