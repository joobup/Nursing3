package com.idea.nursing.servicemodule.web.domain.pojo;

public class ServicePackItem {
    private Long id;

    private Long servicePackId;

    private Long serviceId;

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

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }
}