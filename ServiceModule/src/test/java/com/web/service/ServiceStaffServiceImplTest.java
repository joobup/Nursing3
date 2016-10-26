package com.web.service;

import com.idea.nursing.core.feature.test.TestSupport;
import com.idea.nursing.servicemodule.web.domain.vo.ServiceStaffVO;
import com.idea.nursing.servicemodule.web.service.ServiceStaffServiceMyself;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.List;

@ContextConfiguration(locations = {"classpath*:/applicationContext-service.xml"})
public class ServiceStaffServiceImplTest extends AbstractJUnit4SpringContextTests {
    @Autowired
   private ServiceStaffServiceMyself serviceStaffServiceMyself;

    @Test
    public void testFindAllVO(){
        List<ServiceStaffVO> serviceStaffVOs = serviceStaffServiceMyself.findAllVO(1,10).getResult();
        for (ServiceStaffVO s :
                serviceStaffVOs) {
            System.out.println(s);
        }

    }
    
}