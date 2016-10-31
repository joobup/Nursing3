package com.idea.nursing.order.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.order.web.dao.OrderEvaluateMapper;
import com.idea.nursing.order.web.domain.pojo.OrderEvaluate;
import com.idea.nursing.order.web.domain.pojo.OrderEvaluateExample;
import com.idea.nursing.order.service.OrderEvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderEvaluateServiceImpl extends GenericServiceImpl<OrderEvaluate, Long,OrderEvaluateExample> implements OrderEvaluateService {
    @Autowired
    private OrderEvaluateMapper orderevaluateDao;
    @Override
    public GenericDao<OrderEvaluate, Long,OrderEvaluateExample> getDao() {
        return orderevaluateDao;
    }

}
