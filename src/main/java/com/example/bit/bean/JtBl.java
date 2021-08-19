package com.example.bit.bean;

import java.math.BigDecimal;

public class JtBl {
    private Integer id;

    private BigDecimal freeze;

    private BigDecimal hqSl;

    private Boolean status;

    private Integer tokenId;

    private Integer day;

    private BigDecimal zzSxf;

    private String title;

    private Integer type;

    private BigDecimal sl;

    private BigDecimal max;

    private BigDecimal buyNum;

    private BigDecimal buyMini;

    private BigDecimal buyMax;

    private BigDecimal ftMini;

    private Integer kaiguan;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getFreeze() {
        return freeze;
    }

    public void setFreeze(BigDecimal freeze) {
        this.freeze = freeze;
    }

    public BigDecimal getHqSl() {
        return hqSl;
    }

    public void setHqSl(BigDecimal hqSl) {
        this.hqSl = hqSl;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public BigDecimal getZzSxf() {
        return zzSxf;
    }

    public void setZzSxf(BigDecimal zzSxf) {
        this.zzSxf = zzSxf;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public BigDecimal getSl() {
        return sl;
    }

    public void setSl(BigDecimal sl) {
        this.sl = sl;
    }

    public BigDecimal getMax() {
        return max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(BigDecimal buyNum) {
        this.buyNum = buyNum;
    }

    public BigDecimal getBuyMini() {
        return buyMini;
    }

    public void setBuyMini(BigDecimal buyMini) {
        this.buyMini = buyMini;
    }

    public BigDecimal getBuyMax() {
        return buyMax;
    }

    public void setBuyMax(BigDecimal buyMax) {
        this.buyMax = buyMax;
    }

    public BigDecimal getFtMini() {
        return ftMini;
    }

    public void setFtMini(BigDecimal ftMini) {
        this.ftMini = ftMini;
    }

    public Integer getKaiguan() {
        return kaiguan;
    }

    public void setKaiguan(Integer kaiguan) {
        this.kaiguan = kaiguan;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}