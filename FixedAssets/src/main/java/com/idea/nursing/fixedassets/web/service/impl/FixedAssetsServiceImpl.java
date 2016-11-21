package com.idea.nursing.fixedassets.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;

import com.idea.nursing.fixedassets.web.dao.FixedAssetsMapper;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssets;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsExample;
import com.idea.nursing.fixedassets.web.service.FixedAssetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class FixedAssetsServiceImpl extends GenericServiceImpl<FixedAssets, Long,FixedAssetsExample> implements FixedAssetsService {

       @Autowired
       private FixedAssetsMapper fixedassetsDao;
       @Override
       public GenericDao<FixedAssets, Long,FixedAssetsExample> getDao() {
       return fixedassetsDao;
       }


}
