package com.idea.nursing.servicemodule.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;

import com.idea.nursing.servicemodule.web.dao.ServicePackStateMapper;
import com.idea.nursing.servicemodule.web.dao.myself.ServicePackStateMapperMyself;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackState;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackStateExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServicePackStateVO;
import com.idea.nursing.servicemodule.web.domain.vo.ServicePackVO;
import com.idea.nursing.servicemodule.web.service.ServicePackStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicePackStateServiceImpl extends GenericServiceImpl<ServicePackState, Long, ServicePackStateExample> implements ServicePackStateService {

    @Autowired
    private ServicePackStateMapper servicepackstateDao;
    @Autowired
    private ServicePackStateMapperMyself servicePackStateMapperMyself;

    @Override
    public GenericDao<ServicePackState, Long, ServicePackStateExample> getDao() {
        return servicepackstateDao;
    }


    @Override
    public Page<ServicePackStateVO> findAllVO(Integer currentPage, Integer limit, Byte state) {
        if (!notNullAndZero(currentPage)) {
            currentPage = 1;
        }
        if (!notNullAndZero(limit)) {
            limit = 10;
        }
        ServicePackStateExample example = new ServicePackStateExample();
        example.createCriteria().andServicePackStateEqualTo(state);
        PageHelper.startPage(currentPage, limit);
        Page<ServicePackStateVO> servicePackVOs = (Page<ServicePackStateVO>) servicePackStateMapperMyself.selectAllVO(example);


        return servicePackVOs;
    }
}
