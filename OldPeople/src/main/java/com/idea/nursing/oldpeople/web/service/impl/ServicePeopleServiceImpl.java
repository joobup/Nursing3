package com.idea.nursing.oldpeople.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.oldpeople.web.dao.ServicePeopleMapper;
import com.idea.nursing.oldpeople.web.dao.ServicePeopleRegisterMapper;
import com.idea.nursing.oldpeople.web.dao.myself.ServicePeopleMapperMyself;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeople;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleExample;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleRegister;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleRegisterExample;
import com.idea.nursing.oldpeople.web.domain.vo.ServicePeopleVO;
import com.idea.nursing.oldpeople.web.service.ServicePeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServicePeopleServiceImpl extends GenericServiceImpl<ServicePeople, Long,ServicePeopleExample> implements ServicePeopleService {
    @Autowired
    private ServicePeopleMapper servicepeopleDao;
    @Autowired
    private ServicePeopleMapperMyself servicePeopleMapperMyself;
    @Autowired
    private ServicePeopleRegisterMapper servicePeopleRegisterMapper;
    @Override
    public GenericDao<ServicePeople, Long,ServicePeopleExample> getDao() {
        return servicepeopleDao;
    }

    @Override
    public Page<ServicePeopleVO> findAllVO(Integer currentPage, Integer limit) {

        if(currentPage==null){
            currentPage=1;
        }
        if(limit==null){
            limit=10;
        }
        PageHelper.startPage(currentPage,limit);
        Page<ServicePeopleVO> servicePeopleVOs = (Page<ServicePeopleVO>) servicePeopleMapperMyself.findAllVO();

        for (ServicePeopleVO servicePeopleVO: servicePeopleVOs.getResult()
             ) {
            ServicePeopleRegisterExample example = new ServicePeopleRegisterExample();
            example.createCriteria().andServicePeopleIdEqualTo(servicePeopleVO.getId());
            List<ServicePeopleRegister> servicePeopleRegisterList= servicePeopleRegisterMapper.selectByExample(example);
            if(servicePeopleRegisterMapper.selectByExample(example).size()==0){
                servicePeopleVO.setIsHaveServicePeopleRegister(0l);
            }else{
                servicePeopleVO.setIsHaveServicePeopleRegister(servicePeopleRegisterList.get(0).getId());
            }



        }

        return servicePeopleVOs;
    }
}
