package pkgclases;

/**
 *
 * @author Usuario
 */
//clase para leer el archivo curso
public class ClsLeerCurso {

    private ClsDocente objDocente;
    private ClsEstudiantes objEstudiante;
    private ClsHorarios objHorarios;

    public ClsLeerCurso(ClsHorarios objHorarios, ClsDocente objDocente, ClsEstudiantes objEstudiante) {
        this.objHorarios = objHorarios;
        this.objDocente = objDocente;
        this.objEstudiante = objEstudiante;
    }

    public ClsDocente getObjDocente() {
        return objDocente;
    }

    public ClsEstudiantes getObjEstudiante() {
        return objEstudiante;
    }

    public ClsHorarios getObjHorarios() {
        return objHorarios;
    }

}
