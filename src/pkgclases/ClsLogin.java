/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclases;

/**
 *
 * @author Usuario
 */
public class ClsLogin {

    private static ClsLogin login;
    private String strusuario;
    private String strpassword;

    private ClsLogin() {

    }

    public static ClsLogin getInstance() {
        if (login == null) {
            login = new ClsLogin();
        }
        return login;
    }

    public static ClsLogin getLogin() {
        return login;
    }

    public static void setLogin(ClsLogin login) {
        ClsLogin.login = login;
    }

    public String getStrusuario() {
        return strusuario;
    }

    public void setStrusuario(String strusuario) {
        this.strusuario = strusuario;
    }

    public String getStrpassword() {
        return strpassword;
    }

    public void setStrpassword(String strpassword) {
        this.strpassword = strpassword;
    }

    

}
