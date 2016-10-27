package com.idea.nursing.servicemodule.web.domain.vo;

import com.idea.nursing.common.web.domain.pojo.CommentPicture;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClasses;

/**
 * Created by 10238 on 2016/10/26.
 */
public class ServiceVO {

    private Long id;

    private ServiceClasses serveClassify;

    private String serveName;

    private String serveBiref;

    private String serveLimit;

    private Integer servePeoples;

    private Long agencyId;

    private CommentPicture mainPicture;

    @Override
    public String toString() {
        return "ServiceVO{" +
                "id=" + id +
                ", serveClassify=" + serveClassify +
                ", serveName='" + serveName + '\'' +
                ", serveBiref='" + serveBiref + '\'' +
                ", serveLimit='" + serveLimit + '\'' +
                ", servePeoples=" + servePeoples +
                ", agencyId=" + agencyId +
                ", mainPicture=" + mainPicture +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ServiceClasses getServeClassify() {
        return serveClassify;
    }

    public void setServeClassify(ServiceClasses serveClassify) {
        this.serveClassify = serveClassify;
    }

    public String getServeName() {
        return serveName;
    }

    public void setServeName(String serveName) {
        this.serveName = serveName;
    }

    public String getServeBiref() {
        return serveBiref;
    }

    public void setServeBiref(String serveBiref) {
        this.serveBiref = serveBiref;
    }

    public String getServeLimit() {
        return serveLimit;
    }

    public void setServeLimit(String serveLimit) {
        this.serveLimit = serveLimit;
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

    public CommentPicture getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(CommentPicture mainPicture) {
        this.mainPicture = mainPicture;
    }
}
