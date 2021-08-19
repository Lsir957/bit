package com.example.bit.bean;

import java.math.BigDecimal;

public class Vip {
    private Integer id;

    private Integer zsl;

    private BigDecimal freeze;

    private Integer tdrs;

    private Integer ds;

    private Integer sxlv;

    private Byte lv;

    private String nameEn;

    private String name;

    private Integer zt;

    private String lvimg1;

    private String lvimg2;

    private BigDecimal biliJd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getZsl() {
        return zsl;
    }

    public void setZsl(Integer zsl) {
        this.zsl = zsl;
    }

    public BigDecimal getFreeze() {
        return freeze;
    }

    public void setFreeze(BigDecimal freeze) {
        this.freeze = freeze;
    }

    public Integer getTdrs() {
        return tdrs;
    }

    public void setTdrs(Integer tdrs) {
        this.tdrs = tdrs;
    }

    public Integer getDs() {
        return ds;
    }

    public void setDs(Integer ds) {
        this.ds = ds;
    }

    public Integer getSxlv() {
        return sxlv;
    }

    public void setSxlv(Integer sxlv) {
        this.sxlv = sxlv;
    }

    public Byte getLv() {
        return lv;
    }

    public void setLv(Byte lv) {
        this.lv = lv;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public String getLvimg1() {
        return lvimg1;
    }

    public void setLvimg1(String lvimg1) {
        this.lvimg1 = lvimg1 == null ? null : lvimg1.trim();
    }

    public String getLvimg2() {
        return lvimg2;
    }

    public void setLvimg2(String lvimg2) {
        this.lvimg2 = lvimg2 == null ? null : lvimg2.trim();
    }

    public BigDecimal getBiliJd() {
        return biliJd;
    }

    public void setBiliJd(BigDecimal biliJd) {
        this.biliJd = biliJd;
    }
}