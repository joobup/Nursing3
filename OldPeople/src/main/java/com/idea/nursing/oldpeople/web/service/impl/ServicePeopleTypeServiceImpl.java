package com.idea.nursing.oldpeople.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.oldpeople.web.dao.ServicePeopleTypeMapper;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleType;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleTypeExample;
import com.idea.nursing.oldpeople.web.service.ServicePeopleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServicePeopleTypeServiceImpl extends GenericServiceImpl<ServicePeopleType, Long,ServicePeopleTypeExample> implements ServicePeopleTypeService {
    @Autowired
    private ServicePeopleTypeMapper servicepeopletypeDao;
    @Override
    public GenericDao<ServicePeopleType, Long,ServicePeopleTypeExample> getDao() {
        return servicepeopletypeDao;
    }

}
