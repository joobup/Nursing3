package com.idea.nursing.common.web.service;

import java.util.List;

/**
 * Created by 10238 on 2016/10/24.
 */
public interface MysqlFieldInfoService {

    public List<MysqlFileInfo> getMysqlFieldInfo(String tableName);
}
