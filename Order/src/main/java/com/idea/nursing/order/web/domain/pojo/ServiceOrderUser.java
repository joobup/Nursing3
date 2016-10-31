package com.idea.nursing.order.web.domain.pojo;

public class ServiceOrderUser {
    private Long id;

    private Long orderId;

    private Long servicePeopleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getServicePeopleId() {
        return servicePeopleId;
    }

    public void setServicePeopleId(Long servicePeopleId) {
        this.servicePeopleId = servicePeopleId;
    }
}