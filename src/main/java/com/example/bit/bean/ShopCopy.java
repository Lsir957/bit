package com.example.bit.bean;

import java.math.BigDecimal;

public class ShopCopy {
    private Integer id;

    private BigDecimal gold;

    private Integer zs;

    private Integer shopId;

    private Integer luckyId;

    private Integer time;

    private Integer luckyDraw;

    private Boolean status;

    private Integer type;

    private Integer ctime;

    private String name;

    private Integer tokenId;

    private Integer thiszs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getGold() {
        return gold;
    }

    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    public Integer getZs() {
        return zs;
    }

    public void setZs(Integer zs) {
        this.zs = zs;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getLuckyId() {
        return luckyId;
    }

    public void setLuckyId(Integer luckyId) {
        this.luckyId = luckyId;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getLuckyDraw() {
        return luckyDraw;
    }

    public void setLuckyDraw(Integer luckyDraw) {
        this.luckyDraw = luckyDraw;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCtime() {
        return ctime;
    }

    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public Integer getThiszs() {
        return thiszs;
    }

    public void setThiszs(Integer thiszs) {
        this.thiszs = thiszs;
    }
}