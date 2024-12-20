/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.*;
import entidades.*;

/**
 *
 * @author Administrador
 */

public class ListaCheques {
    private ArrayList<Cheques> listaCheques = new ArrayList<>();

    public ArrayList<Cheques> getListaCheques() {
        return listaCheques;
    }

    public boolean AgregarCheque(Cheques cheque) {
        if (cheque != null) {
            listaCheques.add(cheque);
            return true;
        }
        return false;
    }

    public Cheques obtenerCheque(int pos) {
        if (pos >= 0 && pos < listaCheques.size()) {
            return listaCheques.get(pos);
        }
        return null;
    }

    public Cheques buscarChequePorNumero(String nroCheque) {
        for (Cheques cheque : listaCheques) {
            if (cheque.getNroCheque().equals(nroCheque)) {
                return cheque;
            }
        }
        return null;
    }

    public ArrayList<Cheques> buscarChequesPorCuenta(CuentaCorriente cuenta) {
        ArrayList<Cheques> chequesEncontrados = new ArrayList<>();
        for (Cheques cheque : listaCheques) {
            if (cheque.getCuentaOrigen() == cuenta) {
                chequesEncontrados.add(cheque);
            }
        }
        return chequesEncontrados;
    }

    public ArrayList<Cheques> buscarChequesPorEstado(String estado) {
        ArrayList<Cheques> chequesEncontrados = new ArrayList<>();
        for (Cheques cheque : listaCheques) {
            if (cheque.getEstado().equalsIgnoreCase(estado)) {
                chequesEncontrados.add(cheque);
            }
        }
        return chequesEncontrados;
    }

    public int contarChequesRechazados(CuentaCorriente cuenta) {
        int contador = 0;
        for (Cheques cheque : listaCheques) {
            if (cheque.getCuentaOrigen() == cuenta && 
                cheque.getEstado().equalsIgnoreCase("Rechazado")) {
                contador++;
            }
        }
        return contador;
    }

    public float calcularMontoTotalEmitido(CuentaCorriente cuenta) {
        float total = 0;
        for (Cheques cheque : listaCheques) {
            if (cheque.getCuentaOrigen() == cuenta && 
                !cheque.getEstado().equalsIgnoreCase("Rechazado")) {
                total += cheque.getMonto();
            }
        }
        return total;
    }

    public int getTamanio() {
        return listaCheques.size();
    }
}