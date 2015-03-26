/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.exam.remote;

import edu.eci.arsw.exam.FachadaPersistenciaOfertas;

/**
 *
 * @author hcadavid
 */
public class ManejadorOfertasSkeleton implements ManejadorOfertasStub{

    private FachadaPersistenciaOfertas fpers=null;

    public void setFachadaPersistenciaOfertas(FachadaPersistenciaOfertas fpers) {
        this.fpers = fpers;
    }
            
    @Override
    public void agregarOferta(String codOferente,String codtarea,int monto) {
        
        if (!fpers.getMapaOfertasRecibidas().containsKey(codtarea)){
            //se ha recibido la primera oferta 
            fpers.getMapaOfertasRecibidas().put(codtarea, 1);
            //se asigna el monto propuesto como mejor oferta
            fpers.getMapaMontosAsignados().put(codtarea, monto);
            //se asigna al oferente como ganador provisional
            fpers.getMapaOferentesAsignados().put(codtarea, codOferente);
        }
        else{
            int ofertasActuales=fpers.getMapaOfertasRecibidas().get(codtarea);
            fpers.getMapaOfertasRecibidas().put(codtarea,ofertasActuales+1);
            if (fpers.getMapaMontosAsignados().get(codtarea)>monto){
                fpers.getMapaMontosAsignados().put(codtarea, monto);
                fpers.getMapaOferentesAsignados().put(codtarea, codOferente);
            }
        }
        
    }
    
    
    
}
