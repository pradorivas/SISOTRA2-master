package com.llamagas.sisotra.managed;

import com.llamagas.sisotra.dao.OrdenTrabajoDao;
import com.llamagas.sisotra.dao.OrdenTrabajoDaoImpl;
import com.llamagas.sisotra.entidad.OrdenTrabajo;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author DENIS
 */
@ManagedBean(name = "ordenTrabajoBean")
@ViewScoped
public class OrdenTrabajoBean {

    private OrdenTrabajo ordenTrabajo = new OrdenTrabajo();
    private String mensaje;
    private List<OrdenTrabajo> listaOT;

    public OrdenTrabajo getOrdenTrabajo() {
        return ordenTrabajo;
    }

    public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public List<OrdenTrabajo> getLista() {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        listaOT = dao.listarTodo();
        return listaOT;
    }

    public void nuevoOrdenTrabajo() {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        dao.registrar(ordenTrabajo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se guardo OK"));
    }

    public void modificarOrdenTrabajo() {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        dao.actualizar(ordenTrabajo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se Modifico OK"));
    }

    public void eliminarOrdenTrabajo() {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        dao.eliminarSegun(ordenTrabajo);
        //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se Elimino"));
    }
    
    public void asignarOrdenTrabajo() {
        OrdenTrabajoDao dao = new OrdenTrabajoDaoImpl();
        dao.Asignar(ordenTrabajo);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Correcto", "El registro se asigno OK"));
    }
}
