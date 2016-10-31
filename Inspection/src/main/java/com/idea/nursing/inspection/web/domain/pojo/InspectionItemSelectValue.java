package com.idea.nursing.inspection.web.domain.pojo;

public class InspectionItemSelectValue {
    private Long id;

    private Long inspectionItemId;

    private String selectName;

    private Integer selectValue;

    private String selectNameKey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInspectionItemId() {
        return inspectionItemId;
    }

    public void setInspectionItemId(Long inspectionItemId) {
        this.inspectionItemId = inspectionItemId;
    }

    public String getSelectName() {
        return selectName;
    }

    public void setSelectName(String selectName) {
        this.selectName = selectName == null ? null : selectName.trim();
    }

    public Integer getSelectValue() {
        return selectValue;
    }

    public void setSelectValue(Integer selectValue) {
        this.selectValue = selectValue;
    }

    public String getSelectNameKey() {
        return selectNameKey;
    }

    public void setSelectNameKey(String selectNameKey) {
        this.selectNameKey = selectNameKey == null ? null : selectNameKey.trim();
    }
}