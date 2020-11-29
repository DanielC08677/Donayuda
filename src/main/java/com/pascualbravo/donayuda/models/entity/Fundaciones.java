package com.pascualbravo.donayuda.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_fundaciones")

public class Fundaciones {
    
    @Id
    @Column(name="Identificacion")
    private int idIdentificacion;
    
    @Column(name="nombre_funda")
    private String nombreFundacion;
    
    @Column(name="proposito")
    private String proposito;
    
    @Column(name="Direccion")
    private String direccion;
    
    @Column(name="telefono")
    private int telefo;

    /**
     * @return the idIdentificacion
     */
    public int getIdIdentificacion() {
        return idIdentificacion;
    }

    /**
     * @param idIdentificacion the idIdentificacion to set
     */
    public void setIdIdentificacion(int idIdentificacion) {
        this.idIdentificacion = idIdentificacion;
    }

    /**
     * @return the nombreFundacion
     */
    public String getNombreFundacion() {
        return nombreFundacion;
    }

    /**
     * @param nombreFundacion the nombreFundacion to set
     */
    public void setNombreFundacion(String nombreFundacion) {
        this.nombreFundacion = nombreFundacion;
    }

    /**
     * @return the proposito
     */
    public String getProposito() {
        return proposito;
    }

    /**
     * @param proposito the proposito to set
     */
    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefo
     */
    public int getTelefo() {
        return telefo;
    }

    /**
     * @param telefo the telefo to set
     */
    public void setTelefo(int telefo) {
        this.telefo = telefo;
    }

 
}