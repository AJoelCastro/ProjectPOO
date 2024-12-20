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
    
    public CuentaCorriente(Cliente cliente, float saldoCuenta, int tipoMoneda, String clave,
                           GregorianCalendar fechaCreacion, float limiteSobregiro, int limiteCheques) {
        super("", cliente, saldoCuenta, tipoMoneda, clave, fechaCreacion, 0); // Tipo cuenta = 0 (Corriente)
        this.limiteSobregiro = limiteSobregiro;
        this.limiteCheques = limiteCheques;
    }
    
    public CuentaCorriente(float saldoCuenta, int tipoMoneda, String clave,
                           GregorianCalendar fechaCreacion, float limiteSobregiro, int limiteCheques,
                           String numeroChequera, float comisionPorCheque, String titularCuenta, ClienteJuridico clienteJur) {
        super("", clienteJur, saldoCuenta, tipoMoneda, clave, fechaCreacion, 0); // Tipo cuenta = 0 (Corriente)
        this.limiteSobregiro = limiteSobregiro;
        this.limiteCheques = limiteCheques;
        this.numeroChequera = numeroChequera;
        this.comisionPorCheque = comisionPorCheque;
        this.titularCuenta = titularCuenta;
        this.clienteJur = clienteJur;
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
    

    public class Cheques {

        private String nroCheque;
        private float monto;
        private String estado;
        private ListaCheques listaCheques = new ListaCheques();
        private String fechaEmision;

        public Cheques(String nroCheque, float monto, String estado, String fechaEmision) {
            this.nroCheque = nroCheque;
            this.monto = monto;
            this.estado = estado;
            this.fechaEmision = fechaEmision;
        }

        public String getNroCheque() {
            return nroCheque;
        }

        public void setNroCheque(String nroCheque) {
            this.nroCheque = nroCheque;
        }

        public float getMonto() {
            return monto;
        }

        public void setMonto(float monto) {
            this.monto = monto;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String generarNroCheque() {
            Random random = new Random();
            int numeroR = 10000 + random.nextInt(90000);
            return String.valueOf(numeroR);
        }

        public String generarNumeroChequera() {
            int numDig = 0, num, dato;
            String numChequera = "";
            num = dato = ++contChequeras;
            numChequera = "CHQ2024";
            while (num > 9) {
                numDig++;
                num /= 10;
            }
            numDig++;
            for (int i = 0; i < 3 - numDig; i++) {
                numChequera += "0";
            }
            numChequera += dato;
            return numChequera;
        }

        public boolean habilitarChequera() {
            if (generarNumeroChequera().compareToIgnoreCase("CHQ2024999") != 0) {
                setNumeroChequera(generarNumeroChequera());
                return true;
            } else {
                return false;
            }
        }

        public boolean emitirCheque(float monto) {
            if (monto <= 0) {
                JOptionPane.showMessageDialog(null,"El monto del cheque debe ser mayor a cero.", "Error", 0);
                return false;
            }
            if (listaCheques.getTamanio() >= limiteCheques) {
                JOptionPane.showMessageDialog(null,"Límite de cheques alcanzado. No puede emitir más cheques. Habilite una nueva Chequera", "Error", 0);
                return false;
            }

            float saldoDisponible = getSaldoCuenta() + getLimiteSobregiro();
            if (monto <= saldoDisponible) {
                Cheques cheque = new Cheques(generarNroCheque(), monto, "Emitido", getFechaCreacionCorta());
                listaCheques.AgregarCheque(cheque);
                setSaldoCuenta(getSaldoCuenta() - monto);
                JOptionPane.showMessageDialog(null,"Cheque emitido: " + cheque.toString(),"Emision de Cheque", 1);
                return true;
            } else {
                JOptionPane.showMessageDialog(null,"Fondos insuficientes para emitir el cheque.","Error", 0);
                return false;
            }
        }

        public boolean cobrarCheque(String nroCheque, String apellido, Cuenta cuentaDestino) {
            Cheques cheque = listaCheques.buscarChequePorNumero(nroCheque);
            ListaCuenta listC = new ListaCuenta();
            int buscado = listC.buscarPorApellido(apellido);
            if (cheque == null) {
                JOptionPane.showMessageDialog(null,"El cheque no existe","Error", 0);
                return false;
            }
            if (cheque.getEstado().compareToIgnoreCase("Emitido") == 0) {
                if (buscado != -1) {
                    if (cheque.getMonto() <= listC.obtenerCuenta(buscado).getSaldoCuenta()) {
                        cheque.setEstado("Cobrado");
                        cuentaDestino.setSaldoCuenta(cuentaDestino.getSaldoCuenta() + cheque.getMonto());
                        JOptionPane.showMessageDialog(null,"El cheque ha sido cobrado exitosamente.","Cobro de Cheque", 1);
                        listC.obtenerCuenta(buscado).setSaldoCuenta(listC.obtenerCuenta(buscado).getSaldoCuenta() - cheque.getMonto() * comisionPorCheque);
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null,"Fondos insuficientes en la cuenta para cobrar este cheque.","Error", 0);
                        listC.obtenerCuenta(buscado).setSaldoCuenta(cheque.getMonto() + listC.obtenerCuenta(buscado).getSaldoCuenta());
                        return false;
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"El apellido no se encuentra...","Error", 0);
                    listC.obtenerCuenta(buscado).setSaldoCuenta(cheque.getMonto() + listC.obtenerCuenta(buscado).getSaldoCuenta());
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null,"El cheque no está disponible para cobro... \nEstado actual:" + cheque.getEstado(),"Error", 0);
                return false;
            }
        }
        
        

        @Override
        public String toString() {
            return "Cheque:\n"
                    + "\tNumero de Chequera:" + getNroChequera() + "\n"
                    + "\tNumero de cheque:" + getNroCheque() + "\n"
                    + "\tMonto:" + getMonto() + "\n"
                    + "\tEstado:" + getEstado() + "\n"
                    + "\tEmitido por:" + getCliente().getApellido() + "\n"
                    + "\tFecha de emision:" + getFechaCreacionCorta();
        }

    }
}