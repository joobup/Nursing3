package com.idea.nursing.cost.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;

import com.idea.nursing.cost.web.dao.CostMapper;
import com.idea.nursing.cost.web.domain.pojo.Cost;
import com.idea.nursing.cost.web.domain.pojo.CostExample;
import com.idea.nursing.cost.web.service.CostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class CostServiceImpl extends GenericServiceImpl<Cost, Long,CostExample> implements CostService {

       @Autowired
       private CostMapper costDao;
       @Override
       public GenericDao<Cost, Long,CostExample> getDao() {
       return costDao;
       }


}
