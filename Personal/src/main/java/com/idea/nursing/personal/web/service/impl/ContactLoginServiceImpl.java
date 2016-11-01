package com.idea.nursing.personal.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.personal.web.dao.ContactLoginMapper;
import com.idea.nursing.personal.web.domain.pojo.ContactLogin;
import com.idea.nursing.personal.web.domain.pojo.ContactLoginExample;
import com.idea.nursing.personal.web.service.ContactLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ContactLoginServiceImpl extends GenericServiceImpl<ContactLogin, Long,ContactLoginExample> implements ContactLoginService {
    @Autowired
    private ContactLoginMapper contactloginDao;
    @Override
    public GenericDao<ContactLogin, Long,ContactLoginExample> getDao() {
        return contactloginDao;
    }

}
