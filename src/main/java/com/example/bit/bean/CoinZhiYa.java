package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.Date;

public class CoinZhiYa {
    private Integer id;

    private Integer uid;

    private String title;

    private String coinName;

    private Integer qishuId;

    private Date createTimeS;

    private Integer createTime;

    private Date endTimeS;

    private Integer endTime;

    private Integer limitDay;

    private String nextDay;

    private BigDecimal total;

    private BigDecimal leaveNum;

    private BigDecimal amount;

    private Integer status;

    private Integer type;

    private Integer outDay;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName == null ? null : coinName.trim();
    }

    public Integer getQishuId() {
        return qishuId;
    }

    public void setQishuId(Integer qishuId) {
        this.qishuId = qishuId;
    }

    public Date getCreateTimeS() {
        return createTimeS;
    }

    public void setCreateTimeS(Date createTimeS) {
        this.createTimeS = createTimeS;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Date getEndTimeS() {
        return endTimeS;
    }

    public void setEndTimeS(Date endTimeS) {
        this.endTimeS = endTimeS;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getLimitDay() {
        return limitDay;
    }

    public void setLimitDay(Integer limitDay) {
        this.limitDay = limitDay;
    }

    public String getNextDay() {
        return nextDay;
    }

    public void setNextDay(String nextDay) {
        this.nextDay = nextDay == null ? null : nextDay.trim();
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public BigDecimal getLeaveNum() {
        return leaveNum;
    }

    public void setLeaveNum(BigDecimal leaveNum) {
        this.leaveNum = leaveNum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getOutDay() {
        return outDay;
    }

    public void setOutDay(Integer outDay) {
        this.outDay = outDay;
    }
}