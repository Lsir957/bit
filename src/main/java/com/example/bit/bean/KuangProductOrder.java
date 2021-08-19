package com.example.bit.bean;

import java.math.BigDecimal;

public class KuangProductOrder {
    private Integer id;

    private Integer uid;

    private Integer productId;

    private String batchcode;

    private Integer amount;

    private BigDecimal totalPrice;

    private Integer createTime;

    private Integer dayOut;

    private Integer status;

    private Integer endTime;

    private String nextDay;

    private Integer canReduce;

    private Integer reduceTotalDay;

    private Integer isDtAward;

    private Integer isImport;

    private String payType;

    private String coinType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getBatchcode() {
        return batchcode;
    }

    public void setBatchcode(String batchcode) {
        this.batchcode = batchcode == null ? null : batchcode.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getDayOut() {
        return dayOut;
    }

    public void setDayOut(Integer dayOut) {
        this.dayOut = dayOut;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getNextDay() {
        return nextDay;
    }

    public void setNextDay(String nextDay) {
        this.nextDay = nextDay == null ? null : nextDay.trim();
    }

    public Integer getCanReduce() {
        return canReduce;
    }

    public void setCanReduce(Integer canReduce) {
        this.canReduce = canReduce;
    }

    public Integer getReduceTotalDay() {
        return reduceTotalDay;
    }

    public void setReduceTotalDay(Integer reduceTotalDay) {
        this.reduceTotalDay = reduceTotalDay;
    }

    public Integer getIsDtAward() {
        return isDtAward;
    }

    public void setIsDtAward(Integer isDtAward) {
        this.isDtAward = isDtAward;
    }

    public Integer getIsImport() {
        return isImport;
    }

    public void setIsImport(Integer isImport) {
        this.isImport = isImport;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType == null ? null : payType.trim();
    }

    public String getCoinType() {
        return coinType;
    }

    public void setCoinType(String coinType) {
        this.coinType = coinType == null ? null : coinType.trim();
    }
}