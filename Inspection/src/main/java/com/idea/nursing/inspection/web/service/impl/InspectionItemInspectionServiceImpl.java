package com.idea.nursing.inspection.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.inspection.web.dao.InspectionItemInspectionMapper;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemInspection;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemInspectionExample;
import com.idea.nursing.inspection.web.service.InspectionItemInspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InspectionItemInspectionServiceImpl extends GenericServiceImpl<InspectionItemInspection, Long,InspectionItemInspectionExample> implements InspectionItemInspectionService {
    @Autowired
    private InspectionItemInspectionMapper inspectioniteminspectionDao;
    @Override
    public GenericDao<InspectionItemInspection, Long,InspectionItemInspectionExample> getDao() {
        return inspectioniteminspectionDao;
    }

}
