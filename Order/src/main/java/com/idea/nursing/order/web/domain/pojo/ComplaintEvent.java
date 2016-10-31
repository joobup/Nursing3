package com.idea.nursing.order.web.domain.pojo;

public class ComplaintEvent {
    private Long id;

    private String complaintEventName;

    private Byte complaintEventLevel;

    private Long tid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComplaintEventName() {
        return complaintEventName;
    }

    public void setComplaintEventName(String complaintEventName) {
        this.complaintEventName = complaintEventName == null ? null : complaintEventName.trim();
    }

    public Byte getComplaintEventLevel() {
        return complaintEventLevel;
    }

    public void setComplaintEventLevel(Byte complaintEventLevel) {
        this.complaintEventLevel = complaintEventLevel;
    }

    public Long getTid() {
        return tid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }
}