
package com.llamagas.sisotra.entidad;

import java.io.Serializable;
import java.util.Date;

/**
 * @author DENIS
 */

public class OrdenTrabajo implements Serializable{
    //datos de orden trabajo
    private String IdOrdenT;
    private String IdNomima;
    private Date F_Ingreso;
    private Date F_termino;
    private String Descripcion;
    private Integer Kilometraje;
    private String Estado;
    //datos del empleado o jefe de flota
    private String Empleado;
    private String Cargo_emple;
    private String Area_emple;
    //datos de la unidad
    private String IdPlaca;
    private String Marca;
    private String Modelo;
    private String Zonal;
    private Integer A_fabri;

    public OrdenTrabajo() {
    }

    
    public String getIdOrdenT() {
        return IdOrdenT;
    }

    public void setIdOrdenT(String IdOrdenT) {
        this.IdOrdenT = IdOrdenT;
    }

    public String getIdNomima() {
        return IdNomima;
    }

    public void setIdNomima(String IdNomima) {
        this.IdNomima = IdNomima;
    }

    public Date getF_Ingreso() {
        return F_Ingreso;
    }

    public void setF_Ingreso(Date F_Ingreso) {
        this.F_Ingreso = F_Ingreso;
    }

    public Date getF_termino() {
        return F_termino;
    }

    public void setF_termino(Date F_termino) {
        this.F_termino = F_termino;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Integer getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(Integer Kilometraje) {
        this.Kilometraje = Kilometraje;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(String Empleado) {
        this.Empleado = Empleado;
    }

    public String getCargo_emple() {
        return Cargo_emple;
    }

    public void setCargo_emple(String Cargo_emple) {
        this.Cargo_emple = Cargo_emple;
    }

    public String getArea_emple() {
        return Area_emple;
    }

    public void setArea_emple(String Area_emple) {
        this.Area_emple = Area_emple;
    }

    public String getIdPlaca() {
        return IdPlaca;
    }

    public void setIdPlaca(String IdPlaca) {
        this.IdPlaca = IdPlaca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getZonal() {
        return Zonal;
    }

    public void setZonal(String Zonal) {
        this.Zonal = Zonal;
    }

    public Integer getA_fabri() {
        return A_fabri;
    }

    public void setA_fabri(Integer A_fabri) {
        this.A_fabri = A_fabri;
    }

}
