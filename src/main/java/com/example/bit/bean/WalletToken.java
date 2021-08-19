package com.example.bit.bean;

import java.math.BigDecimal;

public class WalletToken {
    private Integer id;

    private String titleEn;

    private String titleZh;

    private String logo;

    private BigDecimal fee;

    private String contract;

    private Byte isShow;

    private Long height;

    private Integer status;

    private BigDecimal price;

    private BigDecimal txmini;

    private BigDecimal txsxf;

    private BigDecimal zdf;

    private BigDecimal sdSxf;

    private BigDecimal txmax;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn == null ? null : titleEn.trim();
    }

    public String getTitleZh() {
        return titleZh;
    }

    public void setTitleZh(String titleZh) {
        this.titleZh = titleZh == null ? null : titleZh.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract == null ? null : contract.trim();
    }

    public Byte getIsShow() {
        return isShow;
    }

    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTxmini() {
        return txmini;
    }

    public void setTxmini(BigDecimal txmini) {
        this.txmini = txmini;
    }

    public BigDecimal getTxsxf() {
        return txsxf;
    }

    public void setTxsxf(BigDecimal txsxf) {
        this.txsxf = txsxf;
    }

    public BigDecimal getZdf() {
        return zdf;
    }

    public void setZdf(BigDecimal zdf) {
        this.zdf = zdf;
    }

    public BigDecimal getSdSxf() {
        return sdSxf;
    }

    public void setSdSxf(BigDecimal sdSxf) {
        this.sdSxf = sdSxf;
    }

    public BigDecimal getTxmax() {
        return txmax;
    }

    public void setTxmax(BigDecimal txmax) {
        this.txmax = txmax;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}