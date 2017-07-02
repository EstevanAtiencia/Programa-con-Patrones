
package pkgformularios;

import java.awt.Dimension;
import java.io.FileNotFoundException;
import javax.swing.JComponent;
import pkgclases.ClsFachada;

public class FrmCursos extends javax.swing.JInternalFrame {

    static String a;
    //crear el objeto fachada
    ClsFachada objFachada = new ClsFachada();

    public FrmCursos() throws FileNotFoundException {
        initComponents();
        cargarcurso();
        a = "x";
        QuitarLaBarraTitulo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(951, 278));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha Inicio", "Fecha Fin", "Dias", "Hora Inicio", "Hora Fin", "Lenguaje", "Nombre de Alunmos", "Apellido de Alumnos"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setPreferredSize(new java.awt.Dimension(0, 224));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 33, 930, 170));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing


    }//GEN-LAST:event_formInternalFrameClosing

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        cerrar();
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    // <editor-fold defaultstate="collapsed" desc="Metodos">  
    public void cargarcurso() throws FileNotFoundException {
        String mc[][] = new String[objFachada.getObjArchivo().leerArchivoc().size()][8];
        int cont = 0;//contar cuantos registros no son iguales al usario q inicio session
        int cont1[] = new int[objFachada.getObjArchivo().leerArchivoc().size()];//contar en que posicion estan registrados
        int j = 0;
        for (int i = 0; i < objFachada.getObjArchivo().leerArchivoc().size(); i++) {
            if (objFachada.getObjArchivo().leerArchivoc().get(i).getObjDocente().getStrUsuario().equals(objFachada.getObjLogin().getStrusuario())) {
                mc[i][0] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjHorarios().getStrFechaInicio();
                mc[i][1] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjHorarios().getStrFechaFin();
                mc[i][2] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjHorarios().getStrDias();
                mc[i][3] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjHorarios().getStrHoraInicio();
                mc[i][4] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjHorarios().getStrHoraFin();
                mc[i][5] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjDocente().getStrLenguaje();
                mc[i][6] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjEstudiante().getStrNombre();
                mc[i][7] = objFachada.getObjArchivo().leerArchivoc().get(i).getObjEstudiante().getStrApellidos();
                cont1[j] = i;
                j++;
            } else {
                cont++;
            }
        }
        String mcc[][] = new String[objFachada.getObjArchivo().leerArchivoc().size() - cont][8];
        for (int i = 0; i < objFachada.getObjArchivo().leerArchivoc().size() - cont; i++) {
            for (int k = 0; k < 8; k++) {
                mcc[i][k] = mc[cont1[i]][k];
            }
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                mcc,
                new String[]{
                    "Fecha Inicio", "Fecha Fin", "Dias", "Hora Inicio", "Hora Fin", "Lenguaje", "Nombre de Alunmos", "Apellido de Alumnos"
                }
        ));
    }

    //defino dos métodosdentro del JInternalFrame y lo instanciamos de la siguiente manera.
    private JComponent Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
    private Dimension DimensionBarra = null;
    //A continuación creamos una función dentro del mismo JInternalFrame como el ejemplo siguiente:

    public void QuitarLaBarraTitulo() {
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        DimensionBarra = Barra.getPreferredSize();
        Barra.setSize(0, 0);
        Barra.setPreferredSize(new Dimension(0, 0));
        repaint();
    }

    public static String cerrar() {
        a = null;
        return a;
    }
    // </editor-fold>  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
