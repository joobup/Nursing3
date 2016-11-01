package com.idea.nursing.servicemodule.web.domain.pojo;

import java.util.Date;

public class ServicePack {
    private Long id;

    private String serveBrief; //服务简介

    private String serveName; //服务名称

    private String serveCare;//注意事项

    private Long serveDetailed;//详情

    private Byte servrRebate;//折扣

    private Date serveEnddate;//有效时间

    private String serveServes;//服务项

    private Long serveNurseify;//护理级别

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