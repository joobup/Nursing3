package com.idea.nursing.inspection.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.inspection.web.dao.InspectionItemMapper;
import com.idea.nursing.inspection.web.dao.myself.InspectionItemMapperMyself;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItem;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemExample;
import com.idea.nursing.inspection.web.domain.vo.InspectionItemVO;
import com.idea.nursing.inspection.web.domain.vo.InspectionVO;
import com.idea.nursing.inspection.web.service.InspectionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InspectionItemServiceImpl extends GenericServiceImpl<InspectionItem, Long,InspectionItemExample> implements InspectionItemService {
    @Autowired
    private InspectionItemMapper inspectionitemDao;

    @Autowired
    private InspectionItemMapperMyself inspectionItemMapperMyself;
    @Override
    public GenericDao<InspectionItem, Long,InspectionItemExample> getDao() {
        return inspectionitemDao;
    }

    @Override
    public Page<InspectionItemVO> findAllVO(Integer currentPage, Integer limit) {
        if (!notNullAndZero(currentPage)) {
            currentPage = 1;
        }
        if (!notNullAndZero(limit)) {
            limit = 10;
        }
        PageHelper.startPage(currentPage, limit);
        Page<InspectionItemVO> inspectionItemVOs = (Page<InspectionItemVO>) inspectionItemMapperMyself.selectAllVO();
        return inspectionItemVOs;

    }
}
