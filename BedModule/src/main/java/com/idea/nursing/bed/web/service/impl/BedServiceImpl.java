package com.idea.nursing.bed.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;

import com.idea.nursing.bed.web.dao.BedMapper;
import com.idea.nursing.bed.web.domain.pojo.Bed;
import com.idea.nursing.bed.web.domain.pojo.BedExample;
import com.idea.nursing.bed.web.service.BedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class BedServiceImpl extends GenericServiceImpl<Bed, Long,BedExample> implements BedService {

       @Autowired
       private BedMapper bedDao;
       @Override
       public GenericDao<Bed, Long,BedExample> getDao() {
       return bedDao;
       }


}
