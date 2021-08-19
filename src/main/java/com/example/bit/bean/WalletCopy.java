package com.example.bit.bean;

import java.math.BigDecimal;

public class WalletCopy {
    private Long id;

    private Long uid;

    private Integer tokenId;

    private BigDecimal balance;

    private BigDecimal freeze;

    private String address;

    private BigDecimal financial;

    private BigDecimal giving;

    private BigDecimal dongtai;

    private String truelyBalance;

    private String guijiBalance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getFreeze() {
        return freeze;
    }

    public void setFreeze(BigDecimal freeze) {
        this.freeze = freeze;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public BigDecimal getFinancial() {
        return financial;
    }

    public void setFinancial(BigDecimal financial) {
        this.financial = financial;
    }

    public BigDecimal getGiving() {
        return giving;
    }

    public void setGiving(BigDecimal giving) {
        this.giving = giving;
    }

    public BigDecimal getDongtai() {
        return dongtai;
    }

    public void setDongtai(BigDecimal dongtai) {
        this.dongtai = dongtai;
    }

    public String getTruelyBalance() {
        return truelyBalance;
    }

    public void setTruelyBalance(String truelyBalance) {
        this.truelyBalance = truelyBalance == null ? null : truelyBalance.trim();
    }

    public String getGuijiBalance() {
        return guijiBalance;
    }

    public void setGuijiBalance(String guijiBalance) {
        this.guijiBalance = guijiBalance == null ? null : guijiBalance.trim();
    }
}