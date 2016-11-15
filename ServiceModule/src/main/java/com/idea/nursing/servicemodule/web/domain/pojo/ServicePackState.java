package com.idea.nursing.servicemodule.web.domain.pojo;

import java.util.Date;

public class ServicePackState {
    private Long id;

    private Long servicePackId;

    private Byte servicePackState;

    private Date servicePackOnLineDate;

    private Long serviceCount;

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
}