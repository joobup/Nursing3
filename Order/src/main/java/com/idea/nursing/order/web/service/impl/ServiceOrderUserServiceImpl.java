package com.idea.nursing.order.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.order.web.dao.ServiceOrderUserMapper;
import com.idea.nursing.order.web.domain.pojo.ServiceOrderUser;
import com.idea.nursing.order.web.domain.pojo.ServiceOrderUserExample;
import com.idea.nursing.order.service.ServiceOrderUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceOrderUserServiceImpl extends GenericServiceImpl<ServiceOrderUser, Long,ServiceOrderUserExample> implements ServiceOrderUserService {
    @Autowired
    private ServiceOrderUserMapper serviceorderuserDao;
    @Override
    public GenericDao<ServiceOrderUser, Long,ServiceOrderUserExample> getDao() {
        return serviceorderuserDao;
    }

}
