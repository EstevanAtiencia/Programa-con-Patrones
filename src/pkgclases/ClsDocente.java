
package pkgclases;


public class ClsDocente {

    private String strNombred;
    private String strApellidosd;
    private String strDireciond;
    private String strLenguajed;
    private String strUsuariod;
    private String strPasswordd;

    public ClsDocente() {
//        para incluir en fachada
    }

    public ClsDocente (String strNombre, String strApellidos, String strDirecion, String strLenguaje, String strUsuario, String strPassword) {
        this.strNombred = strNombre;
        this.strApellidosd = strApellidos;
        this.strDireciond = strDirecion;
        this.strLenguajed = strLenguaje;
        this.strUsuariod = strUsuario;
        this.strPasswordd = strPassword;
    }

    public String getStrNombre() {
        return strNombred;
    }

    public void setStrNombre(String strNombre) {
        this.strNombred = strNombre;
    }

    public String getStrApellidos() {
        return strApellidosd;
    }

    public void setStrApellidos(String strApellidos) {
        this.strApellidosd = strApellidos;
    }

    public String getStrDirecion() {
        return strDireciond;
    }

    public void setStrDirecion(String strDirecion) {
        this.strDireciond = strDirecion;
    }

    public String getStrLenguaje() {
        return strLenguajed;
    }

    public void setStrLenguaje(String strLenguaje) {
        this.strLenguajed = strLenguaje;
    }

    public String getStrUsuario() {
        return strUsuariod;
    }

    public void setStrUsuario(String strUsuario) {
        this.strUsuariod = strUsuario;
    }

    public String getStrPassword() {
        return strPasswordd;
    }

    public void setStrPassword(String strPassword) {
        this.strPasswordd = strPassword;
    }

}
