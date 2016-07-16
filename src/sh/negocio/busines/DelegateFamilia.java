/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.negocio.busines;

import java.util.List;
import sh.entidades.Familias;
import sh.negocio.servicios.ServiceFacadeLocator;
import sh.util.ServiceLocator;

/**
 *
 * @author Owner
 */
public class DelegateFamilia {

    public DelegateFamilia() {
    }
 public void insertFamilia(Familias f){
     ServiceLocator.getInstance().setTipo(Familias.class);
     if (f!=null) {
         
     }
     ServiceLocator.getInstance().save(f);
 }
 
 public List<Familias> selectAllFamilias(){
        List<Familias> mostrarFamilia = ServiceFacadeLocator.getFacadeteFamilia().mostrarFamilia();
        return mostrarFamilia;
 }
 
 public Familias getFamiliaId(int id){
        Familias familiaId = ServiceFacadeLocator.getFacadeteFamilia().getFamiliaId(id);
        if (familiaId==null) {
            System.out.println("no existe objeto familia");
     }
        return familiaId;
 }
 

}
