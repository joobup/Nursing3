package com.idea.nursing.inspection.web.service;

import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemInspection;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemInspectionExample;

public interface InspectionItemInspectionService extends GenericService<InspectionItemInspection,Long,InspectionItemInspectionExample>{
    /**
     * 通过检查表id删除
     * @param inspectionId
     */
    public void delByInspectionId(Long inspectionId);

}
