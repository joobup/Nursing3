package com.idea.nursing.servicemodule.web.domain.pojo;

public class StaffServiceItem {
    private Long id;

    private Long staffId;

    private Long serviceItem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Long getServiceItem() {
        return serviceItem;
    }

    public void setServiceItem(Long serviceItem) {
        this.serviceItem = serviceItem;
    }
}