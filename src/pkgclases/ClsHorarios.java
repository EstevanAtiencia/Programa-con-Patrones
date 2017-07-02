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
public class ClsHorarios {

    private String strFechaInicio;
    private String strFechaFin;
    private String strDias;
    private String strHoraInicio;
    private String strHoraFin;

    public ClsHorarios() {
        //funcione facade
    }

    public ClsHorarios(String strFechaInicio, String strFechaFin, String strDias, String strHoraInicio, String strHoraFin) {
        this.strFechaInicio = strFechaInicio;
        this.strFechaFin = strFechaFin;
        this.strDias = strDias;
        this.strHoraInicio = strHoraInicio;
        this.strHoraFin = strHoraFin;
    }

    public String getStrFechaInicio() {
        return strFechaInicio;
    }

    public void setStrFechaInicio(String strFechaInicio) {
        this.strFechaInicio = strFechaInicio;
    }

    public String getStrFechaFin() {
        return strFechaFin;
    }

    public void setStrFechaFin(String strFechaFin) {
        this.strFechaFin = strFechaFin;
    }

    public String getStrDias() {
        return strDias;
    }

    public void setStrDias(String strDias) {
        this.strDias = strDias;
    }

    public String getStrHoraInicio() {
        return strHoraInicio;
    }

    public void setStrHoraInicio(String strHoraInicio) {
        this.strHoraInicio = strHoraInicio;
    }

    public String getStrHoraFin() {
        return strHoraFin;
    }

    public void setStrHoraFin(String strHoraFin) {
        this.strHoraFin = strHoraFin;
    }

}
