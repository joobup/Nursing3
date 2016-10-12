package com.idea.nursing.servicemodule.web.domain.pojo;

public class Services {
    private Long id;

    private Long serveClassify;

    private String serveName;

    private String serveBiref;

    private String serveLimit;

    private Integer servePeoples;

    private Long agencyId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServeClassify() {
        return serveClassify;
    }

    public void setServeClassify(Long serveClassify) {
        this.serveClassify = serveClassify;
    }

    public String getServeName() {
        return serveName;
    }

    public void setServeName(String serveName) {
        this.serveName = serveName == null ? null : serveName.trim();
    }

    public String getServeBiref() {
        return serveBiref;
    }

    public void setServeBiref(String serveBiref) {
        this.serveBiref = serveBiref == null ? null : serveBiref.trim();
    }

    public String getServeLimit() {
        return serveLimit;
    }

    public void setServeLimit(String serveLimit) {
        this.serveLimit = serveLimit == null ? null : serveLimit.trim();
    }

    public Integer getServePeoples() {
        return servePeoples;
    }

    public void setServePeoples(Integer servePeoples) {
        this.servePeoples = servePeoples;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }
}