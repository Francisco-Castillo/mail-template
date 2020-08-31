/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mail.template.ejb;

import com.fcastillo.mail.template.entidades.Templates;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author fcastillo
 */
@Local
public interface TemplatesFacadeLocal {

    void create(Templates templates);

    void edit(Templates templates);

    void remove(Templates templates);

    Templates find(Object id);

    List<Templates> findAll();

    List<Templates> findRange(int[] range);

    int count();
    
}
