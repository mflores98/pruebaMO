/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh.negocio.logica;

import java.security.Provider;
import java.util.List;
import sh.entidades.Familias;
import sh.util.ServiceLocator;

/**
 *
 * @author Owner
 */
public class FacadeteFamilia {

    public List<Familias> mostrarFamilia() {
        ServiceLocator.getInstance().setTipo(Familias.class);
        List<Familias> findAll = ServiceLocator.getInstance().findAll();
        return findAll;
    }

    public Familias getFamiliaId(int id) {
        ServiceLocator.getInstance().setTipo(Familias.class);
        Familias find = (Familias) ServiceLocator.getInstance().find(id);
        return find;
    }
}
