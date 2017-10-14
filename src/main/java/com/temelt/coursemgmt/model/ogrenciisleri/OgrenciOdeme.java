/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.model.ogrenciisleri;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author vektorel
 */
public class OgrenciOdeme {
    private Long id;
    private String aciklama;
    private BigDecimal odemeMiktari;
    private Ogrenci ogrenci;
    private Date odemeTarihi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public BigDecimal getOdemeMiktari() {
        return odemeMiktari;
    }

    public void setOdemeMiktari(BigDecimal odemeMiktari) {
        this.odemeMiktari = odemeMiktari;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public Date getOdemeTarihi() {
        return odemeTarihi;
    }

    public void setOdemeTarihi(Date odemeTarihi) {
        this.odemeTarihi = odemeTarihi;
    }
    
    
}
