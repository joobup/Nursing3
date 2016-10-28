package com.idea.nursing.servicemodule.web.service;

import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePack;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackItem;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackItemExample;

public interface ServicePackItemService extends GenericService<ServicePackItem,Long,ServicePackItemExample>{


    public boolean inserts(ServicePack servicePack);
}
