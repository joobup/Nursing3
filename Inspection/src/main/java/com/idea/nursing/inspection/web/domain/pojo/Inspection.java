package com.idea.nursing.inspection.web.domain.pojo;

public class Inspection {
    private Long id;

    private String inspectionName;

    private String inspectionItemList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInspectionName() {
        return inspectionName;
    }

    public void setInspectionName(String inspectionName) {
        this.inspectionName = inspectionName == null ? null : inspectionName.trim();
    }

    public String getInspectionItemList() {
        return inspectionItemList;
    }

    public void setInspectionItemList(String inspectionItemList) {
        this.inspectionItemList = inspectionItemList == null ? null : inspectionItemList.trim();
    }
}