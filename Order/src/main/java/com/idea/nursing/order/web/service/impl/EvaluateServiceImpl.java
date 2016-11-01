package com.idea.nursing.order.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.order.web.dao.EvaluateMapper;
import com.idea.nursing.order.web.domain.pojo.Evaluate;
import com.idea.nursing.order.web.domain.pojo.EvaluateExample;
import com.idea.nursing.order.web.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class EvaluateServiceImpl extends GenericServiceImpl<Evaluate, Long,EvaluateExample> implements EvaluateService {
    @Autowired
    private EvaluateMapper evaluateDao;
    @Override
    public GenericDao<Evaluate, Long,EvaluateExample> getDao() {
        return evaluateDao;
    }

}
