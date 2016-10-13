package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServiceClassesValuationRelationMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuationRelation;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuationRelationExample;
import com.idea.nursing.servicemodule.web.service.ServiceClassesValuationRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceClassesValuationRelationServiceImpl extends GenericServiceImpl<ServiceClassesValuationRelation, Long,ServiceClassesValuationRelationExample> implements ServiceClassesValuationRelationService {
    @Autowired
    private ServiceClassesValuationRelationMapper serviceclassesvaluationrelationDao;
    @Override
    public GenericDao<ServiceClassesValuationRelation, Long,ServiceClassesValuationRelationExample> getDao() {
        return serviceclassesvaluationrelationDao;
    }

}
