/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.exam;

import java.io.Serializable;

/**
 *
 * @author hcadavid
 */
public class TareaSolicitada implements Serializable{
 
    private String codigoTarea;
    private String descripcion;

    public TareaSolicitada(String codigoTarea, String descripcion) {
        this.codigoTarea = codigoTarea;
        this.descripcion = descripcion;
    }

    public String getCodigoTarea() {
        return codigoTarea;
    }

    public void setCodigoTarea(String codigoTarea) {
        this.codigoTarea = codigoTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
