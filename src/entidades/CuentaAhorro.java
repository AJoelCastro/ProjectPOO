/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author artur
 */
public class CuentaAhorro extends Cuenta implements InteresMensual {
    private static float tasaInteresAnual = 0.04f;
    private ClienteNatural clienteNat;
    private ClienteJuridico clienteJur;
    private int limiteRetiros;
    private GregorianCalendar fechaCorte; 
    private ArrayList<String> beneficiarios; 
    // Constructor con parametros
    public CuentaAhorro(String numeroCuenta, ClienteNatural clienteNat,float saldoCuenta, int tipoMoneda, String clave, GregorianCalendar fechaCreacion , int tipoCuenta, int limiteRetiros, GregorianCalendar fechaCorte) { 
        super(numeroCuenta, clienteNat ,saldoCuenta,  tipoMoneda,  clave,  fechaCreacion , tipoCuenta);
        this.limiteRetiros = limiteRetiros;
        this.fechaCorte = fechaCorte;
        this.beneficiarios = new ArrayList<>();
    }
    
    public CuentaAhorro(String numeroCuenta, ClienteJuridico clienteJur,float saldoCuenta, int tipoMoneda, String clave, GregorianCalendar fechaCreacion , int tipoCuenta, int limiteRetiros, GregorianCalendar fechaCorte) { 
        super(numeroCuenta, clienteJur ,saldoCuenta,  tipoMoneda,  clave,  fechaCreacion , tipoCuenta);
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

    public ClienteJuridico getClienteJur() {
        return clienteJur;
    }

    public void setClienteJur(ClienteJuridico clienteJur) {
        this.clienteJur = clienteJur;
    }

    public int getLimiteRetiros() {
        return limiteRetiros;
    }

    public void setLimiteRetiros(int limiteRetiros) {
        this.limiteRetiros = limiteRetiros;
    }

    public GregorianCalendar getFechaCorte() {
        return fechaCorte;
    }

    public void setFechaCorte(GregorianCalendar fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    public ArrayList<String> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(ArrayList<String> beneficiarios) {
        this.beneficiarios = beneficiarios;
    }
    public String getApellidoCliente() {
        return clienteNat.getApellido();
    }
    
    @Override
    public void calcularInteresMensual() {

    }   
}  // fin de la clase CuentaAhorro