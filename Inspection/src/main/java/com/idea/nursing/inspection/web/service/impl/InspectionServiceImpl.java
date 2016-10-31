package com.idea.nursing.inspection.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.inspection.web.dao.InspectionMapper;
import com.idea.nursing.inspection.web.domain.pojo.Inspection;
import com.idea.nursing.inspection.web.domain.pojo.InspectionExample;
import com.idea.nursing.inspection.service.InspectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InspectionServiceImpl extends GenericServiceImpl<Inspection, Long,InspectionExample> implements InspectionService {
    @Autowired
    private InspectionMapper inspectionDao;
    @Override
    public GenericDao<Inspection, Long,InspectionExample> getDao() {
        return inspectionDao;
    }

}
