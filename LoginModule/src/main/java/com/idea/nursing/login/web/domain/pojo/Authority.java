package com.idea.nursing.login.web.domain.pojo;

public class Authority {
    private Long id;

    private String rmsName;

    private String rmsIcon;

    private Byte rmsLevel;

    private Long rmsSuperiorId;

    private String rmsUrl;

    private Byte rmsType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRmsName() {
        return rmsName;
    }

    public void setRmsName(String rmsName) {
        this.rmsName = rmsName == null ? null : rmsName.trim();
    }

    public String getRmsIcon() {
        return rmsIcon;
    }

    public void setRmsIcon(String rmsIcon) {
        this.rmsIcon = rmsIcon == null ? null : rmsIcon.trim();
    }

    public Byte getRmsLevel() {
        return rmsLevel;
    }

    public void setRmsLevel(Byte rmsLevel) {
        this.rmsLevel = rmsLevel;
    }

    public Long getRmsSuperiorId() {
        return rmsSuperiorId;
    }

    public void setRmsSuperiorId(Long rmsSuperiorId) {
        this.rmsSuperiorId = rmsSuperiorId;
    }

    public String getRmsUrl() {
        return rmsUrl;
    }

    public void setRmsUrl(String rmsUrl) {
        this.rmsUrl = rmsUrl == null ? null : rmsUrl.trim();
    }

    public Byte getRmsType() {
        return rmsType;
    }

    public void setRmsType(Byte rmsType) {
        this.rmsType = rmsType;
    }
}