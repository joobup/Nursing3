package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServiceClassesValuationMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuation;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuationExample;
import com.idea.nursing.servicemodule.web.service.ServiceClassesValuationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceClassesValuationServiceImpl extends GenericServiceImpl<ServiceClassesValuation, Long,ServiceClassesValuationExample> implements ServiceClassesValuationService {
    @Autowired
    private ServiceClassesValuationMapper ServiceClassesValuationDao;
    @Override
    public GenericDao<ServiceClassesValuation, Long,ServiceClassesValuationExample> getDao() {
        return ServiceClassesValuationDao;
    }

}
