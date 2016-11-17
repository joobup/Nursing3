package com.idea.nursing.inspection.web.domain.pojo;

public class InspectionItemInspection {
    private Long id;

    private Long inspectionId;

    private Long inspectionItemId;

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
}