package com.idea.nursing.personal.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.personal.web.dao.ContactMapper;
import com.idea.nursing.personal.web.domain.pojo.Contact;
import com.idea.nursing.personal.web.domain.pojo.ContactExample;
import com.idea.nursing.personal.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ContactServiceImpl extends GenericServiceImpl<Contact, Long,ContactExample> implements ContactService {
    @Autowired
    private ContactMapper contactDao;
    @Override
    public GenericDao<Contact, Long,ContactExample> getDao() {
        return contactDao;
    }

}
