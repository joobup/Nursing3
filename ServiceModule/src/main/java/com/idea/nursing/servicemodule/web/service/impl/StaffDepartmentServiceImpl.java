package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.StaffDepartmentMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffDepartment;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffDepartmentExample;
import com.idea.nursing.servicemodule.web.service.StaffDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StaffDepartmentServiceImpl extends GenericServiceImpl<StaffDepartment, Long,StaffDepartmentExample> implements StaffDepartmentService {
    @Autowired
    private StaffDepartmentMapper StaffDepartmentDao;
    @Override
    public GenericDao<StaffDepartment, Long,StaffDepartmentExample> getDao() {
        return StaffDepartmentDao;
    }

}
