package com.example.bit.bean;

public class MiniUsersWithBLOBs extends MiniUsers {
    private String codeImg;

    private String gflag;

    public String getCodeImg() {
        return codeImg;
    }

    public void setCodeImg(String codeImg) {
        this.codeImg = codeImg == null ? null : codeImg.trim();
    }

    public String getGflag() {
        return gflag;
    }

    public void setGflag(String gflag) {
        this.gflag = gflag == null ? null : gflag.trim();
    }
}