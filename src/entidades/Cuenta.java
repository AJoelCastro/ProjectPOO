/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author artur
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private float saldoCuenta;
    private int tipoMoneda; // 0: soles, 1: dolares
    private String clave;
    LocalDate fechaCreacion;
    private int tipoCuenta; // 0: Cuenta Corriente, 1: Cuenta Ahorro
    private static int totalCtaAhorro = 0;
    private static int totalCtaCorriente = 0;
    private Cliente cliente;
    public Cuenta(){}
    // Constructor con parametros
    public Cuenta(String numeroCuenta, Cliente cliente, float saldoCuenta, int tipoMoneda, String clave, LocalDate fechaCreacion , int tipoCuenta){ 
        this.saldoCuenta = saldoCuenta;
        this.tipoCuenta = tipoCuenta;
        this.clave = clave;
        this.tipoMoneda = tipoMoneda;
        this.fechaCreacion=LocalDate.now();
        if(tipoCuenta == 1)
            ++totalCtaAhorro;
        else
            ++totalCtaCorriente;
        this.numeroCuenta = generarNumeroCuenta();
    }
    
    public String generarNumeroCuenta() {
        int numDig=0, num=0, dato=0;
        String numCuenta = "";
        switch(tipoCuenta) {
            case 1:
                num = dato = totalCtaAhorro;
                numCuenta = "A";
                break;
            case 2:
                num = dato = totalCtaCorriente;
                numCuenta = "C";
                break;
        }
        while (num > 9) {
            numDig++;
            num /= 10;
        }
        numDig++;
        for(int i=0;i<10-numDig; i++)
            numCuenta += "0";
        numCuenta += dato;        
        return numCuenta;
    }   
    

    public boolean validarClave(String clave) {
        return (getClave().compareTo(clave)==0);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public float getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(float saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public int getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(int tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(int tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public static int getTotalCtaAhorro() {
        return totalCtaAhorro;
    }

    public static void setTotalCtaAhorro(int totalCtaAhorro) {
        Cuenta.totalCtaAhorro = totalCtaAhorro;
    }

    public static int getTotalCtaCorriente() {
        return totalCtaCorriente;
    }

    public static void setTotalCtaCorriente(int totalCtaCorriente) {
        Cuenta.totalCtaCorriente = totalCtaCorriente;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}