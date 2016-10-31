package com.idea.nursing.oldpeople.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.oldpeople.web.dao.ServicePeopleStateMapper;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleState;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleStateExample;
import com.idea.nursing.oldpeople.service.ServicePeopleStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServicePeopleStateServiceImpl extends GenericServiceImpl<ServicePeopleState, Long,ServicePeopleStateExample> implements ServicePeopleStateService {
    @Autowired
    private ServicePeopleStateMapper servicepeoplestateDao;
    @Override
    public GenericDao<ServicePeopleState, Long,ServicePeopleStateExample> getDao() {
        return servicepeoplestateDao;
    }

}
