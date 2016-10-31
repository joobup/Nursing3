package com.idea.nursing.order.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.order.web.dao.ComplaintEventMapper;
import com.idea.nursing.order.web.domain.pojo.ComplaintEvent;
import com.idea.nursing.order.web.domain.pojo.ComplaintEventExample;
import com.idea.nursing.order.service.ComplaintEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ComplaintEventServiceImpl extends GenericServiceImpl<ComplaintEvent, Long,ComplaintEventExample> implements ComplaintEventService {
    @Autowired
    private ComplaintEventMapper complainteventDao;
    @Override
    public GenericDao<ComplaintEvent, Long,ComplaintEventExample> getDao() {
        return complainteventDao;
    }

}
