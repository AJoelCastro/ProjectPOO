/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import datos.*;
import presentacion.*;
import javax.swing.*;

/**
 *
 * @author artur
 */
public class FrmPresentacion extends javax.swing.JFrame {

    /**
     * Creates new form FramePresentacion
     */
    public FrmPresentacion() {
        initComponents();
    }
    private void centrarInternalFrame (JInternalFrame interna) {
        int x,y;
        
        x=dpsFondo.getWidth()/2 - interna.getWidth()/2;
        y=dpsFondo.getHeight()/2- interna.getHeight()/2;
        if(interna.isShowing())
        interna.setLocation(x,y);
        
        else {
                dpsFondo.add(interna);
                interna.setLocation(x,y);
                interna.show();
                };
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpsFondo = new javax.swing.JDesktopPane();
        mnbMenu = new javax.swing.JMenuBar();
        mnuOpciones = new javax.swing.JMenu();
        mnuRegistroCliente = new javax.swing.JMenu();
        mniClienteNatural = new javax.swing.JMenuItem();
        mniClienteJuridico = new javax.swing.JMenuItem();
        mnuRegistroCuenta = new javax.swing.JMenu();
        mniCuentaAhorro = new javax.swing.JMenuItem();
        mniCuentaCorriente = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpsFondo.setBackground(new java.awt.Color(0, 102, 153));

        javax.swing.GroupLayout dpsFondoLayout = new javax.swing.GroupLayout(dpsFondo);
        dpsFondo.setLayout(dpsFondoLayout);
        dpsFondoLayout.setHorizontalGroup(
            dpsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        dpsFondoLayout.setVerticalGroup(
            dpsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 456, Short.MAX_VALUE)
        );

        mnbMenu.setBackground(new java.awt.Color(230, 235, 240));

        mnuOpciones.setMnemonic('O');
        mnuOpciones.setText("Opciones");

        mnuRegistroCliente.setMnemonic('R');
        mnuRegistroCliente.setText("Registro Cliente");

        mniClienteNatural.setMnemonic('N');
        mniClienteNatural.setText("Cliente Natural");
        mniClienteNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteNaturalActionPerformed(evt);
            }
        });
        mnuRegistroCliente.add(mniClienteNatural);

        mniClienteJuridico.setMnemonic('J');
        mniClienteJuridico.setText("Cliente Juridico");
        mniClienteJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteJuridicoActionPerformed(evt);
            }
        });
        mnuRegistroCliente.add(mniClienteJuridico);

        mnuOpciones.add(mnuRegistroCliente);

        mnuRegistroCuenta.setText("Registro Cuenta");

        mniCuentaAhorro.setText(" Cuenta Ahorro");
        mnuRegistroCuenta.add(mniCuentaAhorro);

        mniCuentaCorriente.setText("Cuenta Corriente");
        mnuRegistroCuenta.add(mniCuentaCorriente);

        mnuOpciones.add(mnuRegistroCuenta);

        jMenuItem1.setMnemonic('S');
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuOpciones.add(jMenuItem1);

        mnbMenu.add(mnuOpciones);

        setJMenuBar(mnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpsFondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpsFondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniClienteNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteNaturalActionPerformed
        ifrmClienteNatural ifrmClienteNatural = new ifrmClienteNatural(listaClientes);
        centrarInternalFrame(ifrmClienteNatural);
    }//GEN-LAST:event_mniClienteNaturalActionPerformed

    private void mniClienteJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteJuridicoActionPerformed
        ifrmClienteJuridico ifrmClienteJuridico = new ifrmClienteJuridico(listaClientes);
        centrarInternalFrame(ifrmClienteJuridico);
    }//GEN-LAST:event_mniClienteJuridicoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FramePresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FramePresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FramePresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FramePresentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FramePresentacion().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpsFondo;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JMenuItem mniClienteJuridico;
    private javax.swing.JMenuItem mniClienteNatural;
    private javax.swing.JMenuItem mniCuentaAhorro;
    private javax.swing.JMenuItem mniCuentaCorriente;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenu mnuRegistroCliente;
    private javax.swing.JMenu mnuRegistroCuenta;
    // End of variables declaration//GEN-END:variables
private ListaClientes listaClientes = new ListaClientes();
}
