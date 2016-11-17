package com.idea.nursing.inspection.web.domain.pojo;

public class InspectionItemInspectionResult {
    private Long id;

    private Long inspectionId;

    private Long inspectionItemId;

    private String inspectionItemValue;

    private Long inspectionItemSelectValueId;

    private Long servicePeopleId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Long inspectionId) {
        this.inspectionId = inspectionId;
    }

    public Long getInspectionItemId() {
        return inspectionItemId;
    }

    public void setInspectionItemId(Long inspectionItemId) {
        this.inspectionItemId = inspectionItemId;
    }

    public String getInspectionItemValue() {
        return inspectionItemValue;
    }

    public void setInspectionItemValue(String inspectionItemValue) {
        this.inspectionItemValue = inspectionItemValue == null ? null : inspectionItemValue.trim();
    }

    public Long getInspectionItemSelectValueId() {
        return inspectionItemSelectValueId;
    }

    public void setInspectionItemSelectValueId(Long inspectionItemSelectValueId) {
        this.inspectionItemSelectValueId = inspectionItemSelectValueId;
    }

    public Long getServicePeopleId() {
        return servicePeopleId;
    }

    public void setServicePeopleId(Long servicePeopleId) {
        this.servicePeopleId = servicePeopleId;
    }
}