package pkgformularios;

import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pkgclases.ClsFachada;

public class FrmLogin extends javax.swing.JFrame {

    ClsFachada objfachada = new ClsFachada();

    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAcceder = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcceder.setText("Acceder");
        btnAcceder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 96, 40));

        txtpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 120, 40));

        txtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 120, 40));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 86, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 86, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Sistema de Regritros de Cursos de Lenguaje de Programacion");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 69));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Proyecto_Patrones\\imagenes\\fondo1.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Metodos">  
    public void acceder(String user, String pass) throws FileNotFoundException {
        int usuario = txtUsuario.getText().length();
        int password = txtpassword.getText().length();
        boolean cond = true;
        if (usuario > 0 && password > 0) {
            char b = user.charAt(0);
            //entrada al admin
            if (user.equals("admin") && pass.equals("admin")) {
                objfachada.objLogin(user, pass);
                FrmAdmin objlogin = new FrmAdmin();
                objlogin.setVisible(true);
                cond = false;
                hide();
            } else if (b == 'e') {//entrada a los estudiantes
                for (int i = 0; i < objfachada.getObjArchivo().leerArchivoe().size(); i++) {
                    if (user.equals(objfachada.getObjArchivo().leerArchivoe().get(i).getStrUsuario())
                            && pass.equals(objfachada.getObjArchivo().leerArchivoe().get(i).getStrPassword())) {
                        objfachada.objLogin(user, pass);
                        cond = false;
                        FrmEstudiante objoestudiante=new FrmEstudiante();
                        objoestudiante.setVisible(true);
                        hide();
                    }
                }
            } else if (b == 'd') {//entrada a los docentes
                for (int i = 0; i < objfachada.getObjArchivo().leerArchivo().size(); i++) {
                    if (user.equals(objfachada.getObjArchivo().leerArchivo().get(i).getStrUsuario())
                            && pass.equals(objfachada.getObjArchivo().leerArchivo().get(i).getStrPassword())) {
                        objfachada.objLogin(user, pass);
                        cond = false;
                        FrmDocente objDocente=new FrmDocente();
                        objDocente.setVisible(true);
                        hide();
                    }
                }
            }
            if (cond == true) {
                JOptionPane.showMessageDialog(null, "NO EXISTE EL USUARIO", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Llene los campos Usuario y Contraseña");

        }

    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Eventos">  
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtpassword.requestFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed

        try {
            acceder(txtUsuario.getText(), txtpassword.getText());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed

        evt.setSource((char) KeyEvent.VK_CLEAR);
        btnAcceder.requestFocus();
    }//GEN-LAST:event_txtpasswordActionPerformed
    // </editor-fold>  

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
