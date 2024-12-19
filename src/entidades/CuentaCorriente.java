package entidades;

import java.util.GregorianCalendar;

public class CuentaCorriente extends Cuenta implements OperacionesCuenta {
    private float limiteSobregiro;         
    private int limiteCheques;             
    private String numeroChequera;         
    private float comisionPorCheque;       
    private String titularCuenta;
    private ClienteJuridico clienteJur;

    // Constructor
    public CuentaCorriente(Cliente cliente, float saldoCuenta, int tipoMoneda, String clave,
                           GregorianCalendar fechaCreacion, float limiteSobregiro, int limiteCheques,
                           String numeroChequera, float comisionPorCheque, String titularCuenta, ClienteJuridico clienteJur) {
        super("", cliente, saldoCuenta, tipoMoneda, clave, fechaCreacion, 0); // Tipo cuenta = 0 (Corriente)
        this.limiteSobregiro = limiteSobregiro;
        this.limiteCheques = limiteCheques;
        this.numeroChequera = numeroChequera;
        this.comisionPorCheque = comisionPorCheque;
        this.titularCuenta = titularCuenta;
        this.clienteJur = clienteJur;
    }

    // Métodos de la interfaz OperacionesCuenta
    @Override
    public void depositar(float monto) {
        if (monto > 0) {
            setSaldoCuenta(getSaldoCuenta() + monto);
            System.out.println("Depósito realizado: " + monto + " Nuevo saldo: " + getSaldoCuenta());
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    @Override
    public boolean retirar(float monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
            return false;
        }

        float saldoDisponible = getSaldoCuenta() + limiteSobregiro;
        if (monto <= saldoDisponible) {
            setSaldoCuenta(getSaldoCuenta() - monto);
            System.out.println("Retiro exitoso: " + monto + " Nuevo saldo: " + getSaldoCuenta());
            return true;
        } else {
            System.out.println("Fondos insuficientes. Saldo disponible (incluyendo sobregiro): " + saldoDisponible);
            return false;
        }
    }

    @Override
    public boolean transferir(float monto, Cuenta cuentaDestino) {
        if (monto <= 0) {
            System.out.println("El monto a transferir debe ser mayor a cero.");
            return false;
        }

        float saldoDisponible = getSaldoCuenta() + limiteSobregiro;
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

    // Getters y Setters adicionales
    public float getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(float limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }
    public String getApellidoRepLegal() {
        return clienteJur.getApellido();
    }

    @Override
    public String toString() {
        return "Cuenta Corriente:\n" +
               "\tNúmero de cuenta: " + getNumeroCuenta() + "\n" +
               "\tFecha de apertura: " + getFechaCreacionCorta() + "\n" +
               "\tSaldo actual: " + getSaldoCuenta() + "\n" +
               "\tLímite de sobregiro: " + limiteSobregiro + "\n" +
               "\tLímite de cheques: " + limiteCheques + "\n" +
               "\tNúmero de chequera: " + numeroChequera + "\n" +
               "\tComisión por cheque: " + comisionPorCheque + "\n" +
               "\tTitular de la cuenta: " + titularCuenta;
    }
}