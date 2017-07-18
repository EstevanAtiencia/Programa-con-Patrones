package pkgformularios;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import pkgclases.ClsFachada;

public class FrmRegistroEstudiantes extends javax.swing.JInternalFrame {

    static String b;
    private JComponent barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    //crear el objeto fachada
    ClsFachada objFachada = new ClsFachada();

    public FrmRegistroEstudiantes() {
        initComponents();
        b = "x";
        quitarBarraTitulo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        cbmEdad = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtUsuario1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(730, 510));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Registrar un nuevo Estudiante");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 239, 32));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 71, 135, 30));

        jLabel3.setText("Apellidos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 123, 127, 28));

        jLabel4.setText("Direccion");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 174, 127, 32));

        jLabel5.setText("Edad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 217, 119, 31));

        jLabel6.setText("Usuario");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 258, 105, 29));

        jLabel7.setText("Contraseña");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 305, 105, 29));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 71, 310, 30));

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 123, 310, 28));

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 174, 310, 32));

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 258, 290, 29));

        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 86, 37));

        cbmEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35" }));
        getContentPane().add(cbmEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 310, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 310, 30));

        txtUsuario1.setEditable(false);
        txtUsuario1.setText("e");
        txtUsuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuario1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 258, 30, 29));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Proyecto_Patrones\\imagenes\\fondo.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Metodos">  
    public void guardar() throws FileNotFoundException, IOException {
        String nombre = txtNombre.getText().toUpperCase();
        String apellido = txtApellido.getText().toUpperCase();
        String direccion = txtDireccion.getText().toUpperCase();
        String edad = cbmEdad.getSelectedItem().toString();
        String usuario = txtUsuario1.getText() + txtUsuario.getText().toLowerCase();
        String password = txtPassword.getText();
        boolean verifi = true;
        boolean verifi1 = true;
        if (nombre != null && apellido != null && direccion != null) {
            verifi = false;
        }
        if (edad != "----------" && usuario != null && password != null) {
            verifi1 = false;
        }
//        condicion que los txt no esten en nulos
        if (!verifi && !verifi1) {
            guardarveri(nombre, apellido, direccion, edad, usuario, password);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor llene todos los campos");
        }

    }

    //no sobrepase la Complejidad ciclomática
    public void guardarveri(String nombre, String apellido, String direccion, String edad, String usuario, String password) throws FileNotFoundException, IOException {
        boolean cond = true;
        for (int i = 0; i < objFachada.getObjArchivo().leerArchivoe().size(); i++) {
            if (usuario.equals(objFachada.getObjArchivo().leerArchivoe().get(i).getStrUsuario())) {
                JOptionPane.showMessageDialog(rootPane, "Usuario ya existe intente nuevamente");
                cond = false;
            }
        }
        if (cond) {
            objFachada.archivo(null, objFachada.objEstudiantes(nombre, apellido, direccion, edad, usuario, password), null);
            limpiar();
        }
    }

    public void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        cbmEdad.setSelectedIndex(0);
        txtUsuario.setText("");
        txtPassword.setText("");
    }

    public void quitarBarraTitulo() {
        barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        barra.setSize(0, 0);
        barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    public static String cerrar() {
        b = null;
        return b;
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Eventos">  
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtApellido.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped

        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped

        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' || letras > 'Z')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed

        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtDireccion.requestFocus();
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed

        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtUsuario.requestFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

        evt.setSource((char) KeyEvent.VK_CLEAR);
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        JPasswordField pwd = new JPasswordField(10);
        int action = JOptionPane.showConfirmDialog(null, pwd, "Ingresar Contraseña de Admin", JOptionPane.OK_CANCEL_OPTION);
        String password=String.valueOf(pwd.getPassword());
        if (password != null) {
            if (password.equals(objFachada.getObjLogin().getStrpassword())) {
                try {
                    guardar();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(FrmRegistroEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(FrmRegistroEstudiantes.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Intente nuevamente");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Intente nuevamente");
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cerrar();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUsuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuario1ActionPerformed

    // </editor-fold>  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbmEdad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
