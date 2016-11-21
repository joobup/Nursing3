package com.idea.nursing.stock.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;

import com.idea.nursing.stock.web.dao.StockLogMapper;
import com.idea.nursing.stock.web.domain.pojo.StockLog;
import com.idea.nursing.stock.web.domain.pojo.StockLogExample;
import com.idea.nursing.stock.web.service.StockLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class StockLogServiceImpl extends GenericServiceImpl<StockLog, Long,StockLogExample> implements StockLogService {

       @Autowired
       private StockLogMapper stocklogDao;
       @Override
       public GenericDao<StockLog, Long,StockLogExample> getDao() {
       return stocklogDao;
       }


}
