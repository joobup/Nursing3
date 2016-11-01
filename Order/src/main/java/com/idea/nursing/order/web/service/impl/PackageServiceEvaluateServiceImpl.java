package com.idea.nursing.order.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.order.web.dao.PackageServiceEvaluateMapper;
import com.idea.nursing.order.web.domain.pojo.PackageServiceEvaluate;
import com.idea.nursing.order.web.domain.pojo.PackageServiceEvaluateExample;
import com.idea.nursing.order.web.service.PackageServiceEvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PackageServiceEvaluateServiceImpl extends GenericServiceImpl<PackageServiceEvaluate, Long,PackageServiceEvaluateExample> implements PackageServiceEvaluateService {
    @Autowired
    private PackageServiceEvaluateMapper packageserviceevaluateDao;
    @Override
    public GenericDao<PackageServiceEvaluate, Long,PackageServiceEvaluateExample> getDao() {
        return packageserviceevaluateDao;
    }

}
