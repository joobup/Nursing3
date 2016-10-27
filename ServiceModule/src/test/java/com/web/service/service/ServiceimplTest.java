package com.web.service.service;

import com.idea.nursing.servicemodule.web.domain.vo.ServiceStaffVO;
import com.idea.nursing.servicemodule.web.domain.vo.ServiceVO;
import com.idea.nursing.servicemodule.web.service.ServicesService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import java.util.List;

/**
 * Created by 10238 on 2016/10/26.
 */
@ContextConfiguration(locations = {"classpath*:applicationContext-service.xml"})
public class ServiceimplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private ServicesService servicesService;

    @Test
    public void testService() {
        List<ServiceVO> serviceStaffVOs = servicesService.findAllVO(1, 10).getResult();
        for (ServiceVO s :
                serviceStaffVOs) {
            System.out.println(s);
        }


    }

}
