/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.*;

/**
 *
 * @author artur
 */
public abstract class Cuenta {
    private String numeroCuenta;
    private float saldoCuenta;
    private int tipoMoneda;
    private String clave;
    private GregorianCalendar fechaCreacion;
    private int tipoCuenta;
    private static int totalCtaAhorro = 0;
    private static int totalCtaCorriente = 0;
    private Cliente cliente;
    private static final Set<String> numerosGenerados = new HashSet<>();

    // Constructor con parametros
    public Cuenta(String numeroCuenta, Cliente cliente, float saldoCuenta, int tipoMoneda, String clave, GregorianCalendar fechaCreacion , int tipoCuenta){ 
        this.saldoCuenta = saldoCuenta;
        this.tipoCuenta = tipoCuenta;
        this.clave = clave;
        this.tipoMoneda = tipoMoneda;
        this.fechaCreacion = new GregorianCalendar();
        if(tipoCuenta == 1)
            ++totalCtaAhorro;
        else
            ++totalCtaCorriente;
        this.numeroCuenta = generarNumeroCuenta();
    }
    
    private String generarNumeroCuenta() {
        String numCuenta = "";
        Random random = new Random();

        do {
            StringBuilder sb = new StringBuilder();
            switch (tipoCuenta) {
                case 1:
                    sb.append("A");
                    break;
                case 0:
                    sb.append("C");
                    break;
            }
            
            for (int i = 0; i < 9; i++) {
                sb.append(random.nextInt(10));
            }

            numCuenta = sb.toString();
        } while (numerosGenerados.contains(numCuenta));

        numerosGenerados.add(numCuenta);
        return numCuenta;
    }   
    
    public String getFechaCreacionCorta() {
        int dia, mes, anio;
        dia = getFechaCreacion().get(Calendar.DAY_OF_MONTH);
        mes = getFechaCreacion().get(Calendar.MONTH)+1;
        anio = getFechaCreacion().get(Calendar.YEAR);
        return (dia<=9?"0"+dia:dia) + "/" + (mes<=9?"0"+mes:mes) + "/" + anio;
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

    public GregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(GregorianCalendar fechaCreacion) {
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