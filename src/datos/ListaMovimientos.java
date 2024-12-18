/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;
import entidades.*;
import java.util.*;
/**
 *
 * @author ArcosArce
 */
public class ListaMovimientos {
    public class Movimiento {
        private String tipoMovimiento;
        private float monto;
        private GregorianCalendar fechaMovimiento;
        private Cuenta cuentaOrigen;
        private Cuenta cuentaDestino;

        public Movimiento(String tipoMovimiento, float monto, Cuenta cuentaOrigen, Cuenta cuentaDestino) {
            this.tipoMovimiento = tipoMovimiento;
            this.monto = monto;
            this.cuentaOrigen = cuentaOrigen;
            this.cuentaDestino = cuentaDestino;
            this.fechaMovimiento = new GregorianCalendar();
        }

        @Override
        public String toString() {
            return "Movimiento{" +
                    "tipo='" + tipoMovimiento + '\'' +
                    ", monto=" + monto +
                    ", fecha=" + fechaMovimiento.getTime() +
                    ", cuenta origen=" + cuentaOrigen.getNumeroCuenta() +
                    (cuentaDestino != null ? ", cuenta destino=" + cuentaDestino.getNumeroCuenta() : "") +
                    '}';
        }

        public String getTipoMovimiento() { return tipoMovimiento; }
        public float getMonto() { return monto; }
        public GregorianCalendar getFechaMovimiento() { return fechaMovimiento; }
        public Cuenta getCuentaOrigen() { return cuentaOrigen; }
        public Cuenta getCuentaDestino() { return cuentaDestino; }
    }

    private ArrayList<Movimiento> listaMovimientos;

    public ListaMovimientos() {
        this.listaMovimientos = new ArrayList<>();
    }

    public boolean registrarDeposito(Cuenta cuenta, float monto) {
        if (monto <= 0) {
            System.out.println("El monto a depositar debe ser mayor a cero.");
            return false;
        }

        cuenta.setSaldoCuenta(cuenta.getSaldoCuenta() + monto);
        Movimiento movimiento = new Movimiento("Depósito", monto, cuenta, null);
        listaMovimientos.add(movimiento);
        System.out.println("Depósito realizado: " + monto + " Nuevo saldo: " + cuenta.getSaldoCuenta());
        return true;
    }

    public boolean registrarRetiro(Cuenta cuenta, float monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
            return false;
        }

        if (cuenta instanceof CuentaCorriente) {
            CuentaCorriente cuentaCorriente = (CuentaCorriente) cuenta;
            float saldoDisponible = cuenta.getSaldoCuenta() + cuentaCorriente.getLimiteSobregiro();

            if (monto <= saldoDisponible) {
                cuenta.setSaldoCuenta(cuenta.getSaldoCuenta() - monto);
                Movimiento movimiento = new Movimiento("Retiro", monto, cuenta, null);
                listaMovimientos.add(movimiento);
                System.out.println("Retiro exitoso: " + monto + " Nuevo saldo: " + cuenta.getSaldoCuenta());
                return true;
            } else {
                System.out.println("Fondos insuficientes. Saldo disponible (incluyendo sobregiro): " + saldoDisponible);
                return false;
            }
        } else if (cuenta instanceof CuentaAhorro) {
            if (monto <= cuenta.getSaldoCuenta()) {
                cuenta.setSaldoCuenta(cuenta.getSaldoCuenta() - monto);
                Movimiento movimiento = new Movimiento("Retiro", monto, cuenta, null);
                listaMovimientos.add(movimiento);
                System.out.println("Retiro exitoso: " + monto + " Nuevo saldo: " + cuenta.getSaldoCuenta());
                return true;
            } else {
                System.out.println("Fondos insuficientes.");
                return false;
            }
        }

        return false;
    }

    public boolean registrarTransferencia(Cuenta cuentaOrigen, Cuenta cuentaDestino, float monto) {
        if (monto <= 0) {
            System.out.println("El monto a transferir debe ser mayor a cero.");
            return false;
        }

        if (cuentaOrigen instanceof CuentaCorriente) {
            CuentaCorriente cuentaCorrienteOrigen = (CuentaCorriente) cuentaOrigen;
            float saldoDisponible = cuentaOrigen.getSaldoCuenta() + cuentaCorrienteOrigen.getLimiteSobregiro();

            if (monto <= saldoDisponible) {
                cuentaOrigen.setSaldoCuenta(cuentaOrigen.getSaldoCuenta() - monto);
                cuentaDestino.setSaldoCuenta(cuentaDestino.getSaldoCuenta() + monto);
                
                Movimiento movimiento = new Movimiento("Transferencia", monto, cuentaOrigen, cuentaDestino);
                listaMovimientos.add(movimiento);
                
                System.out.println("Transferencia exitosa: " + monto +
                        " Nuevo saldo cuenta origen: " + cuentaOrigen.getSaldoCuenta() +
                        " Nuevo saldo cuenta destino: " + cuentaDestino.getSaldoCuenta());
                return true;
            } else {
                System.out.println("Fondos insuficientes para realizar la transferencia.");
                return false;
            }
        } else if (cuentaOrigen instanceof CuentaAhorro) {
            if (monto <= cuentaOrigen.getSaldoCuenta()) {
                cuentaOrigen.setSaldoCuenta(cuentaOrigen.getSaldoCuenta() - monto);
                cuentaDestino.setSaldoCuenta(cuentaDestino.getSaldoCuenta() + monto);
                
                Movimiento movimiento = new Movimiento("Transferencia", monto, cuentaOrigen, cuentaDestino);
                listaMovimientos.add(movimiento);
                
                System.out.println("Transferencia exitosa: " + monto +
                        " Nuevo saldo cuenta origen: " + cuentaOrigen.getSaldoCuenta() +
                        " Nuevo saldo cuenta destino: " + cuentaDestino.getSaldoCuenta());
                return true;
            } else {
                System.out.println("Fondos insuficientes para realizar la transferencia.");
                return false;
            }
        }

        return false;
    }

    public ArrayList<Movimiento> obtenerHistorialMovimientos(Cuenta cuenta) {
        ArrayList<Movimiento> historialCuenta = new ArrayList<>();
        for (Movimiento movimiento : listaMovimientos) {
            if (movimiento.getCuentaOrigen().equals(cuenta) || 
                (movimiento.getCuentaDestino() != null && movimiento.getCuentaDestino().equals(cuenta))) {
                historialCuenta.add(movimiento);
            }
        }
        return historialCuenta;
    }

    public ArrayList<Movimiento> obtenerTodosLosMovimientos() {
        return new ArrayList<>(listaMovimientos);
    }
}
