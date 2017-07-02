
package pkgclases;

import java.io.IOException;

public class ClsFachada {

    private ClsDocente objDocente;
    private ClsEstudiantes objEstudiante;
    private ClsHorarios objHorarios;
    private final ClsArchivos objArchivo;
    private ClsLogin objLogin;

    public ClsFachada() {
        objLogin = ClsLogin.getInstance();
        objDocente = new ClsDocente();
        objEstudiante = new ClsEstudiantes();
        objHorarios = new ClsHorarios();
        objArchivo = new ClsArchivos();
    }

//    metodo de la clase login(Patron Singleton)
    public ClsLogin objLogin(String usuario, String password) {
        objLogin.setStrusuario(usuario);
        objLogin.setStrpassword(password);
        objLogin = ClsLogin.getInstance();
        return objLogin;
    }

    //metodo de la clase docente
    public ClsDocente objdocent(String nombre, String apellido, String direccion, String lenguaje, String usuario, String password) {
        objDocente = new ClsDocente(nombre,apellido, direccion, lenguaje, usuario, password);
        return objDocente;
    }

    //metodo de la clase Estudiante
    public ClsEstudiantes objEstudiantes(String nombre, String apellido, String direccion, String edad, String usuario, String password) {
        objEstudiante = new ClsEstudiantes(nombre, apellido, direccion, edad, usuario, password);
        return objEstudiante;
    }

    //metodo de la clase Horarios
    public ClsHorarios objHorarios(String fechai, String fechaF, String dias, String horaI, String horaF) {
        objHorarios = new ClsHorarios(fechai, fechaF, dias, horaI, horaF);
        return objHorarios;
    }

    //leer los archivo
    public void archivo(ClsDocente objdocente, ClsEstudiantes objEstudiante, ClsHorarios objHorarios) throws IOException {
        objArchivo.save(objdocente, objEstudiante, objHorarios);
    }

    //------------------------------------------
    public ClsArchivos getObjArchivo() {
        return objArchivo;
    }

    public ClsLogin getObjLogin() {
        return objLogin;
    }

}
