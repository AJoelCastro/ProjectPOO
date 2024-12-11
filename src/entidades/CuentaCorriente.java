/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author jf451
 */
public class CuentaCorriente extends Cuenta {
    private String razonSocial;
    private String nombreRepLegal;
    private String apellidoRepLegal;
    
    private float limiteGasto;
    
    public CuentaCorriente(String razonSocial, String nombreRepLegal, String apellidoRepLegal, 
            float limiteGasto, String clave, int tipoCuenta) {
        super(clave, tipoCuenta);
        this.razonSocial = razonSocial;
        this.nombreRepLegal = nombreRepLegal;
        this.apellidoRepLegal = apellidoRepLegal;
        this.limiteGasto = limiteGasto;
    }

    public CuentaCorriente(String razonSocial, String nombreRepLegal, String apellidoRepLegal, 
            float limiteGasto, String clave, float saldoCuenta, int tipoCuenta) {
        super(saldoCuenta, clave, tipoCuenta);
        this.razonSocial = razonSocial;
        this.nombreRepLegal = nombreRepLegal;
        this.apellidoRepLegal = apellidoRepLegal;
        this.limiteGasto = limiteGasto;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setNombreRepLegal(String nombreRepLegal) {
        this.nombreRepLegal = nombreRepLegal;
    }
    
    public String getNombreRepLegal() {
        return nombreRepLegal;
    }

    public void setApellidoRepLegal(String apellidoRepLegal) {
        this.apellidoRepLegal = apellidoRepLegal;
    }
    
    public String getApellidoRepLegal() {
        return apellidoRepLegal;
    }

    public void setLimiteGasto(float limiteGasto) {
        this.limiteGasto = limiteGasto;
    }
    
    public float getLimiteGasto() {
        return limiteGasto;
    }
    
    @Override
    public String toString() {
        return super.toString() +
               "\n\tRazon Social: " + getRazonSocial() +
               "\n\tRepresentante Legal: " + getNombreRepLegal() + " " + getApellidoRepLegal() +
               "\n\tSaldo de ahorros: " + getSaldoCuenta() +
               "\n\tLimite de gasto: " + getLimiteGasto();
    }
}
