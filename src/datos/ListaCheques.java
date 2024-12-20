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

    private ArrayList<CuentaCorriente.Cheques> listaCheques = new ArrayList<>();

    public ArrayList<CuentaCorriente.Cheques> getListaCheques() {
        return listaCheques;
    }

    public boolean AgregarCheque(CuentaCorriente.Cheques cheque) {
        if (cheque != null) {
            listaCheques.add(cheque);
            return true;
        }
        return false;
    }

    public CuentaCorriente.Cheques obtenerCheque(int pos) {
        if (pos >= 0 && pos < listaCheques.size()) {
            return listaCheques.get(pos);
        }
        return null;
    }

    public CuentaCorriente.Cheques buscarChequePorNumero(String nroCheque) {
        for (CuentaCorriente.Cheques cheque: listaCheques) { 
            if (cheque.getNroCheque() == nroCheque) {
                return cheque;
            }
        }
        return null; 
    }

    public int getTamanio() {
        return listaCheques.size();
    }

}
