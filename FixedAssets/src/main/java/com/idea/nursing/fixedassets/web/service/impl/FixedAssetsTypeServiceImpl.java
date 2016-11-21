package com.idea.nursing.fixedassets.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.fixedassets.web.dao.FixedAssetsTypeMapper;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsType;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsTypeExample;
import com.idea.nursing.fixedassets.web.service.FixedAssetsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class FixedAssetsTypeServiceImpl extends GenericServiceLevelImpl<FixedAssetsType, Long,FixedAssetsTypeExample> implements FixedAssetsTypeService {


        @Autowired
        private FixedAssetsTypeMapper fixedassetstypeDao;
        @Override
        public GenericDao<FixedAssetsType, Long,FixedAssetsTypeExample> getDao() {
            return fixedassetstypeDao;
        }

        @Override
        public FixedAssetsTypeExample getModelExamplTidEqualTo(Long tid) {
            FixedAssetsTypeExample fixedassetstypeExample = new FixedAssetsTypeExample();
            fixedassetstypeExample.createCriteria().andTidEqualTo(tid);
            return fixedassetstypeExample;
        }

        @Override
        public byte getLevel(FixedAssetsType fixedassetstype) {

            return fixedassetstype.getFixedAssetsTypeLevel();
        }

        @Override
        public Long getTid(FixedAssetsType fixedassetstype) {
            return fixedassetstype.getTid();
        }

        @Override
        public void setLevel(FixedAssetsType fixedassetstype, Byte level) {
            fixedassetstype.setFixedAssetsTypeLevel(level);
        }

        @Override
        public void setTid(FixedAssetsType fixedassetstype) {
            fixedassetstype.setTid(0L);
        }


}
