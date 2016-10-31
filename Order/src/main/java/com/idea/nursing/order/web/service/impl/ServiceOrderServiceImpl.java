package com.idea.nursing.order.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.order.web.dao.ServiceOrderMapper;
import com.idea.nursing.order.web.domain.pojo.ServiceOrder;
import com.idea.nursing.order.web.domain.pojo.ServiceOrderExample;
import com.idea.nursing.order.service.ServiceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceOrderServiceImpl extends GenericServiceImpl<ServiceOrder, Long,ServiceOrderExample> implements ServiceOrderService {
    @Autowired
    private ServiceOrderMapper serviceorderDao;
    @Override
    public GenericDao<ServiceOrder, Long,ServiceOrderExample> getDao() {
        return serviceorderDao;
    }

}
