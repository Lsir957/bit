package com.example.bit.bean;

import java.math.BigDecimal;

public class GeoProducts {
    private Integer id;

    private String title;

    private String titleEn;

    private Integer day;

    private BigDecimal dayOut;

    private BigDecimal buyPrice;

    private BigDecimal usdtPrice;

    private BigDecimal bedPrice;

    private Integer maxKucun;

    private Integer status;

    private Integer isShow;

    private Integer payType;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn == null ? null : titleEn.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public BigDecimal getDayOut() {
        return dayOut;
    }

    public void setDayOut(BigDecimal dayOut) {
        this.dayOut = dayOut;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(BigDecimal buyPrice) {
        this.buyPrice = buyPrice;
    }

    public BigDecimal getUsdtPrice() {
        return usdtPrice;
    }

    public void setUsdtPrice(BigDecimal usdtPrice) {
        this.usdtPrice = usdtPrice;
    }

    public BigDecimal getBedPrice() {
        return bedPrice;
    }

    public void setBedPrice(BigDecimal bedPrice) {
        this.bedPrice = bedPrice;
    }

    public Integer getMaxKucun() {
        return maxKucun;
    }

    public void setMaxKucun(Integer maxKucun) {
        this.maxKucun = maxKucun;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}