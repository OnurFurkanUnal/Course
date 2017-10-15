/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.service.muhasebe;

import com.temelt.coursemgmt.model.muhasebe.Gider;
import com.temelt.coursemgmt.util.IService;
import java.util.List;

/**
 *
 * @author vektorel
 */
public class GiderService implements IService<Gider>{

    @Override
    public Gider save(Gider entity) {
        return (Gider) baseService.save(entity);
    }

    @Override
    public Gider update(Gider entity) {
         return (Gider) baseService.update(entity);
    }

    @Override
    public Boolean delete(Gider entity) {
         return  baseService.delete(entity);
    }

    @Override
    public List<Gider> getAll() {
        return baseService.getAll(Gider.class);
    }
    
}
