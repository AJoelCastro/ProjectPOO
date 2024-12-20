package entidades;

import java.util.GregorianCalendar;
import datos.*;
import java.util.Random;
import javax.swing.*;


public class CuentaCorriente extends Cuenta implements OperacionesCuenta {

    private float limiteSobregiro;
    private int limiteCheques;
    private String numeroChequera;
    private static float comisionPorCheque = 0.05f;
    private static int contChequeras = 0;
    private int chequesEmitidos = 0;
    private ListaCheques listaCheques = new ListaCheques();
    
    public CuentaCorriente(Cliente cliente, float saldoCuenta, int tipoMoneda, String clave,
                           GregorianCalendar fechaCreacion, float limiteSobregiro, int limiteCheques) {
        super("", cliente, saldoCuenta, tipoMoneda, clave, fechaCreacion, 0); // Tipo cuenta = 0 (Corriente)
        this.limiteSobregiro = limiteSobregiro;
        this.limiteCheques = limiteCheques;
    }
    public String generarNumeroChequera() {
        String numChequera = "CHQ2024";
        int dato = ++contChequeras;
        return String.format("%s%03d", numChequera, dato);
    }

    public boolean habilitarChequera() {
        if (getNroChequera() == null || !getNroChequera().equals("CHQ2024999")) {
            setNumeroChequera(generarNumeroChequera());
            return true;
        }
        return false;
    }

    public boolean emitirCheque(float monto,ListaCheques listaCheques) {
        if (monto <= 0) {
            JOptionPane.showMessageDialog(null, "El monto del cheque debe ser mayor a cero.", "Error", 0);
            return false;
        }
        if (chequesEmitidos >= limiteCheques) {
            JOptionPane.showMessageDialog(null, "Límite de cheques alcanzado. Habilite una nueva chequera", "Error", 0);
            return false;
        }

        float saldoDisponible = getSaldoCuenta() + getLimiteSobregiro();
        if (monto <= saldoDisponible) {
            Cheques nuevoCheque = new Cheques(
                Cheques.generarNroCheque(),
                monto,
                "Emitido",
                getFechaCreacionCorta(),
                this
            );
            listaCheques.AgregarCheque(nuevoCheque);
            chequesEmitidos++;
            setSaldoCuenta(getSaldoCuenta() - (monto +  monto * Cheques.comisionPorCheque));
            JOptionPane.showMessageDialog(null, "Cheque emitido: " + nuevoCheque.toString(), "Emisión de Cheque", 1);
            return true;
        }

        JOptionPane.showMessageDialog(null, "Fondos insuficientes para emitir el cheque.", "Error", 0);
        return false;
    }

    public boolean cobrarCheque(String nroCheque, Cuenta cuentaDestino,ListaCheques listaCheques) {
        Cheques cheque = listaCheques.buscarChequePorNumero(nroCheque);

        if (cheque == null) {
            JOptionPane.showMessageDialog(null, "El cheque no existe", "Error", 0);
            return false;
        }

        if (!cheque.verificarValidez()) {
            return false;
        }

        if (!cheque.verificarFondos()) {
            cheque.marcarComoRechazado("Fondos insuficientes");
            return false;
        }
        cuentaDestino.setSaldoCuenta(cuentaDestino.getSaldoCuenta() + cheque.getMonto());
        setSaldoCuenta(getSaldoCuenta() - cheque.getMonto());
        cheque.marcarComoCobrado();

        JOptionPane.showMessageDialog(null, "Cheque cobrado exitosamente", "Cobro de Cheque", 1);
        return true;
    }
    public void setNumeroChequera(String numeroChequera) {
        this.numeroChequera = numeroChequera;
    }

    public String getNroChequera() {
        return numeroChequera;
    }
    
@Override
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

@Override
public boolean retirar(float monto) {
    if (monto <= 0) {
        JOptionPane.showMessageDialog(null, 
            "El monto a retirar debe ser mayor a cero.", 
            "Error en Retiro", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    float saldoDisponible = getSaldoCuenta() + limiteSobregiro;
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

@Override
public boolean transferir(float monto, Cuenta cuentaDestino) {
    if (monto <= 0) {
        JOptionPane.showMessageDialog(null, 
            "El monto a transferir debe ser mayor a cero.", 
            "Error en Transferencia", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    float saldoDisponible = getSaldoCuenta() + limiteSobregiro;
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

    // Getters y Setters adicionales
    public float getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(float limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public String toString() {
        return "Cuenta Corriente:\n"
                + "\tNúmero de cuenta: " + getNumeroCuenta() + "\n"
                + "\tFecha de apertura: " + getFechaCreacionCorta() + "\n"
                + "\tSaldo actual: " + getSaldoCuenta() + "\n"
                + "\tLímite de sobregiro: " + limiteSobregiro + "\n"
                + "\tLímite de cheques: " + limiteCheques + "\n"
                + "\tNúmero de chequera: " + getNroChequera() +"\n"
                + "\tComisión por cheque: " + comisionPorCheque + "\n";
    }
}
