package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServicePackMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePack;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackExample;
import com.idea.nursing.servicemodule.web.service.ServicePackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServicePackServiceImpl extends GenericServiceImpl<ServicePack, Long,ServicePackExample> implements ServicePackService {
    @Autowired
    private ServicePackMapper servicepackDao;
    @Override
    public GenericDao<ServicePack, Long,ServicePackExample> getDao() {
        return servicepackDao;
    }

}
