/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mail.template.ejb;

import com.fcastillo.mail.template.entidades.Templates;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fcastillo
 */
@Stateless
public class TemplatesFacade extends AbstractFacade<Templates> implements TemplatesFacadeLocal {

    @PersistenceContext(unitName = "com.fcastillo_mail-template_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TemplatesFacade() {
        super(Templates.class);
    }
    
}
