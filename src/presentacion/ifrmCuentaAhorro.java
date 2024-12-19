/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import datos.*;
import entidades.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author sanar
 */
public class ifrmCuentaAhorro extends javax.swing.JInternalFrame {

    /**
     * Creates new form IfrmPersonal
     */
    public ifrmCuentaAhorro() {
        initComponents();
    }
    public ifrmCuentaAhorro(ListaClientes listaClientes, ListaCuenta listaCuentas, ListaMovimientos listaMovimientos) {
        initComponents();
        this.listaClientes = listaClientes;
        this.listaCuentas = listaCuentas;
        this.listaMovimientos = listaMovimientos;
        
        panDatos.setVisible(false);
        lblBienvenido.setVisible(false);
        btnSaldo.setText("Mostrar saldo");
        txtNombre.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panInicio = new javax.swing.JPanel();
        panRegistro = new javax.swing.JPanel();
        lblIdentificacion = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        pwdPass = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        lblBienvenido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        panDatos = new javax.swing.JPanel();
        panSaldo = new javax.swing.JPanel();
        txtSaldo = new javax.swing.JTextField();
        btnSaldo = new javax.swing.JButton();
        scpMovimientos = new javax.swing.JScrollPane();
        btnDeposito = new javax.swing.JButton();
        btnRetiro = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        btnMovimientos = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 0, 0));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        panInicio.setBackground(new java.awt.Color(0, 153, 153));

        panRegistro.setBackground(new java.awt.Color(0, 153, 153));

        lblIdentificacion.setForeground(new java.awt.Color(255, 255, 255));
        lblIdentificacion.setText("Identificacion de usuario");

        txtIdentificacion.setForeground(new java.awt.Color(102, 102, 102));
        txtIdentificacion.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnEntrar.setBackground(new java.awt.Color(0, 102, 102));
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setToolTipText("");
        btnEntrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Contraseña");

        javax.swing.GroupLayout panRegistroLayout = new javax.swing.GroupLayout(panRegistro);
        panRegistro.setLayout(panRegistroLayout);
        panRegistroLayout.setHorizontalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIdentificacion)
                    .addComponent(lblPassword)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                    .addComponent(pwdPass))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panRegistroLayout.setVerticalGroup(
            panRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panRegistroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblIdentificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        lblBienvenido.setFont(new java.awt.Font("Book Antiqua", 0, 36)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenido.setText("==BIENVENIDO==");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panInicioLayout = new javax.swing.GroupLayout(panInicio);
        panInicio.setLayout(panInicioLayout);
        panInicioLayout.setHorizontalGroup(
            panInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBienvenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panInicioLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panInicioLayout.setVerticalGroup(
            panInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblBienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panSaldo.setBackground(new java.awt.Color(0, 153, 153));
        panSaldo.setPreferredSize(new java.awt.Dimension(170, 34));

        txtSaldo.setEditable(false);
        txtSaldo.setBackground(new java.awt.Color(0, 153, 153));
        txtSaldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSaldo.setBorder(null);

        btnSaldo.setForeground(new java.awt.Color(0, 102, 102));
        btnSaldo.setText("Mostrar saldo");
        btnSaldo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panSaldoLayout = new javax.swing.GroupLayout(panSaldo);
        panSaldo.setLayout(panSaldoLayout);
        panSaldoLayout.setHorizontalGroup(
            panSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panSaldoLayout.setVerticalGroup(
            panSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panSaldoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panSaldoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaldo))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        btnDeposito.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnDeposito.setForeground(new java.awt.Color(0, 102, 102));
        btnDeposito.setText("DEPOSITO");
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        btnRetiro.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRetiro.setForeground(new java.awt.Color(0, 102, 102));
        btnRetiro.setText("RETIRO");
        btnRetiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetiroActionPerformed(evt);
            }
        });

        btnTransferencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnTransferencia.setForeground(new java.awt.Color(0, 102, 102));
        btnTransferencia.setText("TRANSFERENCIA");
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });

        btnMovimientos.setForeground(new java.awt.Color(0, 102, 102));
        btnMovimientos.setText("Mostrar Movimientos");
        btnMovimientos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMovimientos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovimientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDatosLayout = new javax.swing.GroupLayout(panDatos);
        panDatos.setLayout(panDatosLayout);
        panDatosLayout.setHorizontalGroup(
            panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(panDatosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDatosLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnMovimientos))
                    .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(scpMovimientos)
                        .addComponent(panSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                        .addGroup(panDatosLayout.createSequentialGroup()
                            .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panDatosLayout.setVerticalGroup(
            panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDatosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMovimientos)
                .addGap(12, 12, 12)
                .addComponent(scpMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetiro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(84, 84, 84))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
        if (saldoVisible) {
            txtSaldo.setText("");
            btnSaldo.setText("Mostrar saldo");
        } else {
            if (cuentaActual != null) {
                String moneda = cuentaActual.getTipoMoneda() == 0 ? "S/." : "US$";
                txtSaldo.setText(moneda + " " + String.format("%.2f", cuentaActual.getSaldoCuenta()));
            } else {
                txtSaldo.setText("Saldo no disponible");
            }
            btnSaldo.setText("Ocultar saldo");
        }
        saldoVisible = !saldoVisible;
    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovimientosActionPerformed
        if (cuentaActual == null) {
            JOptionPane.showMessageDialog(this, "Seleccione una cuenta primero.");
            return;
        }

        ArrayList<ListaMovimientos.Movimiento> movimientos = listaMovimientos.obtenerHistorialMovimientos(cuentaActual);

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
    }//GEN-LAST:event_btnMovimientosActionPerformed

    private void btnRetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetiroActionPerformed
        if (cuentaActual == null) {
            return;
        }

        String montoStr = JOptionPane.showInputDialog(this, 
            "Ingrese el monto a retirar:",
            "Retiro",
            JOptionPane.PLAIN_MESSAGE);

        if (montoStr == null || montoStr.trim().isEmpty()) {
            return;
        }

        try {
            float monto = Float.parseFloat(montoStr);
            if (listaMovimientos.registrarRetiro(cuentaActual, monto)) {
                actualizarSaldo();
                btnMovimientosActionPerformed(null);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Por favor ingrese un monto válido",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRetiroActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        if (cuentaActual == null) {
            return;
        }

        String montoStr = JOptionPane.showInputDialog(this, 
            "Ingrese el monto a depositar:",
            "Depósito",
            JOptionPane.PLAIN_MESSAGE);

        if (montoStr == null || montoStr.trim().isEmpty()) {
            return;
        }

        try {
            float monto = Float.parseFloat(montoStr);
            if (listaMovimientos.registrarDeposito(cuentaActual, monto)) {
                actualizarSaldo();
                btnMovimientosActionPerformed(null);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Por favor ingrese un monto válido",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        if (cuentaActual == null) {
            return;
        }
        
        JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
        JTextField txtCuentaDestino = new JTextField(15);
        JTextField txtMonto = new JTextField(15);

        panel.add(new JLabel("Cuenta destino:"));
        panel.add(txtCuentaDestino);
        panel.add(new JLabel("Monto:"));
        panel.add(txtMonto);

        int result = JOptionPane.showConfirmDialog(this, panel, 
            "Transferencia", JOptionPane.OK_CANCEL_OPTION);

        if (result != JOptionPane.OK_OPTION) {
            return;
        }

        String numeroCuentaDestino = txtCuentaDestino.getText().trim();
        String montoStr = txtMonto.getText().trim();

        if (numeroCuentaDestino.isEmpty() || montoStr.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Por favor complete todos los campos",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Cuenta cuentaDestino = null;
        for (Cuenta cuenta : listaCuentas.getListaCuentas()) {
            if (cuenta.getNumeroCuenta().equals(numeroCuentaDestino)) {
                cuentaDestino = cuenta;
                break;
            }
        }

        if (cuentaDestino == null) {
            JOptionPane.showMessageDialog(this,
                "Cuenta destino no encontrada",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            float monto = Float.parseFloat(montoStr);
            if (listaMovimientos.registrarTransferencia(cuentaActual, cuentaDestino, monto)) {
                actualizarSaldo();
                btnMovimientosActionPerformed(null);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Por favor ingrese un monto válido",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        //txtNombre.setText(cuentaActual);
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        String numeroCuenta = txtIdentificacion.getText().trim();
        String clave = new String(pwdPass.getPassword());

        if (numeroCuenta.isEmpty() || clave.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                "Por favor ingrese el número de cuenta y la clave",
                "Error de validación",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean cuentaEncontrada = false;
        for (Cuenta cuenta : listaCuentas.getListaCuentas()) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                if (cuenta.validarClave(clave)) {
                    cuentaActual = cuenta;
                    cuentaEncontrada = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(this,
                        "Clave incorrecta",
                        "Error de autenticación",
                        JOptionPane.ERROR_MESSAGE);
                    pwdPass.setText("");
                    return;
                }
            }
        }

        if (!cuentaEncontrada) {
            JOptionPane.showMessageDialog(this,
                "Cuenta no encontrada",
                "Error de autenticación",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        mostrarDatosCuenta();
        String nombre="";
        Cliente client =cuentaActual.getCliente();
        if(client!=null){
            nombre = client.getNombre();
        }
        else{
            JOptionPane.showMessageDialog(this,"Cliente no encontrado","Advertencia", 2);
        }
        txtNombre.setText(nombre);
    }//GEN-LAST:event_btnEntrarActionPerformed
    private void mostrarDatosCuenta() {
        panRegistro.setVisible(false);
        panDatos.setVisible(true);
        panInicio.setVisible(true);
        lblBienvenido.setVisible(true);
        //txtNombre.setText(cuentaActual.getCliente().getNombre());
        //lblNombreBienvenidaAncestorAdded();
    }                                         
    private void actualizarSaldo() {
        if (cuentaActual != null) {
            String moneda = cuentaActual.getTipoMoneda() == 0 ? "S/." : "US$";
            txtSaldo.setText(moneda + " " + String.format("%.2f", cuentaActual.getSaldoCuenta()));
        }
    }    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnMovimientos;
    private javax.swing.JButton btnRetiro;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblIdentificacion;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JPanel panDatos;
    private javax.swing.JPanel panInicio;
    private javax.swing.JPanel panRegistro;
    private javax.swing.JPanel panSaldo;
    private javax.swing.JPasswordField pwdPass;
    private javax.swing.JScrollPane scpMovimientos;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
    private ListaClientes listaClientes;
    private ListaCuenta listaCuentas;
    private ListaMovimientos listaMovimientos;
    private Cuenta cuentaActual;
    private boolean saldoVisible = false;
}
