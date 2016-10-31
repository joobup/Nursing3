package com.idea.nursing.order.web.domain.pojo;

public class OrderEvaluate {
    private Long id;

    private Long orderId;

    private Long evaluateId;

    private Byte evaluateValue;

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

    public Long getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Long evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Byte getEvaluateValue() {
        return evaluateValue;
    }

    public void setEvaluateValue(Byte evaluateValue) {
        this.evaluateValue = evaluateValue;
    }
}