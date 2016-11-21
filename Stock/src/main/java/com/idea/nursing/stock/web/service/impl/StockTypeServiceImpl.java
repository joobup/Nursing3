package com.idea.nursing.stock.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceLevelImpl;

import com.idea.nursing.stock.web.dao.StockTypeMapper;
import com.idea.nursing.stock.web.domain.pojo.StockType;
import com.idea.nursing.stock.web.domain.pojo.StockTypeExample;
import com.idea.nursing.stock.web.service.StockTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
    public class StockTypeServiceImpl extends GenericServiceLevelImpl<StockType, Long,StockTypeExample> implements StockTypeService {


        @Autowired
        private StockTypeMapper stocktypeDao;
        @Override
        public GenericDao<StockType, Long,StockTypeExample> getDao() {
            return stocktypeDao;
        }

        @Override
        public StockTypeExample getModelExamplTidEqualTo(Long tid) {
            StockTypeExample stocktypeExample = new StockTypeExample();
            stocktypeExample.createCriteria().andTidEqualTo(tid);
            return stocktypeExample;
        }

        @Override
        public byte getLevel(StockType stocktype) {

            return stocktype.getStockTypeLevel();
        }

        @Override
        public Long getTid(StockType stocktype) {
            return stocktype.getTid();
        }

        @Override
        public void setLevel(StockType stocktype, Byte level) {
            stocktype.setStockTypeLevel(level);
        }

        @Override
        public void setTid(StockType stocktype) {
            stocktype.setTid(0L);
        }


}
