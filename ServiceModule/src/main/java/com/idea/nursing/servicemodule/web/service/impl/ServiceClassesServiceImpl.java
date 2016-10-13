package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServiceClassesMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClasses;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesExample;
import com.idea.nursing.servicemodule.web.service.ServiceClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceClassesServiceImpl extends GenericServiceImpl<ServiceClasses, Long,ServiceClassesExample> implements ServiceClassesService {
    @Autowired
    private ServiceClassesMapper ServiceClassesDao;
    @Override
    public GenericDao<ServiceClasses, Long,ServiceClassesExample> getDao() {
        return ServiceClassesDao;
    }

}
