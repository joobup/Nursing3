package com.idea.nursing.inspection.web.service;

import com.github.pagehelper.Page;
import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.inspection.web.domain.pojo.Inspection;
import com.idea.nursing.inspection.web.domain.pojo.InspectionExample;
import com.idea.nursing.inspection.web.domain.vo.InspectionVO;

public interface InspectionService extends GenericService<Inspection,Long,InspectionExample>{
    /**
     * 查询vo
     * @param currentPage
     * @param limit
     * @return
     */
    public Page<InspectionVO> findAllVO(Integer currentPage,Integer limit);

}
