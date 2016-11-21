package com.idea.nursing.fixedassets.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;

import com.idea.nursing.fixedassets.web.dao.FixedAssetsLogMapper;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsLog;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsLogExample;
import com.idea.nursing.fixedassets.web.service.FixedAssetsLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class FixedAssetsLogServiceImpl extends GenericServiceImpl<FixedAssetsLog, Long,FixedAssetsLogExample> implements FixedAssetsLogService {

       @Autowired
       private FixedAssetsLogMapper fixedassetslogDao;
       @Override
       public GenericDao<FixedAssetsLog, Long,FixedAssetsLogExample> getDao() {
       return fixedassetslogDao;
       }


}
