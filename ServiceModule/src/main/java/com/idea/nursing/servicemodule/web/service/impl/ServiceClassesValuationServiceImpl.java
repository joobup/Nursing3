package com.idea.nursing.servicemodule.web.service.impl;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServiceClassesValuationMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuation;
import com.idea.nursing.servicemodule.web.service.ServiceClassesValuationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 10238 on 2016/10/12.
 */
public class ServiceClassesValuationServiceImpl extends GenericServiceImpl<ServiceClassesValuation, Long>  implements ServiceClassesValuationService  {
    @Autowired
    private ServiceClassesValuationMapper serviceClassesValuationDao;
    
    @Override
    public GenericDao<ServiceClassesValuation, Long>  getDao() {
        return null;
    }

   
}
