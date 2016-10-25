package service;

import com.idea.nursing.common.web.service.MysqlFieldInfoService;
import com.idea.nursing.core.feature.test.TestSupport;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MysqlFieldInfoServiceTest extends TestSupport {
    @Autowired
    private MysqlFieldInfoService mysqlFieldInfoService;

    @Test
    public void testgetFull() {
        List<MysqlFileInfo> mysqlFileInfos = mysqlFieldInfoService.getMysqlFieldInfo("u_role");
        System.out.println(mysqlFileInfos);
    }
}