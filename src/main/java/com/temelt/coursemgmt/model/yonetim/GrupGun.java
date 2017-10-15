/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.temelt.coursemgmt.model.yonetim;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vektorel
 */
@Entity
@Table(name = "group_day")
public class GrupGun {

    private Long id;
    private Grup grup;
    private int gun;

    @Id
    @SequenceGenerator(name = "seq_group_day", allocationSize = 1, sequenceName = "seq_group_day")
    @GeneratedValue(generator = "seq_group_day", strategy = GenerationType.SEQUENCE)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "group_id")
    public Grup getGrup() {
        return grup;
    }

    public void setGrup(Grup grup) {
        this.grup = grup;
    }

    @Column(name = "day_of_week")
    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

}
