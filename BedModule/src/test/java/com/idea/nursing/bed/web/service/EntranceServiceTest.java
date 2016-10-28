package com.idea.nursing.bed.web.service;

import com.idea.nursing.bed.web.domain.pojo.Entrance;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Created by 10238 on 2016/10/27.
 */
@ContextConfiguration(locations = {"classpath*:applicationContext-bed.xml"})
public class EntranceServiceTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private EntranceService entranceService;
    @Test
    public void testAdd(){
        Entrance entrance = new Entrance();
        entrance.setEntranceName("a");
        entrance.setEntranceNum((byte)1);
        entrance.setEntranceToalNum((byte)2);
        entrance.setFloorToalNum((byte)8);
        entranceService.insert(entrance);
    }

}
