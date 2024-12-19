/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import datos.*;
import entidades.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ifrmClienteJuridico extends javax.swing.JInternalFrame {

    /**
     * Creates new form ifrmClienteJuridico
     */
    public ifrmClienteJuridico(ListaClientes lista) {
        initComponents();
        this.lista=lista;
        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
    @Override
    public void focusGained(java.awt.event.FocusEvent evt) {
        if (!mensajeMostrado) {
            JOptionPane.showMessageDialog(txtDireccion, "ingrese su direccion Fiscal y de operaciones separadas por ; respectivamente ", "Indicacion", 1);
            mensajeMostrado = true;
        }
    }
    });
    }
    
    private void activar (boolean estado){
            txtNombres.setEnabled(estado);
            txtApellidos.setEnabled(estado);
            txttelefono.setEnabled(estado);
            txtEmail.setEnabled(estado);
            txtRazonSocial.setEnabled(estado);
            txtRuc.setEnabled(estado);
            txtDireccion.setEnabled(estado);
            txtDocumento.setEnabled(estado);
            
          btnRegistrar.setEnabled(estado);
          btnNuevo.setEnabled(!estado);
    }
    
      private void limpiar(){
          txtNombres.setText(null);
            txtApellidos.setText(null);
            txttelefono.setText(null);
            txtEmail.setText(null);
            txtRazonSocial.setText(null);
            txtRuc.setText(null);
            txtDireccion.setText(null);
            txtDocumento.setText(null);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblRazonSocial = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lbldocumento = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        cmbTipoRuc = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblNombres.setText("Nombres");

        lblApellidos.setText("Apellidos");

        lblTelefono.setText("Telefono");

        lblEmail.setText("Email");

        lblRazonSocial.setText("Razon Social");

        lblDireccion.setText("Direccion");

        lbldocumento.setText("Documento de Constitucion");

        txtRuc.setEnabled(false);

        txtDireccion.setEnabled(false);
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        txtDocumento.setEnabled(false);

        txtNombres.setEnabled(false);
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtApellidos.setEnabled(false);

        txttelefono.setEnabled(false);

        txtEmail.setEnabled(false);

        txtRazonSocial.setEnabled(false);

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/add_file.gif"))); // NOI18N
        btnNuevo.setMnemonic('U');
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.gif"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.gif"))); // NOI18N
        btnRegistrar.setMnemonic('G');
        btnRegistrar.setText("Registrar");
        btnRegistrar.setEnabled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        cmbTipoRuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruc Persona Natural", "Ruc Empresa" }));
        cmbTipoRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoRucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbldocumento)
                        .addGap(28, 28, 28)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnRegistrar)
                        .addGap(49, 49, 49)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                .addComponent(lblNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                .addComponent(txtApellidos)
                                .addComponent(txtRazonSocial)
                                .addComponent(txtEmail))
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbTipoRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipoRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiar();
        activar(true);
        txtNombres.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre,apellido,telefono,email,razonSocial,tipoRuc,direccion,documento;
        String fechaN;
        int tipoCliente=2;
        nombre = txtNombres.getText();
        if (!ListaClientes.validacionLetras(nombre)) {
        JOptionPane.showMessageDialog(this, "El nombre solo debe contener letras y espacios.", "Error",0);
        return; 
        }
        if (nombre == null || nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese su nombre", "indicacion", 2);
            return;
        }
        apellido = txtApellidos.getText();
        if (!ListaClientes.validacionLetras(apellido)) {
        JOptionPane.showMessageDialog(this, "El apellido solo debe contener letras y espacios.", "Error", 0);
        return; 
        }
        if (apellido == null || apellido.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingres su apellido", "Indicacion",2);
            return;
        }
        
        telefono = txttelefono.getText();
        if (telefono == null || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese su telefono", "Indicacion", 2);
            return;
        }
        if (!ListaClientes.validacionTelefono(telefono)) {
            JOptionPane.showMessageDialog(this, "El teléfono debe contener exactamente 9 dígitos y solo números.", "Error", 0);
            txttelefono.requestFocus();
            return;
        }
        
        email = txtEmail.getText();
        if (email == null || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingres su correo electronico", "Indicacion", 2);
            return;
        }
        razonSocial = txtRazonSocial.getText();
        if (razonSocial == null || razonSocial.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese la razon social", "EIndicacion", 2);
            return;
        }
        tipoRuc = (String) cmbTipoRuc.getSelectedItem();
        String ruc = txtRuc.getText();
        
        if (ruc == null || ruc.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un tipo de RUC.", "Indicacion", 2);
            return;
        }

        if ("Ruc Persona Natural".equals(tipoRuc)) {
            if (!ListaClientes.validarRucNatural(ruc)) {
                JOptionPane.showMessageDialog(this, "El RUC para persona natural debe tener exactamente 10 dígitos numéricos.", "Error", 0);
                return;
            }
        } else if ("Ruc Empresa".equals(tipoRuc)) {
            if (!ListaClientes.validarRucJuridica(ruc)) {
                JOptionPane.showMessageDialog(this, "El RUC para persona jurídica debe tener exactamente 11 dígitos numéricos.", "Error", 0);
                return;
            }
        }
        

        direccion = txtDireccion.getText();
        if (direccion == null || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese su direccion", "Indicacion", 2);
            return;
        }
        documento = txtDocumento.getText();
        if (documento == null || documento.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese el numero de documento de constitucion de la empresa", "Indicacion", 2);
            return;
        }
        ClienteJuridico clienteJuridico = new ClienteJuridico(razonSocial, tipoRuc, documento, telefono, email, direccion, nombre, apellido, tipoCliente);
        lista.agregarCliente(clienteJuridico);
        JOptionPane.showMessageDialog(this, "Los datos fueron registrados", "Registro de cliente", 1);

        limpiar();
        activar(false);
        btnNuevo.requestFocus();
        System.out.println(lista.toString());
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cmbTipoRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoRucActionPerformed
        
        String tipoRuc = (String) cmbTipoRuc.getSelectedItem(); 
        String ruc = txtRuc.getText();

        if ("Ruc Persona Natural".equals(tipoRuc)) {
            if (!ListaClientes.validarRucNatural(ruc)) {
                JOptionPane.showMessageDialog(this, "El RUC para persona natural debe tener exactamente 10 dígitos numéricos.", "Indicacion", 1);
                return;
            }
        } else if ("Ruc Empresa".equals(tipoRuc)) {
            if (!ListaClientes.validarRucJuridica(ruc)) {
                JOptionPane.showMessageDialog(this, "El RUC para persona jurídica debe tener exactamente 11 dígitos numéricos.", "Indicacion", 1);
                return;
            }
        }
    }//GEN-LAST:event_cmbTipoRucActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
// 
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbTipoRuc;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblRazonSocial;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lbldocumento;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
private Cliente cliente;
private ListaClientes lista;
private boolean mensajeMostrado = false;
}
