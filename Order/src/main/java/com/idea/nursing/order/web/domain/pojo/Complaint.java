package com.idea.nursing.order.web.domain.pojo;

public class Complaint {
    private Long id;

    private Long complaintEventId;

    private Long loginId;

    private Long orderId;

    private String complaintContent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getComplaintEventId() {
        return complaintEventId;
    }

    public void setComplaintEventId(Long complaintEventId) {
        this.complaintEventId = complaintEventId;
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getComplaintContent() {
        return complaintContent;
    }

    public void setComplaintContent(String complaintContent) {
        this.complaintContent = complaintContent == null ? null : complaintContent.trim();
    }
}