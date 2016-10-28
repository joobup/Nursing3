package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.StaffServiceItemMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffServiceItem;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffServiceItemExample;
import com.idea.nursing.servicemodule.web.service.StaffServiceItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StaffServiceItemServiceImpl extends GenericServiceImpl<StaffServiceItem, Long,StaffServiceItemExample> implements StaffServiceItemService {
    @Autowired
    private StaffServiceItemMapper staffserviceitemDao;
    @Override
    public GenericDao<StaffServiceItem, Long,StaffServiceItemExample> getDao() {
        return staffserviceitemDao;
    }

    /**
     * 批量添加人员服务绑定
     * @param staffId
     * @param serviceIds
     * @return
     */
    @Override
    public boolean inserts(Long staffId, Long[] serviceIds) {

        if(serviceIds.length==0){
           return false;
        }
        for (Long serviceId:serviceIds
             ) {
            StaffServiceItem staffServiceItem = new StaffServiceItem();
            staffServiceItem.setServiceItem(serviceId);
            staffServiceItem.setStaffId(staffId);
            staffserviceitemDao.insert(staffServiceItem);
            if(staffServiceItem.getId()==null){
                return false;
            }
        }
        return true;
    }
}
