/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shnegocio;

import java.util.List;
import sh.entidades.Familias;
import sh.negocio.logica.FacadeteFamilia;
import sh.util.ServiceLocator;

/**
 *
 * @author Owner
 */
public class SHNegocio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FacadeteFamilia facadeteFamilia=new FacadeteFamilia();
        List<Familias> mostrarFamilia = facadeteFamilia.mostrarFamilia();
        for (Familias mostrarFamilia1 : mostrarFamilia) {
            System.out.println(mostrarFamilia1.getFamilia());
        }
    }
    
    
}
