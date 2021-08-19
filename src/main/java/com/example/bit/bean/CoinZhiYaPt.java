package com.example.bit.bean;

import java.util.Date;

public class CoinZhiYaPt {
    private Integer id;

    private Integer qishuId;

    private Integer totalNum;

    private Integer leaveNum;

    private Date endTimeS;

    private Date createTimeS;

    private Integer status;

    private Integer day;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQishuId() {
        return qishuId;
    }

    public void setQishuId(Integer qishuId) {
        this.qishuId = qishuId;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getLeaveNum() {
        return leaveNum;
    }

    public void setLeaveNum(Integer leaveNum) {
        this.leaveNum = leaveNum;
    }

    public Date getEndTimeS() {
        return endTimeS;
    }

    public void setEndTimeS(Date endTimeS) {
        this.endTimeS = endTimeS;
    }

    public Date getCreateTimeS() {
        return createTimeS;
    }

    public void setCreateTimeS(Date createTimeS) {
        this.createTimeS = createTimeS;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}