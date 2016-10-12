package com.idea.nursing.servicemodule.web.domain.pojo;

import java.util.Date;

public class ServicePack {
    private Long id;

    private String serveBrief;

    private String serveName;

    private String serveCare;

    private Long serveDetailed;

    private Byte servrRebate;

    private Date serveEnddate;

    private String serveServes;

    private Long serveNurseify;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServeBrief() {
        return serveBrief;
    }

    public void setServeBrief(String serveBrief) {
        this.serveBrief = serveBrief == null ? null : serveBrief.trim();
    }

    public String getServeName() {
        return serveName;
    }

    public void setServeName(String serveName) {
        this.serveName = serveName == null ? null : serveName.trim();
    }

    public String getServeCare() {
        return serveCare;
    }

    public void setServeCare(String serveCare) {
        this.serveCare = serveCare == null ? null : serveCare.trim();
    }

    public Long getServeDetailed() {
        return serveDetailed;
    }

    public void setServeDetailed(Long serveDetailed) {
        this.serveDetailed = serveDetailed;
    }

    public Byte getServrRebate() {
        return servrRebate;
    }

    public void setServrRebate(Byte servrRebate) {
        this.servrRebate = servrRebate;
    }

    public Date getServeEnddate() {
        return serveEnddate;
    }

    public void setServeEnddate(Date serveEnddate) {
        this.serveEnddate = serveEnddate;
    }

    public String getServeServes() {
        return serveServes;
    }

    public void setServeServes(String serveServes) {
        this.serveServes = serveServes == null ? null : serveServes.trim();
    }

    public Long getServeNurseify() {
        return serveNurseify;
    }

    public void setServeNurseify(Long serveNurseify) {
        this.serveNurseify = serveNurseify;
    }
}