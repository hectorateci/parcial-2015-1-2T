/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.exam.test;

import edu.eci.arsw.exam.FachadaPersistenciaOfertas;
import edu.eci.arsw.exam.TareaSolicitada;

/**
 *
 * @author hcadavid
 */
public class FachadaPersistenciaTest {
    
    public static void main(String a[]){
        
        FachadaPersistenciaOfertas pof=new FachadaPersistenciaOfertas();
        pof.getMapaTareasSolicitadas().put("1111", new TareaSolicitada("1111","bla bla"));
        pof.getMapaOferentesAsignados().put("1111", "xxxxx");
        
    }
    
}
