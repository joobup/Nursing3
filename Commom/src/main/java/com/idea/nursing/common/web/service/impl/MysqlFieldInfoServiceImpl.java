package com.idea.nursing.common.web.service.impl;

import com.idea.nursing.common.web.service.MysqlFieldInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 10238 on 2016/10/24.
 */
@Service
public class MysqlFieldInfoServiceImpl implements MysqlFieldInfoService {
    @Autowired
    private MysqlFieldInfoMapper mysqlFieldInfoMapper;
    @Override
    public List<MysqlFileInfo> getMysqlFieldInfo(String tableName) {


        return  mysqlFieldInfoMapper.getFullInfo(tableName);
    }
}
