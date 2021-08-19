package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.Date;

public class WalletHistory {
    private Long id;

    private Long uid;

    private Byte income;

    private BigDecimal number;

    private Integer tokenId;

    private Byte operate;

    private String from;

    private String to;

    private Long blockHeight;

    private BigDecimal fee;

    private BigDecimal sfee;

    private String tx;

    private Date updateTime;

    private Date createTime;

    private String remark;

    private Byte status;

    private Integer isvalid;

    private Integer isTrc20;

    private Integer isShow;

    private Integer isGj;

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

    public Byte getIncome() {
        return income;
    }

    public void setIncome(Byte income) {
        this.income = income;
    }

    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public Byte getOperate() {
        return operate;
    }

    public void setOperate(Byte operate) {
        this.operate = operate;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to == null ? null : to.trim();
    }

    public Long getBlockHeight() {
        return blockHeight;
    }

    public void setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getSfee() {
        return sfee;
    }

    public void setSfee(BigDecimal sfee) {
        this.sfee = sfee;
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        this.tx = tx == null ? null : tx.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(Integer isvalid) {
        this.isvalid = isvalid;
    }

    public Integer getIsTrc20() {
        return isTrc20;
    }

    public void setIsTrc20(Integer isTrc20) {
        this.isTrc20 = isTrc20;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getIsGj() {
        return isGj;
    }

    public void setIsGj(Integer isGj) {
        this.isGj = isGj;
    }
}