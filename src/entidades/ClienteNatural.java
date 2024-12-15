/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ClienteNatural extends Cliente {
    private String identificacion;
    private String fechaNacimiento;
    private String estadoCivil;
    private ArrayList<Cuenta> cuentas;
    public ClienteNatural(String identificacion, String fechaNacimiento, String estadoCivil, String telefono, String correoElectronico, String direccion, String nombre, String apellido, int tipoCliente) {
        super(telefono, correoElectronico, direccion, nombre, apellido, tipoCliente);
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.cuentas = new ArrayList<>();
    } 
    

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
   
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" +
                //"Apellidos: " + getApellido() + "\n" +
                "Identificacion: " + getIdentificacion() + "\n" +
                "Fecha de nacimiento: " + getFechaNacimiento() + "\n" +
                "Estado civil: " +  getEstadoCivil() + "\n" +
                "Telefono: " + getTelefono() + "\n" +
                "Correo electronico: " + getCorreoElectronico() + "\n" +
                "Direccion de residencia: " +  getDireccion() + "\n";
    } 
    
}
