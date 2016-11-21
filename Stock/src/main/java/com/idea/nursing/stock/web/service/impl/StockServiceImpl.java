package com.idea.nursing.stock.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;

import com.idea.nursing.stock.web.dao.StockMapper;
import com.idea.nursing.stock.web.domain.pojo.Stock;
import com.idea.nursing.stock.web.domain.pojo.StockExample;
import com.idea.nursing.stock.web.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class StockServiceImpl extends GenericServiceImpl<Stock, Long,StockExample> implements StockService {

       @Autowired
       private StockMapper stockDao;
       @Override
       public GenericDao<Stock, Long,StockExample> getDao() {
       return stockDao;
       }


}
