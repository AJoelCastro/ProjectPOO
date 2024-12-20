/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import datos.ListaCuenta;
import datos.ListaMovimientos;
import entidades.Cuenta;
import java.util.ArrayList;
import javax.swing.JTable;

/**
 *
 * @author artur
 */
public class ifrmEstadoCuenta extends javax.swing.JInternalFrame {
    private String nroCuenta;
    private ListaCuenta listaCuentas;
    private Cuenta cuenta;
    private ListaMovimientos listaMovimientos;
    /**
     * Creates new form ifrmEstadoCuenta
     */
    public ifrmEstadoCuenta(ListaCuenta listaCuentas, ListaMovimientos listaMovimientos) {
        this.listaCuentas=listaCuentas;
        this.listaMovimientos=listaMovimientos;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNroCuenta = new javax.swing.JLabel();
        txtNroCuenta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        scpMovimientos = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblNroCuenta.setText("Numero de cuenta:");

        txtNroCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNroCuentaActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Reporte de estado de cuenta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblNroCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(scpMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel1)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNroCuenta)
                    .addComponent(txtNroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(scpMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNroCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNroCuentaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        nroCuenta=txtNroCuenta.getText();
        int pos = listaCuentas.buscarPorNroCuenta(nroCuenta);
        listaCuentas.obtenerCuenta(pos);
        cuenta = listaCuentas.obtenerCuenta(pos);
        ArrayList<ListaMovimientos.Movimiento> movimientos = listaMovimientos.obtenerHistorialMovimientos(cuenta);

        String[] columnNames = {"Tipo", "Monto", "Fecha", "Cuenta Destino"};
        Object[][] data = new Object[movimientos.size()][4];

        for (int i = 0; i < movimientos.size(); i++) {
            ListaMovimientos.Movimiento mov = movimientos.get(i);
            data[i][0] = mov.getTipoMovimiento();
            data[i][1] = String.format("%.2f", mov.getMonto());
            data[i][2] = mov.getFechaFormateada();
            data[i][3] = mov.getCuentaDestino() != null ? mov.getCuentaDestino().getNumeroCuenta() : "-";
        }

        JTable tblMovimientos = new JTable(data, columnNames);
        scpMovimientos.setViewportView(tblMovimientos);
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNroCuenta;
    private javax.swing.JScrollPane scpMovimientos;
    private javax.swing.JTextField txtNroCuenta;
    // End of variables declaration//GEN-END:variables
}