package entidades;

public interface OperacionesCuenta {
    void depositar(float monto);
    boolean retirar(float monto);
    boolean transferir(float monto, Cuenta cuentaDestino);
}