package com.idea.nursing.cost.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.cost.web.dao.CostTypeMapper;
import com.idea.nursing.cost.web.domain.pojo.CostType;
import com.idea.nursing.cost.web.domain.pojo.CostTypeExample;
import com.idea.nursing.cost.web.service.CostTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class CostTypeServiceImpl extends GenericServiceLevelImpl<CostType, Long,CostTypeExample> implements CostTypeService {


        @Autowired
        private CostTypeMapper costtypeDao;
        @Override
        public GenericDao<CostType, Long,CostTypeExample> getDao() {
            return costtypeDao;
        }

        @Override
        public CostTypeExample getModelExamplTidEqualTo(Long tid) {
            CostTypeExample costtypeExample = new CostTypeExample();
            costtypeExample.createCriteria().andTidEqualTo(tid);
            return costtypeExample;
        }

        @Override
        public byte getLevel(CostType costtype) {

            return costtype.getCostTypeLevel();
        }

        @Override
        public Long getTid(CostType costtype) {
            return costtype.getTid();
        }

        @Override
        public void setLevel(CostType costtype, Byte level) {
            costtype.setCostTypeLevel(level);
        }

        @Override
        public void setTid(CostType costtype) {
            costtype.setTid(0L);
        }


}
