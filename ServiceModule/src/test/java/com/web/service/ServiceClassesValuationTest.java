package com.web.service;

import com.idea.nursing.core.feature.test.TestSupport;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuation;
import com.idea.nursing.servicemodule.web.service.ServiceClassesValuationService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by 10238 on 2016/10/13.
 */
public class ServiceClassesValuationTest extends TestSupport {
    @Autowired
    private ServiceClassesValuationService serviceClassesValuationService;

    @Test
    public void testAdd(){
        ServiceClassesValuation serviceClassesValuation = new ServiceClassesValuation();
        for (int i = 0;i<10;i++){
            serviceClassesValuation.setClassesValuationName("测试"+i);
            int result = serviceClassesValuationService.insert(serviceClassesValuation);
            System.out.println(result);
        }

    }

    @Test
    public void testselectAll(){
        List<ServiceClassesValuation> serviceClassesValuations = serviceClassesValuationService.findAll(1,100);
        for (ServiceClassesValuation serviceClassesValuation:serviceClassesValuations
             ) {
            System.out.println(serviceClassesValuation);
        }

    }

    @Test
    public void delTest(){
        serviceClassesValuationService.delete(1L);
        testselectAll();
    }

    @Test
    public void update(){
        ServiceClassesValuation serviceClassesValuation = new ServiceClassesValuation();
        serviceClassesValuation.setId(2L);
        serviceClassesValuation.setClassesValuationName("修改");
        serviceClassesValuationService.update(serviceClassesValuation);

        testselectAll();
    }
}
