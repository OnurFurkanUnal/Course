/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt;

import com.temelt.coursemgmt.gui.kullanici.frmLogin;
import com.temelt.coursemgmt.gui.muhasebe.frmMuhasebe;
import com.temelt.coursemgmt.model.muhasebe.Gelir;
import com.temelt.coursemgmt.model.ogrenciisleri.Ogrenci;
import com.temelt.coursemgmt.model.ogrenciisleri.OgrenciOdeme;
import com.temelt.coursemgmt.service.muhasebe.GelirService;
import com.temelt.coursemgmt.service.ogrenciisleri.OgrenciGrupService;
import com.temelt.coursemgmt.service.ogrenciisleri.OgrenciOdemeService;
import com.temelt.coursemgmt.service.ogrenciisleri.OgrenciService;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author vektorel
 */
public class Runner {
    public static void main(String[] args) {
        frmLogin login=new frmLogin(null, true);
        login.setLocationRelativeTo(null);
        login.show();
    
        
        
    }
}
