package com.idea.nursing.bed.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.bed.web.dao.BedTypePriceMapper;
import com.idea.nursing.bed.web.domain.pojo.BedTypePrice;
import com.idea.nursing.bed.web.domain.pojo.BedTypePriceExample;
import com.idea.nursing.bed.web.service.BedTypePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BedTypePriceServiceImpl extends GenericServiceImpl<BedTypePrice, Long,BedTypePriceExample> implements BedTypePriceService {
    @Autowired
    private BedTypePriceMapper bedtypepriceDao;
    @Override
    public GenericDao<BedTypePrice, Long,BedTypePriceExample> getDao() {
        return bedtypepriceDao;
    }

}
