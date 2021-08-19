package com.example.bit.bean;

import java.math.BigDecimal;
import java.util.List;

public class MiniUsers {
    private Long id;

    private String uuid;

    private String username;

    private String name;

    private String orgPwd;

    private String password;

    private String nickname;

    private String email;

    private String mobile;

    private Integer regdate;

    private String loginip;

    private String salt;

    private Byte status;

    private Integer refer;

    private String referMobile;

    private Integer lastLogin;

    private String wechatOpenid;

    private BigDecimal gold;

    private String ipaddress;

    private String card;

    private Integer incode;

    private BigDecimal yeji;

    private Boolean lv;

    private BigDecimal freeze;

    private BigDecimal oldnum;

    private Integer cash;

    private String tree;

    private Integer paytime;

    private String paypwd;

    private String tree2;

    private String tdrs;

    private Integer ztrs;

    private Boolean djStatus;

    private Boolean maxLv;

    private Integer avatar;

    private BigDecimal yeji2;

    private String refer2;

    private String gespwd;

    private Integer isHtVip;

    private BigDecimal storePoints;

    private Integer pid;

    private Integer p2Id;

    private Integer p3Id;

    private Integer p4Id;

    private Integer p5Id;

    private Float usdtNum;

    private String bedNum;

    private String immtNum;

    private Integer thAwardLv;

    private Integer awardLv;

    private String dtAwardDay;

    private Integer tbNum;

    private String buyTbDay;

    private Integer thNum;

    private String bedAwardDay;

    private String bedDtAwardDay;

    private Integer immtAwardSwitch;

    private BigDecimal bed366Num;

    private BigDecimal bed181Num;

    private Integer tibiSwitch;

    private BigDecimal syBei;


//建立一个用户多条记录
    private List<AdmTheLog> admTheLogs;

    public List<AdmTheLog> getAdmTheLogs() {
        return admTheLogs;
    }

