package com.idea.nursing.oldpeople.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.oldpeople.web.dao.ServicePeopleStateMapper;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleState;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleStateExample;
import com.idea.nursing.oldpeople.web.service.ServicePeopleStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class ServicePeopleStateServiceImpl extends GenericServiceLevelImpl<ServicePeopleState, Long,ServicePeopleStateExample> implements ServicePeopleStateService {


        @Autowired
        private ServicePeopleStateMapper servicepeoplestateDao;
        @Override
        public GenericDao<ServicePeopleState, Long,ServicePeopleStateExample> getDao() {
            return servicepeoplestateDao;
        }

        @Override
        public ServicePeopleStateExample getModelExamplTidEqualTo(Long tid) {
            ServicePeopleStateExample servicepeoplestateExample = new ServicePeopleStateExample();
            servicepeoplestateExample.createCriteria().andTidEqualTo(tid);
            return servicepeoplestateExample;
        }

        @Override
        public byte getLevel(ServicePeopleState servicepeoplestate) {

            return servicepeoplestate.getServicePeopleStateLevel();
        }

        @Override
        public Long getTid(ServicePeopleState servicepeoplestate) {
            return servicepeoplestate.getTid();
        }

        @Override
        public void setLevel(ServicePeopleState servicepeoplestate, Byte level) {
            servicepeoplestate.setServicePeopleStateLevel(level);
        }

        @Override
        public void setTid(ServicePeopleState servicepeoplestate) {
            servicepeoplestate.setTid(0L);
        }


}
