package com.idea.nursing.order.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.order.web.dao.ExceptionTypeMapper;
import com.idea.nursing.order.web.domain.pojo.ExceptionType;
import com.idea.nursing.order.web.domain.pojo.ExceptionTypeExample;
import com.idea.nursing.order.web.service.ExceptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ExceptionTypeServiceImpl extends GenericServiceImpl<ExceptionType, Long,ExceptionTypeExample> implements ExceptionTypeService {
    @Autowired
    private ExceptionTypeMapper exceptiontypeDao;
    @Override
    public GenericDao<ExceptionType, Long,ExceptionTypeExample> getDao() {
        return exceptiontypeDao;
    }

}
