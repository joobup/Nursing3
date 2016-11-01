package com.idea.nursing.order.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.order.web.dao.ComplaintMapper;
import com.idea.nursing.order.web.domain.pojo.Complaint;
import com.idea.nursing.order.web.domain.pojo.ComplaintExample;
import com.idea.nursing.order.web.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ComplaintServiceImpl extends GenericServiceImpl<Complaint, Long,ComplaintExample> implements ComplaintService {
    @Autowired
    private ComplaintMapper complaintDao;
    @Override
    public GenericDao<Complaint, Long,ComplaintExample> getDao() {
        return complaintDao;
    }

}
