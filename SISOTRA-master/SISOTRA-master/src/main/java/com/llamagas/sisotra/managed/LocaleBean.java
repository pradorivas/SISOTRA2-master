/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.llamagas.sisotra.managed;

import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Java-LM
 */
@ManagedBean
@SessionScoped
public class LocaleBean {

    private Locale locale;

    @PostConstruct
    public void init() {
        locale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
    }

    public Locale getLocale() {
        return locale;
    }

    public String getLenguaje() {
        return locale.getLanguage();
    }

    public void cambiaLocale() {
        if (locale.equals(Locale.US)) {
            locale = new Locale("es", "ES");
        } else {
            locale = Locale.US;
        }
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }
}
