/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mail.template.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fcastillo
 */
@Entity
@Table(name = "Templates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Templates.findAll", query = "SELECT t FROM Templates t"),
    @NamedQuery(name = "Templates.findById", query = "SELECT t FROM Templates t WHERE t.id = :id"),
    @NamedQuery(name = "Templates.findByNombre", query = "SELECT t FROM Templates t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Templates.findByAsunto", query = "SELECT t FROM Templates t WHERE t.asunto = :asunto"),
    @NamedQuery(name = "Templates.findByTipo", query = "SELECT t FROM Templates t WHERE t.tipo = :tipo")})
public class Templates implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "asunto")
    private String asunto;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "cuerpo")
    private String cuerpo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tipo")
    private int tipo;

    public Templates() {
    }

    public Templates(Integer id) {
        this.id = id;
    }

    public Templates(Integer id, String nombre, String asunto, String cuerpo, int tipo) {
        this.id = id;
        this.nombre = nombre;
        this.asunto = asunto;
        this.cuerpo = cuerpo;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Templates)) {
            return false;
        }
        Templates other = (Templates) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.fcastillo.mail.template.entidades.Templates[ id=" + id + " ]";
    }
    
}
