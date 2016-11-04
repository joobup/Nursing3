package com.idea.nursing.order.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.order.web.dao.ExceptionTypeMapper;
import com.idea.nursing.order.web.domain.pojo.ExceptionType;
import com.idea.nursing.order.web.domain.pojo.ExceptionTypeExample;
import com.idea.nursing.order.web.service.ExceptionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class ExceptionTypeServiceImpl extends GenericServiceLevelImpl<ExceptionType, Long,ExceptionTypeExample> implements ExceptionTypeService {


        @Autowired
        private ExceptionTypeMapper exceptiontypeDao;
        @Override
        public GenericDao<ExceptionType, Long,ExceptionTypeExample> getDao() {
            return exceptiontypeDao;
        }

        @Override
        public ExceptionTypeExample getModelExamplTidEqualTo(Long tid) {
            ExceptionTypeExample exceptiontypeExample = new ExceptionTypeExample();
            exceptiontypeExample.createCriteria().andTidEqualTo(tid);
            return exceptiontypeExample;
        }

        @Override
        public byte getLevel(ExceptionType exceptiontype) {

            return exceptiontype.getExceptionTypeLevel();
        }

        @Override
        public Long getTid(ExceptionType exceptiontype) {
            return exceptiontype.getTid();
        }

        @Override
        public void setLevel(ExceptionType exceptiontype, Byte level) {
            exceptiontype.setExceptionTypeLevel(level);
        }

        @Override
        public void setTid(ExceptionType exceptiontype) {
            exceptiontype.setTid(0L);
        }


}
