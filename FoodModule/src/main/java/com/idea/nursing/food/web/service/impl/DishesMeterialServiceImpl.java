package com.idea.nursing.food.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;

import com.idea.nursing.food.web.dao.DishesMeterialMapper;
import com.idea.nursing.food.web.domain.pojo.DishesMeterial;
import com.idea.nursing.food.web.domain.pojo.DishesMeterialExample;
import com.idea.nursing.food.web.service.DishesMeterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class DishesMeterialServiceImpl extends GenericServiceImpl<DishesMeterial, Long,DishesMeterialExample> implements DishesMeterialService {

       @Autowired
       private DishesMeterialMapper dishesmeterialDao;
       @Override
       public GenericDao<DishesMeterial, Long,DishesMeterialExample> getDao() {
       return dishesmeterialDao;
       }


}
