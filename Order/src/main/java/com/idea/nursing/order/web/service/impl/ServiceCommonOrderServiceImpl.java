package com.idea.nursing.order.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.order.web.dao.ServiceCommonOrderMapper;
import com.idea.nursing.order.web.domain.pojo.ServiceCommonOrder;
import com.idea.nursing.order.web.domain.pojo.ServiceCommonOrderExample;
import com.idea.nursing.order.service.ServiceCommonOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceCommonOrderServiceImpl extends GenericServiceImpl<ServiceCommonOrder, Long,ServiceCommonOrderExample> implements ServiceCommonOrderService {
    @Autowired
    private ServiceCommonOrderMapper servicecommonorderDao;
    @Override
    public GenericDao<ServiceCommonOrder, Long,ServiceCommonOrderExample> getDao() {
        return servicecommonorderDao;
    }

}
