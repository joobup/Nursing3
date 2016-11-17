package com.idea.nursing.inspection.web.domain.vo;

import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeople;

public class InspectionItemInspectionResultVO {
    private Long id;

    private Long inspectionId;

    private Long inspectionItemId;

    private String inspectionItemValue;

    private Long inspectionItemSelectValueId;

    private Long servicePeopleId;

    private InspectionItemVO inspectionItemVO;
    private ServicePeople servicePeople;

    @Override
    public String toString() {
        return "InspectionItemInspectionResultVO{" +
                "id=" + id +
                ", inspectionId=" + inspectionId +
                ", inspectionItemId=" + inspectionItemId +
                ", inspectionItemValue='" + inspectionItemValue + '\'' +
                ", inspectionItemSelectValueId=" + inspectionItemSelectValueId +
                ", servicePeopleId=" + servicePeopleId +
                ", inspectionItemVO=" + inspectionItemVO +
                ", servicePeople=" + servicePeople +
                '}';
    }

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
        this.inspectionItemValue = inspectionItemValue;
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

    public InspectionItemVO getInspectionItemVO() {
        return inspectionItemVO;
    }

    public void setInspectionItemVO(InspectionItemVO inspectionItemVO) {
        this.inspectionItemVO = inspectionItemVO;
    }

    public ServicePeople getServicePeople() {
        return servicePeople;
    }

    public void setServicePeople(ServicePeople servicePeople) {
        this.servicePeople = servicePeople;
    }
}