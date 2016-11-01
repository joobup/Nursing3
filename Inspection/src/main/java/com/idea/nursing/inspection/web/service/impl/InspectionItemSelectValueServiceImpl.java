package com.idea.nursing.inspection.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.inspection.web.dao.InspectionItemSelectValueMapper;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemSelectValue;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemSelectValueExample;
import com.idea.nursing.inspection.web.service.InspectionItemSelectValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InspectionItemSelectValueServiceImpl extends GenericServiceImpl<InspectionItemSelectValue, Long,InspectionItemSelectValueExample> implements InspectionItemSelectValueService {
    @Autowired
    private InspectionItemSelectValueMapper inspectionitemselectvalueDao;
    @Override
    public GenericDao<InspectionItemSelectValue, Long,InspectionItemSelectValueExample> getDao() {
        return inspectionitemselectvalueDao;
    }

}
