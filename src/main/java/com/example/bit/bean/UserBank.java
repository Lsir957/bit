package com.example.bit.bean;

public class UserBank {
    private Integer id;

    private Integer smsid;

    private String bank;

    private String bankname;

    private String usname;

    private String cointype;

    private String bankdis;

    private Integer statu;

    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSmsid() {
        return smsid;
    }

    public void setSmsid(Integer smsid) {
        this.smsid = smsid;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getUsname() {
        return usname;
    }

    public void setUsname(String usname) {
        this.usname = usname == null ? null : usname.trim();
    }

    public String getCointype() {
        return cointype;
    }

    public void setCointype(String cointype) {
        this.cointype = cointype == null ? null : cointype.trim();
    }

    public String getBankdis() {
        return bankdis;
    }

    public void setBankdis(String bankdis) {
        this.bankdis = bankdis == null ? null : bankdis.trim();
    }

    public Integer getStatu() {
        return statu;
    }

    public void setStatu(Integer statu) {
        this.statu = statu;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}