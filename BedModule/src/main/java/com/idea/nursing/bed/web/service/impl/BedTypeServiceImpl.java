package com.idea.nursing.bed.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.bed.web.dao.BedTypeMapper;
import com.idea.nursing.bed.web.domain.pojo.BedType;
import com.idea.nursing.bed.web.domain.pojo.BedTypeExample;
import com.idea.nursing.bed.web.service.BedTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BedTypeServiceImpl extends GenericServiceImpl<BedType, Long,BedTypeExample> implements BedTypeService {
    @Autowired
    private BedTypeMapper bedtypeDao;
    @Override
    public GenericDao<BedType, Long,BedTypeExample> getDao() {
        return bedtypeDao;
    }

}
