package com.idea.nursing.inspection.web.domain.vo;

import com.idea.nursing.inspection.web.domain.pojo.InspectionItemSelectValue;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */
public class InspectionItemVO {


    private Long id;

    private String inspectionItemName;

    private Integer normalValueUpperLimit;

    private Integer normalValueUpperFloor;

    private Byte inspectionItemValueType;

    private String unit;

    private String inspectionItemNameKey;

    private String inspectionItemDescribe;

    private List<InspectionItemSelectValue>  inspectionItemSelectValueList;

    @Override
    public String toString() {
        return "InspectionItemVO{" +
                "id=" + id +
                ", inspectionItemName='" + inspectionItemName + '\'' +
                ", normalValueUpperLimit=" + normalValueUpperLimit +
                ", normalValueUpperFloor=" + normalValueUpperFloor +
                ", inspectionItemValueType=" + inspectionItemValueType +
                ", unit='" + unit + '\'' +
                ", inspectionItemNameKey='" + inspectionItemNameKey + '\'' +
                ", inspectionItemDescribe='" + inspectionItemDescribe + '\'' +
                ", inspectionItemSelectValueList=" + inspectionItemSelectValueList +
                '}';
    }

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
        this.inspectionItemName = inspectionItemName;
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
        this.unit = unit;
    }

    public String getInspectionItemNameKey() {
        return inspectionItemNameKey;
    }

    public void setInspectionItemNameKey(String inspectionItemNameKey) {
        this.inspectionItemNameKey = inspectionItemNameKey;
    }

    public String getInspectionItemDescribe() {
        return inspectionItemDescribe;
    }

    public void setInspectionItemDescribe(String inspectionItemDescribe) {
        this.inspectionItemDescribe = inspectionItemDescribe;
    }

    public List<InspectionItemSelectValue> getInspectionItemSelectValueList() {
        return inspectionItemSelectValueList;
    }

    public void setInspectionItemSelectValueList(List<InspectionItemSelectValue> inspectionItemSelectValueList) {
        this.inspectionItemSelectValueList = inspectionItemSelectValueList;
    }
}
