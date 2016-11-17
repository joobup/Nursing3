package com.idea.nursing.inspection.web.service;

import com.github.pagehelper.Page;
import com.idea.nursing.core.generic.GenericServiceLevel;
import com.idea.nursing.core.generic.GenericService;

import com.idea.nursing.inspection.web.domain.pojo.*;
import com.idea.nursing.inspection.web.domain.vo.InspectionItemInspectionResultVO;

public interface InspectionItemInspectionResultService extends GenericService<InspectionItemInspectionResult,Long,InspectionItemInspectionResultExample>{
    /**
     * 获取VO
     * @param currentPage
     * @param limit
     * @return
     */
    public Page<InspectionItemInspectionResultVO> findAllVO(Integer currentPage,Integer limit);
}
