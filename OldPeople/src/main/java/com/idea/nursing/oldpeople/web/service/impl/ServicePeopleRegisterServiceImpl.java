package com.idea.nursing.oldpeople.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.oldpeople.web.dao.ServicePeopleRegisterMapper;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleRegister;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleRegisterExample;
import com.idea.nursing.oldpeople.web.service.ServicePeopleRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServicePeopleRegisterServiceImpl extends GenericServiceImpl<ServicePeopleRegister, Long,ServicePeopleRegisterExample> implements ServicePeopleRegisterService {
    @Autowired
    private ServicePeopleRegisterMapper servicepeopleregisterDao;
    @Override
    public GenericDao<ServicePeopleRegister, Long,ServicePeopleRegisterExample> getDao() {
        return servicepeopleregisterDao;
    }

}
