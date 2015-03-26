/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.exam.remote;

/**
 *
 * @author hcadavid
 */
public interface ManejadorOfertasStub {
    

    /**
     * Agregar una propiesta económica para la tarea propuesta cuyo código
     * es 'codTarea'
     * @param codOferente código de quien realiza la oferta
     * @param codTarea
     * @param monto 
     */
    public void agregarOferta(String codOferente,String codTarea,int monto);
    
}
