package com.idea.nursing.servicemodule.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServiceStaffMapper;
import com.idea.nursing.servicemodule.web.dao.myself.ServiceStaffMapperMyself;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceStaff;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceStaffExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServiceStaffVO;
import com.idea.nursing.servicemodule.web.service.ServiceStaffService;
import com.idea.nursing.servicemodule.web.service.ServiceStaffServiceMyself;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ServiceStaffServiceImpl extends GenericServiceImpl<ServiceStaff, Long,ServiceStaffExample> implements ServiceStaffService,ServiceStaffServiceMyself {
    @Autowired
    private ServiceStaffMapper servicestaffDao;
    @Autowired
    private ServiceStaffMapperMyself serviceStaffMapperMyself;
    @Override
    public GenericDao<ServiceStaff, Long,ServiceStaffExample> getDao() {
        return servicestaffDao;
    }

    @Override
    public Page<ServiceStaffVO> findAllVO(Integer currentPage , Integer limit) {
        PageHelper.startPage(currentPage,limit);
        Page<ServiceStaffVO> list = (Page<ServiceStaffVO>) serviceStaffMapperMyself.selectAllVO();
        return list;
    }
}
