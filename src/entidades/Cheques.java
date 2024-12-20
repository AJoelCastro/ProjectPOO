/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import java.util.Random;
import javax.swing.JOptionPane;
import datos.ListaCheques;

/**
 *
 * @author ArcosArce
 */
public class Cheques {
    private String nroCheque;
    private float monto;
    private String estado;
    private String fechaEmision;
    private CuentaCorriente cuentaOrigen;
    public static float comisionPorCheque = 0.05f;

    public Cheques(String nroCheque, float monto, String estado, String fechaEmision, CuentaCorriente cuentaOrigen) {
        this.nroCheque = nroCheque;
        this.monto = monto;
        this.estado = estado;
        this.fechaEmision = fechaEmision;
        this.cuentaOrigen = cuentaOrigen;
    }

    // Getters y Setters
    public String getNroCheque() { return nroCheque; }
    public void setNroCheque(String nroCheque) { this.nroCheque = nroCheque; }
    public float getMonto() { return monto; }
    public void setMonto(float monto) { this.monto = monto; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public CuentaCorriente getCuentaOrigen() { return cuentaOrigen; }

    public static String generarNroCheque() {
        Random random = new Random();
        int numeroR = 10000 + random.nextInt(90000);
        return String.valueOf(numeroR);
    }

    public boolean verificarValidez() {
        if (this.estado.equals("Cobrado")) {
            JOptionPane.showMessageDialog(null, "El cheque ya ha sido cobrado", "Error", 0);
            return false;
        }
        if (this.estado.equals("Rechazado")) {
            JOptionPane.showMessageDialog(null, "El cheque ha sido rechazado", "Error", 0);
            return false;
        }
        if (this.cuentaOrigen == null) {
            JOptionPane.showMessageDialog(null, "Cuenta origen inválida", "Error", 0);
            return false;
        }
        return true;
    }

    public boolean verificarFondos() {
        float saldoDisponible = cuentaOrigen.getSaldoCuenta() + cuentaOrigen.getLimiteSobregiro();
        return monto <= saldoDisponible;
    }

    public void marcarComoCobrado() {
        this.estado = "Cobrado";
    }

    public void marcarComoRechazado(String motivo) {
        this.estado = "Rechazado";
        JOptionPane.showMessageDialog(null, "Cheque rechazado: " + motivo, "Rechazo de Cheque", 0);
    }

    @Override
    public String toString() {
        return "Cheque:\n"
                + "\tNumero de Chequera:" + cuentaOrigen.getNroChequera() + "\n"
                + "\tNumero de cheque:" + getNroCheque() + "\n"
                + "\tMonto:" + getMonto() + "\n"
                + "\tEstado:" + getEstado() + "\n"
                + "\tEmitido por:" + cuentaOrigen.getCliente().getApellido() + "\n"
                + "\tFecha de emision:" + fechaEmision;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }
}

