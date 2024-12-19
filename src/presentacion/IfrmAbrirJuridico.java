/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;
import datos.*;
import entidades.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author ArcosArce
 */
public class IfrmAbrirJuridico extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrmAbrirJuridico
     */
    public IfrmAbrirJuridico() {
        initComponents();
    }
    public IfrmAbrirJuridico(ListaClientes listaClientes, ListaCuenta listaCuentas) {
        initComponents();
        this.listaClientes = listaClientes;
        this.listaCuentas = listaCuentas;
        panRegistro.setEnabled(false);
        habilitarComponentesRegistro(false);
    }
    private void habilitarComponentesRegistro(boolean habilitar) {
        jrbAhorro.setEnabled(habilitar);
        jrbCorriente.setEnabled(habilitar);
        txtDepositoInicial.setEnabled(habilitar);
        txtClave.setEnabled(habilitar);
        jrbSoles.setEnabled(habilitar);
        jrbDolares.setEnabled(habilitar);
        btnFinalizar.setEnabled(habilitar);
        btnCancelar.setEnabled(habilitar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgCuenta = new javax.swing.ButtonGroup();
        btgMoneda = new javax.swing.ButtonGroup();
        panRegistro = new javax.swing.JPanel();
        jrbAhorro = new javax.swing.JRadioButton();
        jrbCorriente = new javax.swing.JRadioButton();
        lblTipoCuenta = new javax.swing.JLabel();
        lblDepositoInicial = new javax.swing.JLabel();
        txtDepositoInicial = new javax.swing.JTextField();
        lblClave = new javax.swing.JLabel();
        lblMoneda = new javax.swing.JLabel();
        jrbSoles = new javax.swing.JRadioButton();
        jrbDolares = new javax.swing.JRadioButton();
        txtClave = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        PanBusqueda = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblRuc = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btgCuenta.add(jrbAhorro);
        jrbAhorro.setText("Ahorro");
        jrbAhorro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAhorroActionPerformed(evt);
            }
        });

        btgCuenta.add(jrbCorriente);
        jrbCorriente.setText("Corriente");
        jrbCorriente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCorrienteActionPerformed(evt);
            }
        });

        lblTipoCuenta.setText("Tipo de cuenta :");

        lblDepositoInicial.setText("Deposito inicial :");

        lblClave.setText("Clave de acceso :");

        lblMoneda.setText("Tipo de moneda :");

        btgMoneda.add(jrbSoles);
        jrbSoles.setText("Soles");
        jrbSoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbSolesActionPerformed(evt);
            }
        });

        btgMoneda.add(jrbDolares);
        jrbDolares.setText("Dolares");

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panRegistroLayout = new javax.swing.GroupLayout(panRegistro);
        panRegistro.setLayout(panRegistroLayout);
        panRegistroLayout.setHorizontalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDepositoInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMoneda, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panRegistroLayout.createSequentialGroup()
                                .addComponent(jrbAhorro)
                                .addGap(18, 18, 18)
                                .addComponent(jrbCorriente))
                            .addComponent(txtDepositoInicial)
                            .addComponent(txtClave)
                            .addGroup(panRegistroLayout.createSequentialGroup()
                                .addComponent(jrbSoles)
                                .addGap(28, 28, 28)
                                .addComponent(jrbDolares)))
                        .addGap(53, 53, 53))
                    .addGroup(panRegistroLayout.createSequentialGroup()
                        .addComponent(btnFinalizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addGap(12, 12, 12))))
        );
        panRegistroLayout.setVerticalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbAhorro)
                    .addComponent(jrbCorriente)
                    .addComponent(lblTipoCuenta))
                .addGap(18, 18, 18)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepositoInicial)
                    .addComponent(txtDepositoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClave)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMoneda)
                    .addComponent(jrbSoles)
                    .addComponent(jrbDolares))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar)
                    .addComponent(btnCancelar))
                .addGap(14, 14, 14))
        );

        PanBusqueda.setBackground(new java.awt.Color(204, 204, 255));

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTitulo.setText("Consulta cliente");

        lblRuc.setText("RUC ");

        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });

        btnBusqueda.setText("Buscar");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanBusquedaLayout = new javax.swing.GroupLayout(PanBusqueda);
        PanBusqueda.setLayout(PanBusquedaLayout);
        PanBusquedaLayout.setHorizontalGroup(
            PanBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanBusquedaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PanBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRuc)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusqueda, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanBusquedaLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(90, 90, 90))
        );
        PanBusquedaLayout.setVerticalGroup(
            PanBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanBusquedaLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblRuc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBusqueda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addComponent(panRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanBusqueda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbAhorroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAhorroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbAhorroActionPerformed

    private void jrbCorrienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCorrienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbCorrienteActionPerformed

    private void jrbSolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbSolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbSolesActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if (clienteSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un cliente primero");
            return;
        }

        if (!jrbAhorro.isSelected() && !jrbCorriente.isSelected()) {
            JOptionPane.showMessageDialog(this, "Seleccione un tipo de cuenta");
            return;
        }

        if (!jrbSoles.isSelected() && !jrbDolares.isSelected()) {
            JOptionPane.showMessageDialog(this, "Seleccione un tipo de moneda");
            return;
        }

        String strMonto = txtDepositoInicial.getText().trim();
        String clave = txtClave.getText().trim();

        if (strMonto.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
            return;
        }

        if (!ListaCuenta.validacionClave(clave)) {
            JOptionPane.showMessageDialog(this, "La clave debe tener 8 dígitos numéricos");
            return;
        }

        try {
            float monto = Float.parseFloat(strMonto);
            if (monto <= 0) {
                JOptionPane.showMessageDialog(this, "El monto debe ser mayor a cero");
                return;
            }

            int tipoMoneda = jrbSoles.isSelected() ? 0 : 1;

            if (jrbAhorro.isSelected()) {
                CuentaAhorro cuenta = new CuentaAhorro(
                    "",
                    clienteSeleccionado,
                    monto,
                    tipoMoneda,
                    clave,
                    new GregorianCalendar(),
                    1,
                    5,
                    new GregorianCalendar()
                );
                listaCuentas.agregarCuenta(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de ahorro creada exitosamente.\nNúmero de cuenta: " + cuenta.getNumeroCuenta() + "\nClave: " + clave);
            } else if (jrbCorriente.isSelected()) {
                CuentaCorriente cuenta = new CuentaCorriente(
                    clienteSeleccionado,
                    monto,
                    tipoMoneda,
                    clave,
                    new GregorianCalendar(),
                    5000.00f,
                    100,
                    "CHQ001",
                    10.00f,
                    clienteSeleccionado.getNombre() + " " + clienteSeleccionado.getApellido(),
                    clienteSeleccionado
                );
                listaCuentas.agregarCuenta(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta corriente creada exitosamente.\nNúmero de cuenta: " + cuenta.getNumeroCuenta() + "\nClave: " + clave);
            }

            JOptionPane.showMessageDialog(this, "Cuenta creada exitosamente");
            limpiarFormulario();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Monto inválido");
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed
    private void limpiarFormulario() {
        txtRuc.setText("");
        txtDepositoInicial.setText("");
        txtClave.setText("");
        btgCuenta.clearSelection();
        btgMoneda.clearSelection();
        clienteSeleccionado = null;
        habilitarComponentesRegistro(false);
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarFormulario();
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
         String ruc = txtRuc.getText().trim();

        if (ruc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un número de RUC válido");
            return;
        }
        
        ClienteJuridico clienteJur = listaClientes.buscarPorRuc(ruc);

        if (clienteJur != null) {
            clienteSeleccionado = clienteJur;
            habilitarComponentesRegistro(true);
            JOptionPane.showMessageDialog(this, "Cliente encontrado:\n" +
                "Razón Social: " + clienteJur.getRazonSocial() + "\nRUC: " + clienteJur.getRuc());
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado");
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanBusqueda;
    private javax.swing.ButtonGroup btgCuenta;
    private javax.swing.ButtonGroup btgMoneda;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JRadioButton jrbAhorro;
    private javax.swing.JRadioButton jrbCorriente;
    private javax.swing.JRadioButton jrbDolares;
    private javax.swing.JRadioButton jrbSoles;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblDepositoInicial;
    private javax.swing.JLabel lblMoneda;
    private javax.swing.JLabel lblRuc;
    private javax.swing.JLabel lblTipoCuenta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panRegistro;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDepositoInicial;
    private javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables
    private ListaClientes listaClientes;
    private ListaCuenta listaCuentas;
    private ClienteJuridico clienteSeleccionado;
}
