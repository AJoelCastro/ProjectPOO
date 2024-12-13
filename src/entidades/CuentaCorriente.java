package entidades;

import datos.*;

import java.time.LocalDate;


public class CuentaCorriente extends Cuenta implements OperacionesCuenta {

    private float limiteSobregiro;
    private int limiteCheques;
    private String numeroChequera;
    private float comisionPorCheque;
    private String titularCuenta;
    private ClienteJuridico clienteJur;

    // Constructor
    public CuentaCorriente(Cliente cliente, float saldoCuenta, int tipoMoneda, String clave,

                           LocalDate fechaCreacion, float limiteSobregiro, int limiteCheques,
                           String numeroChequera, float comisionPorCheque, String titularCuenta) {
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

        float saldoDisponible = getSaldoCuenta() + getLimiteSobregiro();
        if (monto <= saldoDisponible) {
            setSaldoCuenta(getSaldoCuenta() - monto);
            cuentaDestino.setSaldoCuenta(cuentaDestino.getSaldoCuenta() + monto);
            System.out.println("Transferencia exitosa: " + monto
                    + " Nuevo saldo: " + getSaldoCuenta()
                    + " Saldo cuenta destino: " + cuentaDestino.getSaldoCuenta());
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

        public boolean emitirCheque(String nroCheque, float monto) {
            if (monto <= 0) {
                System.out.println("El monto del cheque debe ser mayor a cero.");
                return false;
            }
            if (listaCheques.getTamanio() >= limiteCheques) {
                System.out.println("Límite de cheques alcanzado. No puede emitir más cheques.");
                return false;
            }

            float saldoDisponible = getSaldoCuenta() + getLimiteSobregiro();
            if (monto <= saldoDisponible) {
                Cheques cheque = new Cheques(nroCheque, monto, "Emitido", getFechaCreacionCorta());
                listaCheques.AgregarCheque(cheque);
                setSaldoCuenta(getSaldoCuenta() - monto);
                System.out.println("Cheque emitido: " + cheque.toString());
                return true;
            } else {
                System.out.println("Fondos insuficientes para emitir el cheque.");
                return false;
            }
        }

        public boolean cobrarCheque(String nroCheque, String apellido, Cuenta cuentaDestino) {
            Cheques cheque = listaCheques.buscarChequePorNumero(nroCheque);
            ListaCuenta listC = new ListaCuenta();
            int buscado = listC.buscarPorApellido(apellido);
            if (cheque == null) {
                System.out.println("El cheque no existe");
                return false;
            }
            if (cheque.getEstado().compareToIgnoreCase("Emitido") == 0) {
                if (buscado != -1) {
                    if (cheque.getMonto() <= listC.obtenerCuenta(buscado).getSaldoCuenta()) {
                        cheque.setEstado("Cobrado");
                        cuentaDestino.setSaldoCuenta(cuentaDestino.getSaldoCuenta() + cheque.getMonto());
                        System.out.println("El cheque ha sido cobrado exitosamente.");
                        return true;
                    } else {
                        System.out.println("Fondos insuficientes en la cuenta para cobrar este cheque.");
                        listC.obtenerCuenta(buscado).setSaldoCuenta(cheque.getMonto() + listC.obtenerCuenta(buscado).getSaldoCuenta());
                        return false;
                    }
                } else {
                    System.out.println("El apellido no se encuentra...");
                    listC.obtenerCuenta(buscado).setSaldoCuenta(cheque.getMonto() + listC.obtenerCuenta(buscado).getSaldoCuenta());
                    return false;
                }
            }else {
                System.out.println("El cheque no está disponible para cobro... \nEstado actual:" + cheque.getEstado());
                return false;
            }
        }
        @Override
        public String toString() {
           
          return "Cuenta Corriente:\n" +
                 "\tNúmero de cuenta: " + getNumeroCuenta() + "\n" +
                 "\tFecha de apertura: " + fechaCreacion + "\n" +
                 "\tSaldo actual: " + getSaldoCuenta() + "\n" +
                 "\tLímite de sobregiro: " + limiteSobregiro + "\n" +
                 "\tLímite de cheques: " + limiteCheques + "\n" +
                 "\tNúmero de chequera: " + numeroChequera + "\n" +
                 "\tComisión por cheque: " + comisionPorCheque + "\n" +
                 "\tTitular de la cuenta: " + titularCuenta;
        }
    }
}
