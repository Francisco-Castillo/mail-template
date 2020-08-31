/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mail.template.ejb;

import com.fcastillo.mail.template.entidades.FlywaySchemaHistory;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fcastillo
 */
@Stateless
public class FlywaySchemaHistoryFacade extends AbstractFacade<FlywaySchemaHistory> implements FlywaySchemaHistoryFacadeLocal {

    @PersistenceContext(unitName = "com.fcastillo_mail-template_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FlywaySchemaHistoryFacade() {
        super(FlywaySchemaHistory.class);
    }
    
}
