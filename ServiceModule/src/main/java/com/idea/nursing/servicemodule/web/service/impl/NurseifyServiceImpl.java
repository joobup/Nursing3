package com.idea.nursing.servicemodule.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.servicemodule.web.dao.NurseifyMapper;
import com.idea.nursing.servicemodule.web.domain.pojo.Nurseify;
import com.idea.nursing.servicemodule.web.domain.pojo.NurseifyExample;
import com.idea.nursing.servicemodule.web.service.NurseifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class NurseifyServiceImpl extends GenericServiceImpl<Nurseify, Long,NurseifyExample> implements NurseifyService {
    @Autowired
    private NurseifyMapper NurseifyDao;
    @Override
    public GenericDao<Nurseify, Long,NurseifyExample> getDao() {
        return NurseifyDao;
    }

}
