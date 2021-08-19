package com.example.bit.bean;

public class KuangCate {
    private Integer id;

    private String name;

    private String nameEn;

    private String coverPath;

    private Integer pid;

    private Integer sort;

    private String listsTpl;

    private String detailTpl;

    private Byte status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    public String getCoverPath() {
        return coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath == null ? null : coverPath.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getListsTpl() {
        return listsTpl;
    }

    public void setListsTpl(String listsTpl) {
        this.listsTpl = listsTpl == null ? null : listsTpl.trim();
    }

    public String getDetailTpl() {
        return detailTpl;
    }

    public void setDetailTpl(String detailTpl) {
        this.detailTpl = detailTpl == null ? null : detailTpl.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}