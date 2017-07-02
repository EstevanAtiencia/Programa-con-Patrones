/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ClsArchivos {

    // <editor-fold defaultstate="collapsed" desc="Metodo Guardar"> 
    //guardar todos los registros docentes, estudiantes y registros de los cursos
    public void save(ClsDocente objdocente, ClsEstudiantes objEstudiantes, ClsHorarios objHorarios) throws IOException {

            File[] f = new File[3];
            f[0] = new File("Docentes.txt");
            f[1] = new File("Estudiantes.txt");
            f[2] = new File("RHorarios.txt");
            FileWriter fw;
            BufferedWriter bw;
            //si docente es diferente de null entra a registrar a docente
            if (objdocente != null && objEstudiantes == null && objHorarios == null) {
                if (f[0].exists()) {
                    fw = new FileWriter(f[0], true);
                    bw = new BufferedWriter(fw);
                    bw.newLine();
                    bw.write(objdocente.getStrNombre() + "////" + objdocente.getStrApellidos() + "////" + objdocente.getStrDirecion()
                            + "////" + objdocente.getStrLenguaje() + "////" + objdocente.getStrUsuario() + "////" + objdocente.getStrPassword());
                    JOptionPane.showMessageDialog(null, "Docente Registrado Corretamente");
                } else {
                    fw = new FileWriter(f[0], true);
                    bw = new BufferedWriter(fw);
                    bw.write(objdocente.getStrNombre() + "////" + objdocente.getStrApellidos() + "////" + objdocente.getStrDirecion()
                            + "////" + objdocente.getStrLenguaje() + "////" + objdocente.getStrUsuario() + "////" + objdocente.getStrPassword());
                    JOptionPane.showMessageDialog(null, "Docente Registrado Corretamente");
                }
                bw.close();
                fw.close();
            } //si el objeto estudiante es diferente de null entra a registrar estudiante
            if (objEstudiantes != null && objdocente == null && objHorarios == null) {
                if (f[1].exists()) {
                    fw = new FileWriter(f[1], true);
                    bw = new BufferedWriter(fw);
                    bw.newLine();
                    bw.write(objEstudiantes.getStrNombre() + "////" + objEstudiantes.getStrApellidos() + "////" + objEstudiantes.getStrDirecion() + "////"
                            + objEstudiantes.getStrEdad() + "////" + objEstudiantes.getStrUsuario() + "////" + objEstudiantes.getStrPassword());
                    JOptionPane.showMessageDialog(null, "Estudiante Registrado Corretamente");
                } else {
                    fw = new FileWriter(f[1], true);
                    bw = new BufferedWriter(fw);
                    bw.write(objEstudiantes.getStrNombre() + "////" + objEstudiantes.getStrApellidos() + "////" + objEstudiantes.getStrDirecion() + "////"
                            + objEstudiantes.getStrEdad() + "////" + objEstudiantes.getStrUsuario() + "////" + objEstudiantes.getStrPassword());
                    JOptionPane.showMessageDialog(null, "Estudiante Registrado Corretamente");
                }
                bw.close();
                fw.close();
            }
            if (objEstudiantes != null && objdocente != null && objHorarios != null) {
                if (f[2].exists()) {
                    fw = new FileWriter(f[2], true);
                    bw = new BufferedWriter(fw);
                    bw.newLine();
                    bw.write(objHorarios.getStrFechaInicio() + "////" + objHorarios.getStrFechaFin() + "////" + objHorarios.getStrDias()
                            + "////" + objHorarios.getStrHoraInicio() + "////" + objHorarios.getStrHoraFin() + "////"
                            + objdocente.getStrNombre() + "////" + objdocente.getStrApellidos() + "////" + objdocente.getStrLenguaje()
                            + "////" + objdocente.getStrUsuario() + "////" + objEstudiantes.getStrNombre() + "////"
                            + objEstudiantes.getStrApellidos() + "////" + objEstudiantes.getStrDirecion() + "////" + objEstudiantes.getStrUsuario());
                    JOptionPane.showMessageDialog(null, "Curso Registrado Corretamente");
                } else {
                    fw = new FileWriter(f[2], true);
                    bw = new BufferedWriter(fw);
                    bw.write(objHorarios.getStrFechaInicio() + "////" + objHorarios.getStrFechaFin() + "////" + objHorarios.getStrDias()
                            + "////" + objHorarios.getStrHoraInicio() + "////" + objHorarios.getStrHoraFin() + "////"
                            + objdocente.getStrNombre() + "////" + objdocente.getStrApellidos() + "////" + objdocente.getStrLenguaje()
                            + "////" + objdocente.getStrUsuario() + "////" + objEstudiantes.getStrNombre() + "////"
                            + objEstudiantes.getStrApellidos() + "////" + objEstudiantes.getStrDirecion() + "////" + objEstudiantes.getStrUsuario());
                    JOptionPane.showMessageDialog(null, "Curso Registrado Corretamente");
                }
                bw.close();
                fw.close();
            }

      
    }
    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="Metodo Leer">  
    //leer un archivo Docente
    public ArrayList<ClsDocente> leerArchivo() throws FileNotFoundException {
        ArrayList<ClsDocente> lstDocentes = new ArrayList();

            File file = new File("Docentes.txt");
            Scanner s= new Scanner(file);
            int intInc = 0;
            while (s.hasNextLine()) {
                String strLinea = s.nextLine();
                String [] tokens = strLinea.split("////");
                lstDocentes.add(intInc, new ClsDocente(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]));
                intInc = intInc + 1;
            }
            s.close();
        return lstDocentes;
    }

    //leer un archivo Estudiante
    public ArrayList<ClsEstudiantes> leerArchivoe() throws FileNotFoundException {
        ArrayList<ClsEstudiantes> lstEstudiantes = new ArrayList();
        
            File file = new File("Estudiantes.txt");
            Scanner s = new Scanner(file);
            int intInc = 0;
            while (s.hasNextLine()) {
                String strLinea = s.nextLine();
                String [] tokens = strLinea.split("////");
                lstEstudiantes.add(intInc, new ClsEstudiantes(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]));
                intInc = intInc + 1;
            }
            s.close();
        return lstEstudiantes;
    }

    public ArrayList<ClsLeerCurso> leerArchivoc() throws FileNotFoundException {
        ClsFachada objFachada = new ClsFachada();
        ArrayList<ClsLeerCurso> lsCursos = new ArrayList();
            File file = new File("RHorarios.txt");
            Scanner s = new Scanner(file);
            int intInc = 0;
            while (s.hasNextLine()) {
                String strLinea = s.nextLine();
                String [] tokens = strLinea.split("////");
                lsCursos.add(intInc, new ClsLeerCurso(objFachada.objHorarios(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]),
                        objFachada.objdocent(tokens[5], tokens[6], null, tokens[7], tokens[8], null),
                        objFachada.objEstudiantes(tokens[9], tokens[10], tokens[11], null, tokens[12], null)));
                intInc = intInc + 1;
            }
            s.close();
        return lsCursos;
    }

    // </editor-fold> 
}
