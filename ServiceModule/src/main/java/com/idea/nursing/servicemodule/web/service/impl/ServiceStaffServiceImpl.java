package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServiceStaffMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceStaff;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceStaffExample;
import com.idea.nursing.servicemodule.web.service.ServiceStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceStaffServiceImpl extends GenericServiceImpl<ServiceStaff, Long,ServiceStaffExample> implements ServiceStaffService {
    @Autowired
    private ServiceStaffMapper servicestaffDao;
    @Override
    public GenericDao<ServiceStaff, Long,ServiceStaffExample> getDao() {
        return servicestaffDao;
    }

}
