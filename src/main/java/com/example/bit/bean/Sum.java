package com.example.bit.bean;

import java.math.BigDecimal;

public class Sum {
    private Integer id;

    private BigDecimal buySum;

    private Integer userSum;

    private Integer daySum;

    private BigDecimal rewardSum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getBuySum() {
        return buySum;
    }

    public void setBuySum(BigDecimal buySum) {
        this.buySum = buySum;
    }

    public Integer getUserSum() {
        return userSum;
    }

    public void setUserSum(Integer userSum) {
        this.userSum = userSum;
    }

    public Integer getDaySum() {
        return daySum;
    }

    public void setDaySum(Integer daySum) {
        this.daySum = daySum;
    }

    public BigDecimal getRewardSum() {
        return rewardSum;
    }

    public void setRewardSum(BigDecimal rewardSum) {
        this.rewardSum = rewardSum;
    }
}