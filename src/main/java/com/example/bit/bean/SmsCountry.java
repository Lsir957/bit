package com.example.bit.bean;

public class SmsCountry {
    private Integer id;

    private String iso;

    private String iso3;

    private String name;

    private String nameZh;

    private String nicename;

    private Short numcode;

    private Integer phonecode;

    private Integer status;

    private String coinname;

    private String conincode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso == null ? null : iso.trim();
    }

    public String getIso3() {
        return iso3;
    }

    public void setIso3(String iso3) {
        this.iso3 = iso3 == null ? null : iso3.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh == null ? null : nameZh.trim();
    }

    public String getNicename() {
        return nicename;
    }

    public void setNicename(String nicename) {
        this.nicename = nicename == null ? null : nicename.trim();
    }

    public Short getNumcode() {
        return numcode;
    }

    public void setNumcode(Short numcode) {
        this.numcode = numcode;
    }

    public Integer getPhonecode() {
        return phonecode;
    }

    public void setPhonecode(Integer phonecode) {
        this.phonecode = phonecode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCoinname() {
        return coinname;
    }

    public void setCoinname(String coinname) {
        this.coinname = coinname == null ? null : coinname.trim();
    }

    public String getConincode() {
        return conincode;
    }

    public void setConincode(String conincode) {
        this.conincode = conincode == null ? null : conincode.trim();
    }
}