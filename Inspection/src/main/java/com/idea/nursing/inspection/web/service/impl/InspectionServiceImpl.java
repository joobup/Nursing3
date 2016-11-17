package com.idea.nursing.inspection.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.inspection.web.dao.InspectionMapper;
import com.idea.nursing.inspection.web.dao.myself.InspectionItemMapperMyself;
import com.idea.nursing.inspection.web.dao.myself.InspectionMapperMyself;
import com.idea.nursing.inspection.web.domain.pojo.Inspection;
import com.idea.nursing.inspection.web.domain.pojo.InspectionExample;
import com.idea.nursing.inspection.web.domain.vo.InspectionVO;
import com.idea.nursing.inspection.web.service.InspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InspectionServiceImpl extends GenericServiceImpl<Inspection, Long,InspectionExample> implements InspectionService {
    @Autowired
    private InspectionMapper inspectionDao;
    @Autowired
    private InspectionMapperMyself inspectionMapperMyself;
    @Override
    public GenericDao<Inspection, Long,InspectionExample> getDao() {
        return inspectionDao;
    }

    @Override
    public Page<InspectionVO> findAllVO(Integer currentPage, Integer limit) {
        if (!notNullAndZero(currentPage)) {
            currentPage = 1;
        }
        if (!notNullAndZero(limit)) {
            limit = 10;
        }
        PageHelper.startPage(currentPage, limit);
        Page<InspectionVO> inspectionVOs = (Page<InspectionVO>) inspectionMapperMyself.selectAllVO();

        return inspectionVOs;
    }
}
