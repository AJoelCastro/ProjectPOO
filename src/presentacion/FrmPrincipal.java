/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;
import datos.*;
import javax.swing.*;
import presentacion.*;

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
        jButton1 = new javax.swing.JButton();
        mnbMenu = new javax.swing.JMenuBar();
        mnuPersonal = new javax.swing.JMenu();
        mniLogNatural = new javax.swing.JMenuItem();
        mniAbrirAhorro = new javax.swing.JMenuItem();
        mniRegistrarNatural = new javax.swing.JMenuItem();
        mnuEmpresas = new javax.swing.JMenu();
        mniLogJuridico = new javax.swing.JMenuItem();
        mniAbrirCorriente = new javax.swing.JMenuItem();
        mniRegistrarJuridico = new javax.swing.JMenuItem();
        mnuListados = new javax.swing.JMenu();
        mniNatural = new javax.swing.JMenuItem();
        mnuReportes = new javax.swing.JMenu();
        mnuAyuda = new javax.swing.JMenu();
        mniAcerca = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco Camilin");

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

        jButton1.setText("jButton1");

        mnuPersonal.setText("Personal");

        mniLogNatural.setText("Iniciar sesion");
        mniLogNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogNaturalActionPerformed(evt);
            }
        });
        mnuPersonal.add(mniLogNatural);

        mniAbrirAhorro.setText("Abrir una cuenta");
        mnuPersonal.add(mniAbrirAhorro);

        mniRegistrarNatural.setText("Registrarse");
        mniRegistrarNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniRegistrarNaturalActionPerformed(evt);
            }
        });
        mnuPersonal.add(mniRegistrarNatural);

        mnbMenu.add(mnuPersonal);

        mnuEmpresas.setText("Empresas e Instituciones");

        mniLogJuridico.setText("Iniciar sesion");
        mniLogJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogJuridicoActionPerformed(evt);
            }
        });
        mnuEmpresas.add(mniLogJuridico);

        mniAbrirCorriente.setText("Abrir una cuenta");
        mnuEmpresas.add(mniAbrirCorriente);

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

    private void mniLogNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogNaturalActionPerformed
        IfrmPersonal ifrmPersonal = new IfrmPersonal();
        centrarInternalFrame(ifrmPersonal);
    }//GEN-LAST:event_mniLogNaturalActionPerformed

    private void mniRegistrarNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegistrarNaturalActionPerformed
        ifrmClienteNatural ifrmClienteNatural = new ifrmClienteNatural(listaClientes);
        centrarInternalFrame(ifrmClienteNatural);
    }//GEN-LAST:event_mniRegistrarNaturalActionPerformed

    private void mniRegistrarJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniRegistrarJuridicoActionPerformed
        ifrmClienteJuridico ifrmClienteJuridico = new ifrmClienteJuridico(listaClientes);
        centrarInternalFrame(ifrmClienteJuridico);
    }//GEN-LAST:event_mniRegistrarJuridicoActionPerformed

    private void mniLogJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogJuridicoActionPerformed
        IfrmEmpresas ifrmEmpresas = new IfrmEmpresas();
        centrarInternalFrame(ifrmEmpresas);
    }//GEN-LAST:event_mniLogJuridicoActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JMenuItem mniAbrirAhorro;
    private javax.swing.JMenuItem mniAbrirCorriente;
    private javax.swing.JMenuItem mniAcerca;
    private javax.swing.JMenuItem mniLogJuridico;
    private javax.swing.JMenuItem mniLogNatural;
    private javax.swing.JMenuItem mniNatural;
    private javax.swing.JMenuItem mniRegistrarJuridico;
    private javax.swing.JMenuItem mniRegistrarNatural;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenu mnuEmpresas;
    private javax.swing.JMenu mnuListados;
    private javax.swing.JMenu mnuPersonal;
    private javax.swing.JMenu mnuReportes;
    // End of variables declaration//GEN-END:variables
    private ListaClientes listaClientes = new ListaClientes();
}
