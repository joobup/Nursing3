package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServicesMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.Services;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesExample;
import com.idea.nursing.servicemodule.web.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServicesServiceImpl extends GenericServiceImpl<Services, Long,ServicesExample> implements ServicesService {
    @Autowired
    private ServicesMapper servicesDao;
    @Override
    public GenericDao<Services, Long,ServicesExample> getDao() {
        return servicesDao;
    }

}
