package com.idea.nursing.fixedassets.web.domain.pojo;

public class FixedAssetsType {
    private Long id;

    private String fixedAssetsTypeName;

    private Byte fixedAssetsTypeLevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFixedAssetsTypeName() {
        return fixedAssetsTypeName;
    }

    public void setFixedAssetsTypeName(String fixedAssetsTypeName) {
        this.fixedAssetsTypeName = fixedAssetsTypeName == null ? null : fixedAssetsTypeName.trim();
    }

    public Byte getFixedAssetsTypeLevel() {
        return fixedAssetsTypeLevel;
    }

    public void setFixedAssetsTypeLevel(Byte fixedAssetsTypeLevel) {
        this.fixedAssetsTypeLevel = fixedAssetsTypeLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}