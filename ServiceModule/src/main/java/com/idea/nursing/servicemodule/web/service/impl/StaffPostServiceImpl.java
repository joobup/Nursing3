package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.StaffPostMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffPost;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffPostExample;
import com.idea.nursing.servicemodule.web.service.StaffPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StaffPostServiceImpl extends GenericServiceImpl<StaffPost, Long,StaffPostExample> implements StaffPostService {
    @Autowired
    private StaffPostMapper StaffPostDao;
    @Override
    public GenericDao<StaffPost, Long,StaffPostExample> getDao() {
        return StaffPostDao;
    }

}
