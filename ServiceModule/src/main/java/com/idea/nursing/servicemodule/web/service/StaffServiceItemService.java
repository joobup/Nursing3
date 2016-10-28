package com.idea.nursing.servicemodule.web.service;

import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffServiceItem;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffServiceItemExample;

public interface StaffServiceItemService extends GenericService<StaffServiceItem,Long,StaffServiceItemExample>{

    public boolean inserts(Long staffId,Long[] serviceIds);

}
