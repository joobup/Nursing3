package com.idea.nursing.servicemodule.web.service.impl;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServicePackMapper;
import com.idea.nursing.servicemodule.web.dao.ServicesMapper;
import com.idea.nursing.servicemodule.web.dao.myself.ServicePackMapperMyself;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePack;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackExample;
import com.idea.nursing.servicemodule.web.domain.pojo.Services;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesExample;
import com.idea.nursing.servicemodule.web.domain.vo.ServicePackVO;
import com.idea.nursing.servicemodule.web.service.ServicePackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class ServicePackServiceImpl extends GenericServiceImpl<ServicePack, Long, ServicePackExample> implements ServicePackService {
    @Autowired
    private ServicePackMapper servicepackDao;
    @Autowired
    private ServicePackMapperMyself servicePackMapperMyself;
    @Autowired
    private ServicesMapper servicesMapper;

    @Override
    public GenericDao<ServicePack, Long, ServicePackExample> getDao() {
        return servicepackDao;
    }

    /**
     * 查询打包服务
     *
     * @param currentPage
     * @param limit
     * @return
     */
    @Override
    public Page<ServicePackVO> findAllVO(Integer currentPage, Integer limit) {
        if (!notNullAndZero(currentPage)) {
            currentPage = 1;
        }
        if (!notNullAndZero(limit)) {
            limit = 10;
        }
        PageHelper.startPage(currentPage, limit);
        Page<ServicePackVO> servicePackVOs = (Page<ServicePackVO>) servicePackMapperMyself.selectAllVO();
        /**
         * 遍历VO 封装服务项
         */
        for (ServicePackVO servicePackVO : servicePackVOs
                ) {
            //分解服务项
            String[] serviceIds = servicePackVO.getServeServes().split(",");
            ServicesExample serviceExaple = new ServicesExample();
            //转换成Long类型
            List<Long> servicesLong = new ArrayList<>();
            for (String serviceIdString : serviceIds
                    ) {
                servicesLong.add(Long.parseLong(serviceIdString));
            }

            serviceExaple.createCriteria().andIdIn(servicesLong);
            //查询
            List<Services> serviceList = servicesMapper.selectByExample(serviceExaple);
            servicePackVO.setServicesList(serviceList);
        }

        return servicePackVOs;
    }


}
