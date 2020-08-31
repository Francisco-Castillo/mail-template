/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mail.template.controller;

import com.fcastillo.mail.template.ejb.TemplatesFacadeLocal;
import com.fcastillo.mail.template.entidades.Templates;
import java.io.Serializable;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author fcastillo
 */
@Named
@ViewScoped
public class TemplateDataController implements Serializable {

    @EJB
    TemplatesFacadeLocal templateEJB;
    private Templates templates = new Templates();

    public Templates getTemplates() {
        return templates;
    }

    public void setTemplates(Templates templates) {
        this.templates = templates;
    }

    public void registrar() {
        try {
            templateEJB.create(templates);
            System.out.println("registrado.....");
        } catch (Exception e) {
            System.out.println("erroro : " + e);
        }
    }

}
