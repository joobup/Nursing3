package com.idea.nursing.inspection.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.inspection.web.dao.InspectionItemMapper;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItem;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemExample;
import com.idea.nursing.inspection.service.InspectionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InspectionItemServiceImpl extends GenericServiceImpl<InspectionItem, Long,InspectionItemExample> implements InspectionItemService {
    @Autowired
    private InspectionItemMapper inspectionitemDao;
    @Override
    public GenericDao<InspectionItem, Long,InspectionItemExample> getDao() {
        return inspectionitemDao;
    }

}
