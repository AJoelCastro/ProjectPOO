/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import datos.*;
import javax.swing.*;

/**
 *
 * @author sanar
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
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

        dpsFondo = new javax.swing.JDesktopPane();
        mnbMenu = new javax.swing.JMenuBar();
        mnuPersonal = new javax.swing.JMenu();
        mnuLogNatural = new javax.swing.JMenu();
        mniLogAhorroNat = new javax.swing.JMenuItem();
        mniLogCorrienteNat = new javax.swing.JMenuItem();
        mnuAbrirNatural = new javax.swing.JMenu();
        mniAbrirAhorroNat = new javax.swing.JMenuItem();
        mniAbrirCorrienteNat = new javax.swing.JMenuItem();
        mniRegistrarNatural = new javax.swing.JMenuItem();
        mnuEmpresas = new javax.swing.JMenu();
        mnuLogJuridico = new javax.swing.JMenu();
        mniLogAhorroJur = new javax.swing.JMenuItem();
        mniLogCorrientejur = new javax.swing.JMenuItem();
        mnuAbrirJuridico = new javax.swing.JMenu();
        mniAbrirAhorroJur = new javax.swing.JMenuItem();
        mniAbrirCorrienteJur = new javax.swing.JMenuItem();
        mniRegistrarJuridico = new javax.swing.JMenuItem();
        mnuListados = new javax.swing.JMenu();
        mniNatural = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        mnuAyuda = new javax.swing.JMenu();
        mniAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bank of America");

        javax.swing.GroupLayout dpsFondoLayout = new javax.swing.GroupLayout(dpsFondo);
        dpsFondo.setLayout(dpsFondoLayout);
        dpsFondoLayout.setHorizontalGroup(
            dpsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1051, Short.MAX_VALUE)
        );
        dpsFondoLayout.setVerticalGroup(
            dpsFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 655, Short.MAX_VALUE)
        );

        mnuPersonal.setText("Personal");

        mnuLogNatural.setText("Iniciar sesion");
        mnuLogNatural.setToolTipText("");

        mniLogAhorroNat.setText("Cuenta Ahorro");
        mniLogAhorroNat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogAhorroNatActionPerformed(evt);
            }
        });
        mnuLogNatural.add(mniLogAhorroNat);

        mniLogCorrienteNat.setText("Cuenta Corriente");
        mniLogCorrienteNat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogCorrienteNatActionPerformed(evt);
            }
        });
        mnuLogNatural.add(mniLogCorrienteNat);

        mnuPersonal.add(mnuLogNatural);

        mnuAbrirNatural.setText("Abrir una cuenta");

        mniAbrirAhorroNat.setText("Cuente Ahorro");
        mnuAbrirNatural.add(mniAbrirAhorroNat);

        mniAbrirCorrienteNat.setText("Cuenta Corriente");
        mnuAbrirNatural.add(mniAbrirCorrienteNat);

        mnuPersonal.add(mnuAbrirNatural);

        mniRegistrarNatural.setText("Registrarse");
        mniRegistrarNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegistrarNaturalActionPerformed(evt);
            }
        });
        mnuPersonal.add(mniRegistrarNatural);

        mnbMenu.add(mnuPersonal);

        mnuEmpresas.setText("Empresas e Instituciones");

        mnuLogJuridico.setText("Iniciar sesion");

        mniLogAhorroJur.setText("Cuenta Ahorro");
        mniLogAhorroJur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogAhorroJurActionPerformed(evt);
            }
        });
        mnuLogJuridico.add(mniLogAhorroJur);

        mniLogCorrientejur.setText("Cuenta Corriente");
        mniLogCorrientejur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogCorrientejurActionPerformed(evt);
            }
        });
        mnuLogJuridico.add(mniLogCorrientejur);

        mnuEmpresas.add(mnuLogJuridico);

        mnuAbrirJuridico.setText("Abrir una cuenta");

        mniAbrirAhorroJur.setText("Cuenta Ahorro ");
        mniAbrirAhorroJur.setToolTipText("");
        mnuAbrirJuridico.add(mniAbrirAhorroJur);

        mniAbrirCorrienteJur.setText("Cuente Corriente");
        mnuAbrirJuridico.add(mniAbrirCorrienteJur);

        mnuEmpresas.add(mnuAbrirJuridico);

        mniRegistrarJuridico.setText("Registrarse");
        mniRegistrarJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegistrarJuridicoActionPerformed(evt);
            }
        });
        mnuEmpresas.add(mniRegistrarJuridico);

        mnbMenu.add(mnuEmpresas);

        mnuListados.setText("Listados");

        mniNatural.setText("Personas");
        mniNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNaturalActionPerformed(evt);
            }
        });
        mnuListados.add(mniNatural);

        mnbMenu.add(mnuListados);

        mnuReportes.setText("Reportes");
        mnbMenu.add(mnuReportes);

        mnuAyuda.setText("Ayuda");

        mniAcerca.setText("Acerca de");
        mniAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaActionPerformed(evt);
            }
        });
        mnuAyuda.add(mniAcerca);

        mnbMenu.add(mnuAyuda);

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

    private void mniAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniAcercaActionPerformed

    private void mniNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNaturalActionPerformed
        IfrmListaClienteNatural ifrmListaClienteNatural = new IfrmListaClienteNatural(listaClientes);
        centrarInternalFrame(ifrmListaClienteNatural);
        
    }//GEN-LAST:event_mniNaturalActionPerformed

    private void mniRegistrarNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegistrarNaturalActionPerformed
        IfrmClienteNatural ifrmClienteNatural = new IfrmClienteNatural(listaClientes);
        centrarInternalFrame(ifrmClienteNatural);
    }//GEN-LAST:event_mniRegistrarNaturalActionPerformed

    private void mniRegistrarJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegistrarJuridicoActionPerformed
        ifrmClienteJuridico ifrmClienteJuridico = new ifrmClienteJuridico(listaClientes);
        centrarInternalFrame(ifrmClienteJuridico);
    }//GEN-LAST:event_mniRegistrarJuridicoActionPerformed

    private void mniLogAhorroNatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogAhorroNatActionPerformed
        IfrmCuentaAhorro ifrmCuentaAhorro = new IfrmCuentaAhorro(listaClientes,listaCuentas,listaMovimientos);
        centrarInternalFrame(ifrmCuentaAhorro);
    }//GEN-LAST:event_mniLogAhorroNatActionPerformed

    private void mniLogCorrienteNatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogCorrienteNatActionPerformed
        IfrmCuentaCorriente ifrmCuentaCorriente = new IfrmCuentaCorriente();
        centrarInternalFrame(ifrmCuentaCorriente);
    }//GEN-LAST:event_mniLogCorrienteNatActionPerformed

    private void mniLogAhorroJurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogAhorroJurActionPerformed
        IfrmCuentaAhorro ifrmCuentaAhorro = new IfrmCuentaAhorro(listaClientes,listaCuentas,listaMovimientos);
        centrarInternalFrame(ifrmCuentaAhorro);
    }//GEN-LAST:event_mniLogAhorroJurActionPerformed

    private void mniLogCorrientejurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogCorrientejurActionPerformed
        IfrmCuentaCorriente ifrmCuentaCorriente = new IfrmCuentaCorriente();
        centrarInternalFrame(ifrmCuentaCorriente);
    }//GEN-LAST:event_mniLogCorrientejurActionPerformed

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
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpsFondo;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JMenuItem mniAbrirAhorroJur;
    private javax.swing.JMenuItem mniAbrirAhorroNat;
    private javax.swing.JMenuItem mniAbrirCorrienteJur;
    private javax.swing.JMenuItem mniAbrirCorrienteNat;
    private javax.swing.JMenuItem mniAcerca;
    private javax.swing.JMenuItem mniLogAhorroJur;
    private javax.swing.JMenuItem mniLogAhorroNat;
    private javax.swing.JMenuItem mniLogCorrienteNat;
    private javax.swing.JMenuItem mniLogCorrientejur;
    private javax.swing.JMenuItem mniNatural;
    private javax.swing.JMenuItem mniRegistrarJuridico;
    private javax.swing.JMenuItem mniRegistrarNatural;
    private javax.swing.JMenu mnuAbrirJuridico;
    private javax.swing.JMenu mnuAbrirNatural;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuEmpresas;
    private javax.swing.JMenu mnuListados;
    private javax.swing.JMenu mnuLogJuridico;
    private javax.swing.JMenu mnuLogNatural;
    private javax.swing.JMenu mnuPersonal;
    private javax.swing.JMenu mnuReportes;
    // End of variables declaration//GEN-END:variables
    private ListaClientes listaClientes = new ListaClientes();
    private ListaCuenta listaCuentas = new ListaCuenta();
    private ListaMovimientos listaMovimientos = new ListaMovimientos();
}