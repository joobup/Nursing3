package com.idea.nursing.fixedassets.web.domain.pojo;

import java.util.Date;

public class FixedAssets {
    private Long id;

    private String fixedAssetsName;

    private Long fixedAssetsTypeId;

    private Byte fixedAssetsState;

    private Date fixedAssetsDate;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFixedAssetsName() {
        return fixedAssetsName;
    }

    public void setFixedAssetsName(String fixedAssetsName) {
        this.fixedAssetsName = fixedAssetsName == null ? null : fixedAssetsName.trim();
    }

    public Long getFixedAssetsTypeId() {
        return fixedAssetsTypeId;
    }

    public void setFixedAssetsTypeId(Long fixedAssetsTypeId) {
        this.fixedAssetsTypeId = fixedAssetsTypeId;
    }

    public Byte getFixedAssetsState() {
        return fixedAssetsState;
    }

    public void setFixedAssetsState(Byte fixedAssetsState) {
        this.fixedAssetsState = fixedAssetsState;
    }

    public Date getFixedAssetsDate() {
        return fixedAssetsDate;
    }

    public void setFixedAssetsDate(Date fixedAssetsDate) {
        this.fixedAssetsDate = fixedAssetsDate;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}