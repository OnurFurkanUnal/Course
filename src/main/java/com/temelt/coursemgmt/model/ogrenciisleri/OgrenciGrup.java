/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.model.ogrenciisleri;

import com.temelt.coursemgmt.model.yonetim.Grup;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author vektorel
 */
public class OgrenciGrup {
    private Long id;
    private Ogrenci ogrenci;
    private Grup grup;
    private BigDecimal ucret;
    private Date kayitTarihi;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Ogrenci getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(Ogrenci ogrenci) {
        this.ogrenci = ogrenci;
    }

    public Grup getGrup() {
        return grup;
    }

    public void setGrup(Grup grup) {
        this.grup = grup;
    }

    public BigDecimal getUcret() {
        return ucret;
    }

    public void setUcret(BigDecimal ucret) {
        this.ucret = ucret;
    }

    public Date getKayitTarihi() {
        return kayitTarihi;
    }

    public void setKayitTarihi(Date kayitTarihi) {
        this.kayitTarihi = kayitTarihi;
    }
    
    
}
