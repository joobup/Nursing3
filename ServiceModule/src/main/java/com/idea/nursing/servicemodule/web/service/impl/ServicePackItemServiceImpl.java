package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.ServicePackItemMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePack;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackItem;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackItemExample;
import com.idea.nursing.servicemodule.web.service.ServicePackItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServicePackItemServiceImpl extends GenericServiceImpl<ServicePackItem, Long,ServicePackItemExample> implements ServicePackItemService {
    @Autowired
    private ServicePackItemMapper servicepackitemDao;
    @Override
    public GenericDao<ServicePackItem, Long,ServicePackItemExample> getDao() {
        return servicepackitemDao;
    }

    /**
     * 批量添加服务打包服务项
     * @param servicePack
     * @return
     */
    @Override
    public boolean inserts(ServicePack servicePack) {

        String[] serviceIds = servicePack.getServeServes().split(",");

        for (String serviceIdString:serviceIds
             ) {
            ServicePackItem servicePackItem = new ServicePackItem();
            servicePackItem.setServiceId(Long.parseLong(serviceIdString));
            servicePackItem.setServicePackId(servicePack.getId());
            servicepackitemDao.insert(servicePackItem);
            if(servicePackItem.getId()==null){
                return false;
            }
        }
        return true;
    }
}
