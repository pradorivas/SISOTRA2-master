/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.managed;

import java.util.ResourceBundle;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "login")
@SessionScoped
public class LoginBean {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String validarCredenciales() {
        String re = "";
        if ((username.equals("jefeflota") && password.equals("jsf")) || (username.equals("jefetaller") && password.equals("jsf"))) {
            re = "principal";
        } else {
            re = "";
        }
        return re;
    }

    public String autenticar() {

        //invocar registro a servicio de negocio
        boolean resultado = true;

        ResourceBundle rb
                = ResourceBundle.getBundle("com.llamagas.recursos.mensajes",
                        FacesContext.getCurrentInstance().getViewRoot().getLocale());

        //si servicio responde error por credenciales incorrectas
        if (!resultado) {
            FacesMessage fm = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    rb.getString("validacion_login_incorrecto"),
                    rb.getString("validacion_login_incorrecto_detail"));
            FacesContext.getCurrentInstance().addMessage(null, fm);

            return null;

        } else {
            //si servicio responde ok
            password = null;
            return "index";
        }

    }
}
