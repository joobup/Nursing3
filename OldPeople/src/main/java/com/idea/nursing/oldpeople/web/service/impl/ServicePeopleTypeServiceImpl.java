package com.idea.nursing.oldpeople.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.oldpeople.web.dao.ServicePeopleTypeMapper;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleType;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleTypeExample;
import com.idea.nursing.oldpeople.web.service.ServicePeopleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class ServicePeopleTypeServiceImpl extends GenericServiceLevelImpl<ServicePeopleType, Long,ServicePeopleTypeExample> implements ServicePeopleTypeService {


        @Autowired
        private ServicePeopleTypeMapper servicepeopletypeDao;
        @Override
        public GenericDao<ServicePeopleType, Long,ServicePeopleTypeExample> getDao() {
            return servicepeopletypeDao;
        }

        @Override
        public ServicePeopleTypeExample getModelExamplTidEqualTo(Long tid) {
            ServicePeopleTypeExample servicepeopletypeExample = new ServicePeopleTypeExample();
            servicepeopletypeExample.createCriteria().andTidEqualTo(tid);
            return servicepeopletypeExample;
        }

        @Override
        public byte getLevel(ServicePeopleType servicepeopletype) {

            return servicepeopletype.getServiceTypePeopleLevel();
        }

        @Override
        public Long getTid(ServicePeopleType servicepeopletype) {
            return servicepeopletype.getTid();
        }

        @Override
        public void setLevel(ServicePeopleType servicepeopletype, Byte level) {
            servicepeopletype.setServiceTypePeopleLevel(level);
        }

        @Override
        public void setTid(ServicePeopleType servicepeopletype) {
            servicepeopletype.setTid(0L);
        }


}
