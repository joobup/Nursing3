package com.idea.nursing.inspection.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;

import com.idea.nursing.inspection.web.dao.InspectionItemInspectionResultMapper;
import com.idea.nursing.inspection.web.dao.myself.InspectionItemInspectionResultMapperMyself;
import com.idea.nursing.inspection.web.domain.pojo.*;
import com.idea.nursing.inspection.web.domain.vo.InspectionItemInspectionResultVO;
import com.idea.nursing.inspection.web.domain.vo.InspectionItemVO;
import com.idea.nursing.inspection.web.service.InspectionItemInspectionResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InspectionItemInspectionResultServiceImpl extends GenericServiceImpl<InspectionItemInspectionResult, Long, InspectionItemInspectionResultExample> implements InspectionItemInspectionResultService {

    @Autowired
    private InspectionItemInspectionResultMapper inspectioniteminspectionresultDao;
    @Autowired
    private InspectionItemInspectionResultMapperMyself inspectionItemInspectionResultMapperMyself;

    @Override
    public GenericDao<InspectionItemInspectionResult, Long, InspectionItemInspectionResultExample> getDao() {
        return inspectioniteminspectionresultDao;
    }


    @Override
    public Page<InspectionItemInspectionResultVO> findAllVO(Integer currentPage, Integer limit) {

        if (!notNullAndZero(currentPage)) {
            currentPage = 1;
        }
        if (!notNullAndZero(limit)) {
            limit = 10;
        }
        PageHelper.startPage(currentPage, limit);
        Page<InspectionItemInspectionResultVO> inspectionItemInspectionResultVO = (Page<InspectionItemInspectionResultVO>) inspectionItemInspectionResultMapperMyself.selectAllVO();
        return inspectionItemInspectionResultVO;

    }
}
