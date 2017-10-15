/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.muhasebe;

import com.temelt.coursemgmt.model.muhasebe.Gelir;
import com.temelt.coursemgmt.util.IService;
import java.util.List;


/**
 *
 * @author vektorel
 */
public class GelirService implements IService<Gelir>{

    @Override
    public Gelir save(Gelir entity) {
     return (Gelir) baseService.save(entity);
    }

    @Override
    public Gelir update(Gelir entity) {
        return (Gelir) baseService.update(entity);
    }

    @Override
    public Boolean delete(Gelir entity) {
       return  baseService.delete(entity);
    }

    @Override
    public List<Gelir> getAll() {
        return baseService.getAll(Gelir.class);
    }
    
}
