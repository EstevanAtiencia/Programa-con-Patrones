package pkgformularios;

import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import pkgclases.ClsFachada;

public class FrmRegistroCurso extends javax.swing.JInternalFrame {

    static String z;
    //crear el objeto fachada
    ClsFachada objFachada = new ClsFachada();
    //paea llamar al metodo mostrar el usuario y se guarden los datos de dicho usuario
    String nombres;
    String apellidos;
    String lenguaje;
    String usuario;
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();

    public FrmRegistroCurso() throws FileNotFoundException {
        initComponents();
        cargar();
        cargarcurso();
        z = "x";
        QuitarLaBarraTitulo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbmFecha = new javax.swing.JComboBox<>();
        cbmHora = new javax.swing.JComboBox<>();
        txtfechafin = new javax.swing.JTextField();
        txtHorafin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cbmdias = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Registro del curso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 170, 30));

        jLabel3.setText("Hora de Inicio del Curso");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 20));

        jLabel4.setText("Fecha de Inicio del Curso");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 130, 30));

        jLabel5.setText("Fecha de Fin del Curso");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel6.setText("Hora Fin del Curso");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 110, 30));

        cbmFecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "08/07/2017" }));
        cbmFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmFechaActionPerformed(evt);
            }
        });
        getContentPane().add(cbmFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 180, 30));

        cbmHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "08:00", "14:00" }));
        cbmHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmHoraActionPerformed(evt);
            }
        });
        getContentPane().add(cbmHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, 30));

        txtfechafin.setEditable(false);
        getContentPane().add(txtfechafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 180, 30));

        txtHorafin.setEditable(false);
        txtHorafin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorafinActionPerformed(evt);
            }
        });
        getContentPane().add(txtHorafin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 180, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "lenguaje", "Usuario"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 370, 90));

        jLabel7.setText("Dias:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 30, 30));

        cbmdias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----------", "Lunes-Miercoles-Viernes", "Martes-Jueves-Sabado" }));
        getContentPane().add(cbmdias, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 180, 30));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable2.setBackground(new java.awt.Color(51, 51, 255));
        jTable2.setForeground(new java.awt.Color(255, 255, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha Inicio", "Fecha Fin", "Dias", "Hora Inicio", "Hora Fin", "Nombre del Docente", "Apellido Del Docente", "Lenguaje del Curso", "Usuario Docente", "Nombre del Alumno", "Apellido del Alumno", "Direccion", "Usuario"
            }
        ));
        jTable2.setEnabled(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 830, 90));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Proyecto_Patrones\\imagenes\\fondo2.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 860, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Metodos">  
    public void cargar() throws FileNotFoundException {
        String matriz[][] = new String[objFachada.getObjArchivo().leerArchivo().size()][4];
        for (int i = 0; i < objFachada.getObjArchivo().leerArchivo().size(); i++) {
            matriz[i][0] = objFachada.getObjArchivo().leerArchivo().get(i).getStrNombre();
            matriz[i][1] = objFachada.getObjArchivo().leerArchivo().get(i).getStrApellidos();
            matriz[i][2] = objFachada.getObjArchivo().leerArchivo().get(i).getStrLenguaje();
            matriz[i][3] = objFachada.getObjArchivo().leerArchivo().get(i).getStrUsuario();
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "Nombre", "Apellido", "lenguaje", "Usuario"
                }
        ));
    }

    public void cargarcurso() throws FileNotFoundException {
        String mc[][] = new String[objFachada.getObjArchivo().leerArchivoc().size()][13];
        int cont = 0;//contar cuantos registros no son iguales al usario q inicio session
        int cont1[] = new int[objFachada.getObjArchivo().leerArchivoc().size()];//contar en que posicion estan registrados
        int j = 0;
        for (int i = 0; i < objFachada.getObjArchivo().leerArchivoc().size(); i++) {
            if (objFachada.getObjArchivo().leerArchivoc().get(i).getObjEstudiante().getStrUsuario().equals(objFachada.getObjLogin().getStrusuario())) {
                mc[i][0] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjHorarios().getStrFechaInicio();
                mc[i][1] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjHorarios().getStrFechaFin();
                mc[i][2] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjHorarios().getStrDias();
                mc[i][3] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjHorarios().getStrHoraInicio();
                mc[i][4] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjHorarios().getStrHoraFin();
                mc[i][5] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjDocente().getStrNombre();
                mc[i][6] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjDocente().getStrApellidos();
                mc[i][7] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjDocente().getStrLenguaje();
                mc[i][8] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjDocente().getStrUsuario();
                mc[i][9] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjEstudiante().getStrNombre();
                mc[i][10] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjEstudiante().getStrApellidos();
                mc[i][11] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjEstudiante().getStrDirecion();
                mc[i][12] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjEstudiante().getStrUsuario();
                cont1[j] = i;
                j++;
            } else {
                cont++;
            }
        }
        String mcc[][] = new String[objFachada.getObjArchivo().leerArchivoc().size() - cont][13];
        for (int i = 0; i < objFachada.getObjArchivo().leerArchivoc().size() - cont; i++) {
            for (int k = 0; k < 13; k++) {
                mcc[i][k] = mc[cont1[i]][k];
            }
        }
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                mcc,
                new String[]{
                    "Fecha Inicio", "Fecha Fin", "Dias", "Hora Inicio", "Hora Fin", "Nombre del Docente", "Apellido Del Docente", "Lenguaje del Curso", "Usuario Docente", "Nombre del Alumno", "Apellido del Alumno", "Direccion", "Usuario"
                }
        ));
    }

    public void guardar() throws FileNotFoundException, IOException {
        String Matriz[][] = new String[1][13];
        Matriz[0][0] = cbmFecha.getSelectedItem().toString();
        Matriz[0][1] = txtfechafin.getText();
        Matriz[0][2] = cbmdias.getSelectedItem().toString();
        Matriz[0][3] = cbmHora.getSelectedItem().toString();
        Matriz[0][4] = txtHorafin.getText();
        Matriz[0][5] = nombres;
        Matriz[0][6] = apellidos;
        Matriz[0][7] = lenguaje;
        Matriz[0][8] = usuario;
        if (Matriz[0][0] != ("----------") && Matriz[0][2] != "----------" && Matriz[0][3] != "----------" && nombres != null) {
            for (int i = 0; i < objFachada.getObjArchivo().leerArchivoe().size(); i++) {
                if (objFachada.getObjArchivo().leerArchivoe().get(i).getStrUsuario().equals(objFachada.getObjLogin().getStrusuario())) {
                    Matriz[0][9] = objFachada.getObjArchivo().leerArchivoe().get(i).getStrNombre();
                    Matriz[0][10] = objFachada.getObjArchivo().leerArchivoe().get(i).getStrApellidos();
                    Matriz[0][11] = objFachada.getObjArchivo().leerArchivoe().get(i).getStrDirecion();
                    Matriz[0][12] = objFachada.getObjArchivo().leerArchivoe().get(i).getStrUsuario();
                    objFachada.archivo(objFachada.objdocent(Matriz[0][5], Matriz[0][6], null, Matriz[0][7], Matriz[0][8], null),
                            objFachada.objEstudiantes(Matriz[0][9], Matriz[0][10], Matriz[0][11], null, Matriz[0][12], null),
                            objFachada.objHorarios(Matriz[0][0], Matriz[0][1], Matriz[0][2], Matriz[0][3], Matriz[0][4]));
                    limpiar();
                    cargarcurso();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Por favor Selecione todo lo necesario incluyendo los de la tabla");
        }
    }

    public void limpiar() throws FileNotFoundException {
        cbmFecha.setSelectedIndex(0);
        txtfechafin.setText("");
        cbmHora.setSelectedIndex(0);
        txtHorafin.setText("");
        cbmdias.setSelectedIndex(0);
        cbmdias.setSelectedIndex(0);
        cargar();
    }

    public void QuitarLaBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    public static String cerrar() {
        z = null;
        return z;
    }
    // </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="Eventos"> 

    private void cbmFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmFechaActionPerformed

        if (cbmFecha.getSelectedItem().toString().equals("08/07/2017")) {
            txtfechafin.setText("08/11/2017");
        }
    }//GEN-LAST:event_cbmFechaActionPerformed

    private void txtHorafinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorafinActionPerformed

    }//GEN-LAST:event_txtHorafinActionPerformed

    private void cbmHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmHoraActionPerformed

        if (cbmHora.getSelectedItem().toString().equals("08:00")) {
            txtHorafin.setText("12:00");
        } else {
            txtHorafin.setText("18:00");
        }
    }//GEN-LAST:event_cbmHoraActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int filaseleccionada;
        filaseleccionada = jTable1.getSelectedRow();
        nombres = (String) jTable1.getValueAt(filaseleccionada, 0);
        apellidos = (String) jTable1.getValueAt(filaseleccionada, 1);
        lenguaje = (String) jTable1.getValueAt(filaseleccionada, 2);
        usuario = (String) jTable1.getValueAt(filaseleccionada, 3);

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        JPasswordField pwd = new JPasswordField(10);
        int action = JOptionPane.showConfirmDialog(null, pwd, "Ingresar Contraseña", JOptionPane.OK_CANCEL_OPTION);
        String password = String.valueOf(pwd.getPassword());
        if (password != null) {
            if (password.equals(objFachada.getObjLogin().getStrpassword())) {
                try {
                    guardar();
                } catch (IOException ex) {
                    Logger.getLogger(FrmRegistroCurso.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Intente nuevamente");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Intente nuevamente");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        cerrar();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    // </editor-fold>  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbmFecha;
    private javax.swing.JComboBox<String> cbmHora;
    private javax.swing.JComboBox<String> cbmdias;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtHorafin;
    private javax.swing.JTextField txtfechafin;
    // End of variables declaration//GEN-END:variables
}
