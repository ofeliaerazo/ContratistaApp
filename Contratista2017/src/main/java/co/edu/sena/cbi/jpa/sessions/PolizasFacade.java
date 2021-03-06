/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.sena.cbi.jpa.sessions;

import co.edu.sena.cbi.jpa.entities.Polizas;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adsi1261718
 */
@Stateless
public class PolizasFacade extends AbstractFacade<Polizas> {

    @PersistenceContext(unitName = "co.edu.sena.adsi.jpa_Contratista2017_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PolizasFacade() {
        super(Polizas.class);
    }
    
}