    public void setAdmTheLogs(List<AdmTheLog> admTheLogs) {
        this.admTheLogs = admTheLogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getOrgPwd() {
        return orgPwd;
    }

    public void setOrgPwd(String orgPwd) {
        this.orgPwd = orgPwd == null ? null : orgPwd.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getRegdate() {
        return regdate;
    }

    public void setRegdate(Integer regdate) {
        this.regdate = regdate;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getRefer() {
        return refer;
    }

    public void setRefer(Integer refer) {
        this.refer = refer;
    }

    public String getReferMobile() {
        return referMobile;
    }

    public void setReferMobile(String referMobile) {
        this.referMobile = referMobile == null ? null : referMobile.trim();
    }

    public Integer getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Integer lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getWechatOpenid() {
        return wechatOpenid;
    }

    public void setWechatOpenid(String wechatOpenid) {
        this.wechatOpenid = wechatOpenid == null ? null : wechatOpenid.trim();
    }

    public BigDecimal getGold() {
        return gold;
    }

    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress == null ? null : ipaddress.trim();
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public Integer getIncode() {
        return incode;
    }

    public void setIncode(Integer incode) {
        this.incode = incode;
    }

    public BigDecimal getYeji() {
        return yeji;
    }

    public void setYeji(BigDecimal yeji) {
        this.yeji = yeji;
    }

    public Boolean getLv() {
        return lv;
    }

    public void setLv(Boolean lv) {
        this.lv = lv;
    }

    public BigDecimal getFreeze() {
        return freeze;
    }

    public void setFreeze(BigDecimal freeze) {
        this.freeze = freeze;
    }

    public BigDecimal getOldnum() {
        return oldnum;
    }

    public void setOldnum(BigDecimal oldnum) {
        this.oldnum = oldnum;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    public String getTree() {
        return tree;
    }

    public void setTree(String tree) {
        this.tree = tree == null ? null : tree.trim();
    }

    public Integer getPaytime() {
        return paytime;
    }

    public void setPaytime(Integer paytime) {
        this.paytime = paytime;
    }

    public String getPaypwd() {
        return paypwd;
    }

    public void setPaypwd(String paypwd) {
        this.paypwd = paypwd == null ? null : paypwd.trim();
    }

    public String getTree2() {
        return tree2;
    }

    public void setTree2(String tree2) {
        this.tree2 = tree2 == null ? null : tree2.trim();
    }

    public String getTdrs() {
        return tdrs;
    }

    public void setTdrs(String tdrs) {
        this.tdrs = tdrs == null ? null : tdrs.trim();
    }

    public Integer getZtrs() {
        return ztrs;
    }

    public void setZtrs(Integer ztrs) {
        this.ztrs = ztrs;
    }

    public Boolean getDjStatus() {
        return djStatus;
    }

    public void setDjStatus(Boolean djStatus) {
        this.djStatus = djStatus;
    }

    public Boolean getMaxLv() {
        return maxLv;
    }

    public void setMaxLv(Boolean maxLv) {
        this.maxLv = maxLv;
    }

    public Integer getAvatar() {
        return avatar;
    }

    public void setAvatar(Integer avatar) {
        this.avatar = avatar;
    }

    public BigDecimal getYeji2() {
        return yeji2;
    }

    public void setYeji2(BigDecimal yeji2) {
        this.yeji2 = yeji2;
    }

    public String getRefer2() {
        return refer2;
    }

    public void setRefer2(String refer2) {
        this.refer2 = refer2 == null ? null : refer2.trim();
    }

    public String getGespwd() {
        return gespwd;
    }

    public void setGespwd(String gespwd) {
        this.gespwd = gespwd == null ? null : gespwd.trim();
    }

    public Integer getIsHtVip() {
        return isHtVip;
    }

    public void setIsHtVip(Integer isHtVip) {
        this.isHtVip = isHtVip;
    }

    public BigDecimal getStorePoints() {
        return storePoints;
    }

    public void setStorePoints(BigDecimal storePoints) {
        this.storePoints = storePoints;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getP2Id() {
        return p2Id;
    }

    public void setP2Id(Integer p2Id) {
        this.p2Id = p2Id;
    }

    public Integer getP3Id() {
        return p3Id;
    }

    public void setP3Id(Integer p3Id) {
        this.p3Id = p3Id;
    }

    public Integer getP4Id() {
        return p4Id;
    }

    public void setP4Id(Integer p4Id) {
        this.p4Id = p4Id;
    }

    public Integer getP5Id() {
        return p5Id;
    }

    public void setP5Id(Integer p5Id) {
        this.p5Id = p5Id;
    }

    public Float getUsdtNum() {
        return usdtNum;
    }

    public void setUsdtNum(Float usdtNum) {
        this.usdtNum = usdtNum;
    }

    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum == null ? null : bedNum.trim();
    }

    public String getImmtNum() {
        return immtNum;
    }

    public void setImmtNum(String immtNum) {
        this.immtNum = immtNum == null ? null : immtNum.trim();
    }

    public Integer getThAwardLv() {
        return thAwardLv;
    }

    public void setThAwardLv(Integer thAwardLv) {
        this.thAwardLv = thAwardLv;
    }

    public Integer getAwardLv() {
        return awardLv;
    }

    public void setAwardLv(Integer awardLv) {
        this.awardLv = awardLv;
    }

    public String getDtAwardDay() {
        return dtAwardDay;
    }

    public void setDtAwardDay(String dtAwardDay) {
        this.dtAwardDay = dtAwardDay == null ? null : dtAwardDay.trim();
    }

    public Integer getTbNum() {
        return tbNum;
    }

    public void setTbNum(Integer tbNum) {
        this.tbNum = tbNum;
    }

    public String getBuyTbDay() {
        return buyTbDay;
    }

    public void setBuyTbDay(String buyTbDay) {
        this.buyTbDay = buyTbDay == null ? null : buyTbDay.trim();
    }

    public Integer getThNum() {
        return thNum;
    }

    public void setThNum(Integer thNum) {
        this.thNum = thNum;
    }

    public String getBedAwardDay() {
        return bedAwardDay;
    }

    public void setBedAwardDay(String bedAwardDay) {
        this.bedAwardDay = bedAwardDay == null ? null : bedAwardDay.trim();
    }

    public String getBedDtAwardDay() {
        return bedDtAwardDay;
    }

    public void setBedDtAwardDay(String bedDtAwardDay) {
        this.bedDtAwardDay = bedDtAwardDay == null ? null : bedDtAwardDay.trim();
    }

    public Integer getImmtAwardSwitch() {
        return immtAwardSwitch;
    }

    public void setImmtAwardSwitch(Integer immtAwardSwitch) {
        this.immtAwardSwitch = immtAwardSwitch;
    }

    public BigDecimal getBed366Num() {
        return bed366Num;
    }

    public void setBed366Num(BigDecimal bed366Num) {
        this.bed366Num = bed366Num;
    }

    public BigDecimal getBed181Num() {
        return bed181Num;
    }

    public void setBed181Num(BigDecimal bed181Num) {
        this.bed181Num = bed181Num;
    }

    public Integer getTibiSwitch() {
        return tibiSwitch;
    }

    public void setTibiSwitch(Integer tibiSwitch) {
        this.tibiSwitch = tibiSwitch;
    }

    public BigDecimal getSyBei() {
        return syBei;
    }

    public void setSyBei(BigDecimal syBei) {
        this.syBei = syBei;
    }
}