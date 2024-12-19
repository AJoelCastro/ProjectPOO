/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
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
        JOptionPane.showMessageDialog(null, 
            "Depósito realizado: " + monto + "\nNuevo saldo: " + getSaldoCuenta(), 
            "Depósito Exitoso", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, 
            "El monto a depositar debe ser mayor a cero.", 
            "Error en Depósito", JOptionPane.ERROR_MESSAGE);
    }
}


public boolean retirar(float monto) {
    if (monto <= 0) {
        JOptionPane.showMessageDialog(null, 
            "El monto a retirar debe ser mayor a cero.", 
            "Error en Retiro", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    float saldoDisponible = getSaldoCuenta();
    if (monto <= saldoDisponible) {
        setSaldoCuenta(getSaldoCuenta() - monto);
        JOptionPane.showMessageDialog(null, 
            "Retiro exitoso: " + monto + "\nNuevo saldo: " + getSaldoCuenta(), 
            "Retiro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        return true;
    } else {
        JOptionPane.showMessageDialog(null, 
            "Fondos insuficientes.\nSaldo disponible (incluyendo sobregiro): " + saldoDisponible, 
            "Error en Retiro", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}


public boolean transferir(float monto, Cuenta cuentaDestino) {
    if (monto <= 0) {
        JOptionPane.showMessageDialog(null, 
            "El monto a transferir debe ser mayor a cero.", 
            "Error en Transferencia", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    float saldoDisponible = getSaldoCuenta();
    if (monto <= saldoDisponible) {
        setSaldoCuenta(getSaldoCuenta() - monto);
        cuentaDestino.setSaldoCuenta(cuentaDestino.getSaldoCuenta() + monto);
        JOptionPane.showMessageDialog(null, 
            "Transferencia exitosa: " + monto + 
            "\nNuevo saldo: " + getSaldoCuenta() +
            "\nSaldo cuenta destino: " + cuentaDestino.getSaldoCuenta(), 
            "Transferencia Exitosa", JOptionPane.INFORMATION_MESSAGE);
        return true;
    } else {
        JOptionPane.showMessageDialog(null, 
            "Fondos insuficientes para realizar la transferencia.", 
            "Error en Transferencia", JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
    
}  // fin de la clase CuentaAhorro