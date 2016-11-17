package com.idea.nursing.inspection.web.dao.myself;

import com.idea.nursing.core.generic.GenericDao;

import com.idea.nursing.inspection.web.domain.vo.InspectionItemInspectionResultVO;


import java.util.List;

public interface InspectionItemInspectionResultMapperMyself extends GenericDao {
    /**
     * 查询VO
     * @return
     */
    public List<InspectionItemInspectionResultVO> selectAllVO();
}