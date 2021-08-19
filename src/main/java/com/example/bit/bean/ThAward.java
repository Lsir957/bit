package com.example.bit.bean;

public class ThAward {
    private Integer id;

    private Integer thLv;

    private String thLvname;

    private Integer thNum;

    private String thZtRate;

    private String thTeamRate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThLv() {
        return thLv;
    }

    public void setThLv(Integer thLv) {
        this.thLv = thLv;
    }

    public String getThLvname() {
        return thLvname;
    }

    public void setThLvname(String thLvname) {
        this.thLvname = thLvname == null ? null : thLvname.trim();
    }

    public Integer getThNum() {
        return thNum;
    }

    public void setThNum(Integer thNum) {
        this.thNum = thNum;
    }

    public String getThZtRate() {
        return thZtRate;
    }

    public void setThZtRate(String thZtRate) {
        this.thZtRate = thZtRate == null ? null : thZtRate.trim();
    }

    public String getThTeamRate() {
        return thTeamRate;
    }

    public void setThTeamRate(String thTeamRate) {
        this.thTeamRate = thTeamRate == null ? null : thTeamRate.trim();
    }
}