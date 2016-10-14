package com.web.service;

import com.idea.nursing.core.feature.test.TestSupport;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuation;
import com.idea.nursing.servicemodule.web.service.ServiceClassesValuationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by horo on 2016/10/14.
 */
public class ServiceClassesValutionTest extends TestSupport{
    @Autowired
    private ServiceClassesValuationService serviceClassesValuationsService;
    @Test
    public void add(){
        ServiceClassesValuation serviceClassesValuation = new ServiceClassesValuation();
        serviceClassesValuation.setClassesValuationName("xxx");
        serviceClassesValuationsService.insert(serviceClassesValuation);
        List<ServiceClassesValuation> s = serviceClassesValuationsService.findAll(1,10);
        for (ServiceClassesValuation ss:s
             ) {
            System.out.println(ss.getClassesValuationName());
        }
    }


}
