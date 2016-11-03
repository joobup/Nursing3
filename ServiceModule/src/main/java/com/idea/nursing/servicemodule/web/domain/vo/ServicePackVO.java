package com.idea.nursing.servicemodule.web.domain.vo;

import com.idea.nursing.common.web.domain.pojo.CommentRichText;
import com.idea.nursing.servicemodule.web.domain.pojo.Nurseify;
import com.idea.nursing.servicemodule.web.domain.pojo.Services;

import java.util.Date;
import java.util.List;

/**
 * Created by 10238 on 2016/10/27.
 */
public class ServicePackVO {

    private Long id;

    private String serveBrief;

    private String serveName;

    private String serveCare;

    private CommentRichText serveDetailed;

    private Byte servrRebate;

    private Date serveStartDate;

    private Date serveEnddate;

    private String serveServes;

    private Nurseify serveNurseify;

    private List<Services> servicesList;

    @Override
    public String toString() {
        return "ServicePackVO{" +
                "id=" + id +
                ", serveBrief='" + serveBrief + '\'' +
                ", serveName='" + serveName + '\'' +
                ", serveCare='" + serveCare + '\'' +
                ", serveDetailed=" + serveDetailed +
                ", servrRebate=" + servrRebate +
                ", serveStartDate=" + serveStartDate +
                ", serveEnddate=" + serveEnddate +
                ", serveServes='" + serveServes + '\'' +
                ", serveNurseify=" + serveNurseify +
                ", servicesList=" + servicesList +
                '}';
    }

    public Date getServeStartDate() {
        return serveStartDate;
    }

    public void setServeStartDate(Date serveStartDate) {
        this.serveStartDate = serveStartDate;
    }

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
        this.serveBrief = serveBrief;
    }

    public String getServeName() {
        return serveName;
    }

    public void setServeName(String serveName) {
        this.serveName = serveName;
    }

    public String getServeCare() {
        return serveCare;
    }

    public void setServeCare(String serveCare) {
        this.serveCare = serveCare;
    }

    public CommentRichText getServeDetailed() {
        return serveDetailed;
    }

    public void setServeDetailed(CommentRichText serveDetailed) {
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
        this.serveServes = serveServes;
    }

    public Nurseify getServeNurseify() {
        return serveNurseify;
    }

    public void setServeNurseify(Nurseify serveNurseify) {
        this.serveNurseify = serveNurseify;
    }

    public List<Services> getServicesList() {
        return servicesList;
    }

    public void setServicesList(List<Services> servicesList) {
        this.servicesList = servicesList;
    }
}
