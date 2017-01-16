/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.managed;

import javax.faces.event.ActionEvent;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author DENIS
 */
@ManagedBean(name = "consultaPag")
public class PaginasBean {

    private String user;
    private String pag;

    public String getPag() {
        return pag;
    }

    public void setPag(String pag) {
        this.pag = pag;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void confirmarAccion(ActionEvent ae) {
        user = (String) ae.getComponent().getAttributes().get("user");
        pag = (String) ae.getComponent().getAttributes().get("pagina");
    }

    public String consultar() {
        switch (pag) {
            case "1":
                if ("jefeflota".equals(user)) {
                    pag = "registrarOT";
                }
                if ("jefetaller".equals(user)) {
                    pag = "principal";
                }
                break;
            case "2":
                if ("jefeflota".equals(user)) {
                    pag = "ListadoOT";
                }
                if ("jefetaller".equals(user)) {
                    pag = "principal";
                }
                break;
            case "3":
                if ("jefeflota".equals(user)) {
                    pag = "principal";
                }
                if ("jefetaller".equals(user)) {
                    pag = "AsignarOT";
                }
                break;
            case "4":
                if ("jefeflota".equals(user)) {
                    pag = "principal";
                }
                if ("jefetaller".equals(user)) {
                    pag = "ListaAsignaciones";
                }
                break;
        }
        return pag;
    }
}
