/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.exam;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author hcadavid
 */
public class FachadaPersistenciaOfertas {

    //mapa <codigo tarea,detalle de la tarea>
    final private Map<String, TareaSolicitada> mapaTareasSolicitadas = new LinkedHashMap<>();

    //mapa <codigo tarea,codigo del cliente con la mejor oferta>
    final private Map<String, String> mapaOferentesAsignados = new LinkedHashMap<>();

    //mapa <codigo tarea, monto de la mejor oferta>
    final private Map<String, Integer> mapaMontosAsignados = new LinkedHashMap<>();

    //mapa <codigo tarea, numero de ofertas recibidas>
    final private Map<String, Integer> mapaOfertasRecibidas = new LinkedHashMap<>();

    public Map<String, TareaSolicitada> getMapaTareasSolicitadas() {
        return mapaTareasSolicitadas;
    }

    public Map<String, Integer> getMapaOfertasRecibidas() {
        return mapaOfertasRecibidas;
    }

    public Map<String, String> getMapaOferentesAsignados() {
        return mapaOferentesAsignados;
    }

    public Map<String, Integer> getMapaMontosAsignados() {
        return mapaMontosAsignados;
    }

}
