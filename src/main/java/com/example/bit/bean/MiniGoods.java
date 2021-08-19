package com.example.bit.bean;

import java.math.BigDecimal;

public class MiniGoods {
    private Integer id;

    private Integer uid;

    private String uuid;

    private String name;

    private Integer num;

    private BigDecimal price;

    private String standard;

    private String coverPath;

    private String photoPath1;

    private String photoPath2;

    private String photoPath3;

    private Integer clickCount;

    private Byte status;

    private Byte isBest;

    private Byte isNew;

    private Byte isHot;

    private Integer sellNum;

    private Integer createtime;

    private Byte scoreNum;

    private Integer score;

    private BigDecimal yhui;

    private BigDecimal zhui;

    private BigDecimal score2;

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

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath == null ? null : coverPath.trim();
    }

    public String getPhotoPath1() {
        return photoPath1;
    }

    public void setPhotoPath1(String photoPath1) {
        this.photoPath1 = photoPath1 == null ? null : photoPath1.trim();
    }

    public String getPhotoPath2() {
        return photoPath2;
    }

    public void setPhotoPath2(String photoPath2) {
        this.photoPath2 = photoPath2 == null ? null : photoPath2.trim();
    }

    public String getPhotoPath3() {
        return photoPath3;
    }

    public void setPhotoPath3(String photoPath3) {
        this.photoPath3 = photoPath3 == null ? null : photoPath3.trim();
    }

    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getIsBest() {
        return isBest;
    }

    public void setIsBest(Byte isBest) {
        this.isBest = isBest;
    }

    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public Integer getSellNum() {
        return sellNum;
    }

    public void setSellNum(Integer sellNum) {
        this.sellNum = sellNum;
    }

    public Integer getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }

    public Byte getScoreNum() {
        return scoreNum;
    }

    public void setScoreNum(Byte scoreNum) {
        this.scoreNum = scoreNum;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public BigDecimal getYhui() {
        return yhui;
    }

    public void setYhui(BigDecimal yhui) {
        this.yhui = yhui;
    }

    public BigDecimal getZhui() {
        return zhui;
    }

    public void setZhui(BigDecimal zhui) {
        this.zhui = zhui;
    }

    public BigDecimal getScore2() {
        return score2;
    }

    public void setScore2(BigDecimal score2) {
        this.score2 = score2;
    }
}