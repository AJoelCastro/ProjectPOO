/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.Calendar;
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
    
    public void depositar(float monto) {
        if (monto > 0) {
            setSaldoCuenta(getSaldoCuenta() + monto);
            System.out.println("Depósito realizado: " + monto + " Nuevo saldo: " + getSaldoCuenta());
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    public boolean retirar(float monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
            return false;
        }

        float saldoDisponible = getSaldoCuenta();
        if (monto <= saldoDisponible) {
            setSaldoCuenta(getSaldoCuenta() - monto);
            System.out.println("Retiro exitoso: " + monto + " Nuevo saldo: " + getSaldoCuenta());
            return true;
        } else {
            System.out.println("Fondos insuficientes. Saldo disponible (incluyendo sobregiro): " + saldoDisponible);
            return false;
        }
    }

    public boolean transferir(float monto, Cuenta cuentaDestino) {
        if (monto <= 0) {
            System.out.println("El monto a transferir debe ser mayor a cero.");
            return false;
        }

        float saldoDisponible = getSaldoCuenta();
        if (monto <= saldoDisponible) {
            setSaldoCuenta(getSaldoCuenta() - monto);
            cuentaDestino.setSaldoCuenta(cuentaDestino.getSaldoCuenta() + monto);
            System.out.println("Transferencia exitosa: " + monto +
                    " Nuevo saldo: " + getSaldoCuenta() +
                    " Saldo cuenta destino: " + cuentaDestino.getSaldoCuenta());
            return true;
        } else {
            System.out.println("Fondos insuficientes para realizar la transferencia.");
            return false;
        }
    }
    
}  // fin de la clase CuentaAhorro