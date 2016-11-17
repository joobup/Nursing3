package com.idea.nursing.inspection.web.domain.vo;

import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */
public class InspectionVO {

    private Long id;

    private String inspectionName;

    private String inspectionItemList;

    private List<InspectionItemVO> inspectionItemVOList;

    @Override
    public String toString() {
        return "InspectionVO{" +
                "id=" + id +
                ", inspectionName='" + inspectionName + '\'' +
                ", inspectionItemList='" + inspectionItemList + '\'' +
                ", inspectionItemVOList=" + inspectionItemVOList +
                '}';
    }

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
        this.inspectionName = inspectionName;
    }

    public String getInspectionItemList() {
        return inspectionItemList;
    }

    public void setInspectionItemList(String inspectionItemList) {
        this.inspectionItemList = inspectionItemList;
    }

    public List<InspectionItemVO> getInspectionItemVOList() {
        return inspectionItemVOList;
    }

    public void setInspectionItemVOList(List<InspectionItemVO> inspectionItemVOList) {
        this.inspectionItemVOList = inspectionItemVOList;
    }
}
