/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author artur
 */
public class CuentaAhorro extends Cuenta implements InteresMensual {
    private static float tasaInteresAnual = 0.04f;
    private ClienteNatural clienteNat;
    private int limiteRetiros;
    private LocalDate fechaCorte; 
    private ArrayList<String> beneficiarios; 
 
    // Constructor con parametros
    public CuentaAhorro(){
        
    }
    public CuentaAhorro(String numeroCuenta, ClienteNatural clienteNat,float saldoCuenta, int tipoMoneda, String clave, LocalDate fechaCreacion , int tipoCuenta, int limiteRetiros, LocalDate fechaCorte) { 
        super(numeroCuenta, clienteNat ,saldoCuenta,  tipoMoneda,  clave,  fechaCreacion , tipoCuenta);
        this.limiteRetiros = limiteRetiros;
        this.fechaCorte = fechaCorte;
        this.beneficiarios = new ArrayList<>();
    }
    
    
    public static void modificarTasaInteresAnual(float tasaInteresA) {
        tasaInteresAnual = tasaInteresA;
    }
    
    public static float obtenerTasaInteresAnual() {
        return tasaInteresAnual;
    }
    
     public String getApellidoCliente() {
        return clienteNat.getApellido();
    }

    public ClienteNatural getClienteNat() {
        return clienteNat;
    }

    public void setClienteNat(ClienteNatural clienteNat) {
        this.clienteNat = clienteNat;
    }

    public int getLimiteRetiros() {
        return limiteRetiros;
    }

    public void setLimiteRetiros(int limiteRetiros) {
        this.limiteRetiros = limiteRetiros;
    }

    public LocalDate getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(LocalDate fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public ArrayList<String> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(ArrayList<String> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }


    @Override
    public String generarNumeroCuenta() {
        int numDig=0, num=0, dato=0;
        String numCuenta = "";
        while (num > 9) {
            numDig++;
            num /= 10;
        }
        numDig++;
        for(int i=0;i<10-numDig; i++)
            numCuenta += "0";
        numCuenta += dato;        
        return numCuenta;

    public String getApellidoCliente() {
        return clienteNat.getApellido();

    }
    
    @Override
    public void calcularInteresMensual() {
        
    }   
}  // fin de la clase CuentaAhorro