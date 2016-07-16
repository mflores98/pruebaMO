/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.negocio.servicios;

import sh.negocio.logica.FacadeteFamilia;

/**
 *
 * @author Owner
 */
public class ServiceFacadeLocator {

    private static FacadeteFamilia facadeteFamilia;

    public static FacadeteFamilia getFacadeteFamilia() {
        if (facadeteFamilia == null) {
            facadeteFamilia = new FacadeteFamilia();
            return facadeteFamilia;
        } else {
            return facadeteFamilia;
        }
    }
}
