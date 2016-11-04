package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.servicemodule.web.dao.ServiceClassesMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClasses;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesExample;
import com.idea.nursing.servicemodule.web.service.ServiceClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class ServiceClassesServiceImpl extends GenericServiceLevelImpl<ServiceClasses, Long,ServiceClassesExample> implements ServiceClassesService {


        @Autowired
        private ServiceClassesMapper serviceclassesDao;
        @Override
        public GenericDao<ServiceClasses, Long,ServiceClassesExample> getDao() {
            return serviceclassesDao;
        }

        @Override
        public ServiceClassesExample getModelExamplTidEqualTo(Long tid) {
            ServiceClassesExample serviceclassesExample = new ServiceClassesExample();
            serviceclassesExample.createCriteria().andTidEqualTo(tid);
            return serviceclassesExample;
        }

        @Override
        public byte getLevel(ServiceClasses serviceclasses) {

            return serviceclasses.getServeClasslevel();
        }

        @Override
        public Long getTid(ServiceClasses serviceclasses) {
            return serviceclasses.getTid();
        }

        @Override
        public void setLevel(ServiceClasses serviceclasses, Byte level) {
            serviceclasses.setServeClasslevel(level);
        }

        @Override
        public void setTid(ServiceClasses serviceclasses) {
            serviceclasses.setTid(0L);
        }


}
