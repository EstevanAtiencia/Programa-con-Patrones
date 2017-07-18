package pkgformularios;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pkgclases.ClsFachada;

public class FrmEstudiante extends javax.swing.JFrame {

    public FrmEstudiante() {
        initComponents();
        mostrar();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMostrar = new javax.swing.JLabel();
        dpnCursos = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMostrar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblMostrar.setForeground(new java.awt.Color(0, 51, 255));
        getContentPane().add(lblMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 0, 130, 29));

        javax.swing.GroupLayout dpnCursosLayout = new javax.swing.GroupLayout(dpnCursos);
        dpnCursos.setLayout(dpnCursosLayout);
        dpnCursosLayout.setHorizontalGroup(
            dpnCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        dpnCursosLayout.setVerticalGroup(
            dpnCursosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );

        getContentPane().add(dpnCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 860, 510));

        jMenu1.setText("Inicio");

        jMenuItem2.setText("Registrar el Curso");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Cerrar Sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrar() {
        //Al implantar el patron singleton se puede crear otro objeto de la clase y sigue teniendo el valor
        //clsLogin objLogin =clsLogin.getInstance();
//        clsLogin objLogin1 = clsLogin.getInstance();
//        lblMostrar.setText(objLogin1.getStrusuario());
        ClsFachada objLogin = new ClsFachada();
        lblMostrar.setText(objLogin.getObjLogin().getStrusuario());
    }


    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        String x = FrmRegistroCurso.z;
        if (x == null) {
            FrmLogin a = new FrmLogin();
            a.setVisible(true);
            hide();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor cierre la ventana antes de cerrar sesión");
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        String x = FrmRegistroCurso.z;
        if (x == null) {
            try {
                FrmRegistroCurso objr = new FrmRegistroCurso();
                dpnCursos.add(objr);
                objr.show();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmEstudiante.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor cierre la ventana para abrir una nueva");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnCursos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblMostrar;
    // End of variables declaration//GEN-END:variables
}
