package com.idea.nursing.oldpeople.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.oldpeople.web.dao.ServicePeopleMapper;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeople;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleExample;
import com.idea.nursing.oldpeople.web.service.ServicePeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServicePeopleServiceImpl extends GenericServiceImpl<ServicePeople, Long,ServicePeopleExample> implements ServicePeopleService {
    @Autowired
    private ServicePeopleMapper servicepeopleDao;
    @Override
    public GenericDao<ServicePeople, Long,ServicePeopleExample> getDao() {
        return servicepeopleDao;
    }

}
