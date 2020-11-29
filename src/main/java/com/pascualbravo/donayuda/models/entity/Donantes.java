package com.pascualbravo.donayuda.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_donantes")
public class Donantes {
    @Id
    @Column(name="Identificacion")   
    private int iden;
    
    @Column(name="nombre_dona")
    private String nombre;
    
    @Column(name="telefono_donan")
            private int tel;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="Id_donacion")
          private TipoDonacion id_donancion;

    /**
     * @return the iden
     */
    public int getIden() {
        return iden;
    }

    /**
     * @param iden the iden to set
     */
    public void setIden(int iden) {
        this.iden = iden;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tel
     */
    public int getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

    /**
     * @return the id_donancion
     */
    public TipoDonacion getId_donancion() {
        return id_donancion;
    }

    /**
     * @param id_donancion the id_donancion to set
     */
    public void setId_donancion(TipoDonacion id_donancion) {
        this.id_donancion = id_donancion;
    }
  
}
