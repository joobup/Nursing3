package com.idea.nursing.inspection.web.domain.pojo;

public class InspectionItem {
    private Long id;

    private String inspectionItemName;

    private Integer normalValueUpperLimit;

    private Integer normalValueUpperFloor;

    private Byte inspectionItemValueType;

    private String unit;

    private String inspectionItemNameKey;

    private String inspectionItemDescribe;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInspectionItemName() {
        return inspectionItemName;
    }

    public void setInspectionItemName(String inspectionItemName) {
        this.inspectionItemName = inspectionItemName == null ? null : inspectionItemName.trim();
    }

    public Integer getNormalValueUpperLimit() {
        return normalValueUpperLimit;
    }

    public void setNormalValueUpperLimit(Integer normalValueUpperLimit) {
        this.normalValueUpperLimit = normalValueUpperLimit;
    }

    public Integer getNormalValueUpperFloor() {
        return normalValueUpperFloor;
    }

    public void setNormalValueUpperFloor(Integer normalValueUpperFloor) {
        this.normalValueUpperFloor = normalValueUpperFloor;
    }

    public Byte getInspectionItemValueType() {
        return inspectionItemValueType;
    }

    public void setInspectionItemValueType(Byte inspectionItemValueType) {
        this.inspectionItemValueType = inspectionItemValueType;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getInspectionItemNameKey() {
        return inspectionItemNameKey;
    }

    public void setInspectionItemNameKey(String inspectionItemNameKey) {
        this.inspectionItemNameKey = inspectionItemNameKey == null ? null : inspectionItemNameKey.trim();
    }

    public String getInspectionItemDescribe() {
        return inspectionItemDescribe;
    }

    public void setInspectionItemDescribe(String inspectionItemDescribe) {
        this.inspectionItemDescribe = inspectionItemDescribe == null ? null : inspectionItemDescribe.trim();
    }
}