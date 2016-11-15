package com.idea.nursing.servicemodule.web.domain.vo;

import java.util.Date;

/**
 * Created by Administrator on 2016/11/15.
 */
public class ServicePackStateVO {

    private Long id;

    private Long servicePackId;

    private Byte servicePackState;

    private Date servicePackOnLineDate;

    private Long serviceCount;

    private ServicePackVO servicePack;


    @Override
    public String toString() {
        return "ServicePackStateVO{" +
                "id=" + id +
                ", servicePackId=" + servicePackId +
                ", servicePackState=" + servicePackState +
                ", servicePackOnLineDate=" + servicePackOnLineDate +
                ", serviceCount=" + serviceCount +
                ", servicePack=" + servicePack +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServicePackId() {
        return servicePackId;
    }

    public void setServicePackId(Long servicePackId) {
        this.servicePackId = servicePackId;
    }

    public Byte getServicePackState() {
        return servicePackState;
    }

    public void setServicePackState(Byte servicePackState) {
        this.servicePackState = servicePackState;
    }

    public Date getServicePackOnLineDate() {
        return servicePackOnLineDate;
    }

    public void setServicePackOnLineDate(Date servicePackOnLineDate) {
        this.servicePackOnLineDate = servicePackOnLineDate;
    }

    public Long getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(Long serviceCount) {
        this.serviceCount = serviceCount;
    }

    public ServicePackVO getServicePack() {
        return servicePack;
    }

    public void setServicePack(ServicePackVO servicePack) {
        this.servicePack = servicePack;
    }
}
