package com.idea.nursing.inspection.web.service;

import com.github.pagehelper.Page;
import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.inspection.web.domain.pojo.Inspection;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItem;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemExample;
import com.idea.nursing.inspection.web.domain.vo.InspectionItemVO;

public interface InspectionItemService extends GenericService<InspectionItem,Long,InspectionItemExample>{
    /**
     * 查询检查项目VO
     * @param currentPage
     * @param limit
     * @return
     */
    public Page<InspectionItemVO> findAllVO(Integer currentPage,Integer limit);

}
