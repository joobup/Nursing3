package com.idea.nursing.bed.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.bed.web.dao.BedTypeMapper;
import com.idea.nursing.bed.web.domain.pojo.BedType;
import com.idea.nursing.bed.web.domain.pojo.BedTypeExample;
import com.idea.nursing.bed.web.service.BedTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class BedTypeServiceImpl extends GenericServiceLevelImpl<BedType, Long,BedTypeExample> implements BedTypeService {


        @Autowired
        private BedTypeMapper bedtypeDao;
        @Override
        public GenericDao<BedType, Long,BedTypeExample> getDao() {
            return bedtypeDao;
        }

        @Override
        public BedTypeExample getModelExamplTidEqualTo(Long tid) {
            BedTypeExample bedtypeExample = new BedTypeExample();
            bedtypeExample.createCriteria().andTidEqualTo(tid);
            return bedtypeExample;
        }

        @Override
        public byte getLevel(BedType bedtype) {

            return bedtype.getBedTypeLeave();
        }

        @Override
        public Long getTid(BedType bedtype) {
            return bedtype.getTid();
        }

        @Override
        public void setLevel(BedType bedtype, Byte level) {
            bedtype.setBedTypeLeave(level);
        }

        @Override
        public void setTid(BedType bedtype) {
            bedtype.setTid(0L);
        }


}
