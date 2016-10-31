package com.idea.nursing.order.web.domain.pojo;

public class PackageServiceEvaluate {
    private Long id;

    private Long servicePackId;

    private Long evaluateId;

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

    public Long getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Long evaluateId) {
        this.evaluateId = evaluateId;
    }
}