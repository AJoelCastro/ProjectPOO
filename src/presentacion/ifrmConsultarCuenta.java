/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package presentacion;

import datos.*;
import javax.swing.*;
/**
 *
 * @author Administrador
 */
public class ifrmConsultarCuenta extends javax.swing.JPanel {

    DefaultListModel Mov = new DefaultListModel();
    /**
     * Creates new form ifrmConsultarCuentaAhorro
     */
    public ifrmConsultarCuenta() {
        initComponents();
        txtSaldo.setEditable(false);
        Mov = new DefaultListModel();
        jlistMovimientos.setModel(Mov);
    }

    private void limpiar(){
        txtClave.setText(null);
        txtNroCuenta.setText(null);
        txtSaldo.setText(null);
        jlistMovimientos.setToolTipText(null);
    }
    
    private void activar(boolean estado) {
        txtSaldo.setEnabled(estado);
        jlistMovimientos.setEnabled(estado);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblNroCuenta = new javax.swing.JLabel();
        txtNroCuenta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtClave = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistMovimientos = new javax.swing.JList<>();
        lblSaldo = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JTextField();
        lblMovimientos = new javax.swing.JLabel();
        lblClave = new javax.swing.JLabel();

        jInternalFrame1.setTitle("Consultar Cuenta ");
        jInternalFrame1.setVisible(true);

        lblNroCuenta.setText("Numero de Cuenta");

        txtNroCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroCuentaActionPerformed(evt);
            }
        });

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.gif"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/419660.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jlistMovimientos.setEnabled(false);
        jScrollPane1.setViewportView(jlistMovimientos);

        lblSaldo.setText("Saldo");

        txtSaldo.setEnabled(false);

        lblMovimientos.setText("Movimientos");

        lblClave.setText("Clave");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(lblMovimientos))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(lblNroCuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addContainerGap(127, Short.MAX_VALUE)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClave, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(lblSaldo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(291, 291, 291))
                                .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                    .addComponent(btnBuscar)
                                    .addGap(26, 26, 26)
                                    .addComponent(btnLimpiar))))))
                .addGap(84, 84, 84))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNroCuenta))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClave))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(lblMovimientos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroCuentaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ListaCuenta listCuenta = new ListaCuenta();
        String nroCuenta = txtNroCuenta.getText();
        String clave = txtClave.getText();
        int busqueda;
        if (!ListaClientes.validacionLetras(nroCuenta)) {
        JOptionPane.showMessageDialog(this, "El Numero de cuenta solo debe contener numeros y una letra al inicio.", "Error", 0);
        return; 
        }
        if (!ListaCuenta.validacionClave(clave)) {
        JOptionPane.showMessageDialog(this, "La clave debe contener solo numeros y no espacios.", "Error", 0);
        return; 
        }
        if (nroCuenta == null || nroCuenta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese su Numero de Cuenta", "Indicacion", 2);
            return;
        }
        if (clave == null || clave.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese su Clave", "Indicacion", 2);
            return;
        }
        busqueda = listCuenta.buscarPorNroCuenta(nroCuenta);
        if (busqueda==-1) {
            JOptionPane.showMessageDialog(this, "No se encontro al cliente", "Error", 0);
        return;
        }
        if (listCuenta.obtenerCuenta(busqueda).validarClave(clave)) {
            activar(true);
            Mov.addElement(listCuenta.obtenerCuenta(busqueda).toString() + "\n");
            txtSaldo.setText(listCuenta.obtenerCuenta(busqueda).getSaldoCuenta()+ "");
        }
        else {
            JOptionPane.showMessageDialog(this, "Clave incorrecta", "Error", 0);
        return; 
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        activar(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> jlistMovimientos;
    private javax.swing.JLabel lblClave;
    private javax.swing.JLabel lblMovimientos;
    private javax.swing.JLabel lblNroCuenta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtNroCuenta;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}