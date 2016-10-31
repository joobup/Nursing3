package com.idea.nursing.order.web.domain.pojo;

import java.util.Date;

public class ServiceOrder {
    private Long id;

    private Byte orderType;

    private Long packageServiceId;

    private Long clientId;

    private Long agencyId;

    private Date orderDate;

    private Date payDate;

    private Date acceptServiceDate;

    private Date serviceEndDate;

    private Date serviceStartDate;

    private Long contactId;

    private Long price;

    private Long insuranceId;

    private Integer serviceCount;

    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public Long getPackageServiceId() {
        return packageServiceId;
    }

    public void setPackageServiceId(Long packageServiceId) {
        this.packageServiceId = packageServiceId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Long agencyId) {
        this.agencyId = agencyId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getAcceptServiceDate() {
        return acceptServiceDate;
    }

    public void setAcceptServiceDate(Date acceptServiceDate) {
        this.acceptServiceDate = acceptServiceDate;
    }

    public Date getServiceEndDate() {
        return serviceEndDate;
    }

    public void setServiceEndDate(Date serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    public Date getServiceStartDate() {
        return serviceStartDate;
    }

    public void setServiceStartDate(Date serviceStartDate) {
        this.serviceStartDate = serviceStartDate;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Long insuranceId) {
        this.insuranceId = insuranceId;
    }

    public Integer getServiceCount() {
        return serviceCount;
    }

    public void setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}