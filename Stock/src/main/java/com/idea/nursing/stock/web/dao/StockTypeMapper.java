package com.idea.nursing.stock.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.stock.web.domain.pojo.StockType;
import com.idea.nursing.stock.web.domain.pojo.StockTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockTypeMapper extends GenericDao {
    int countByExample(StockTypeExample example);

    int deleteByExample(StockTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StockType record);

    int insertSelective(StockType record);

    List<StockType> selectByExample(StockTypeExample example);

    StockType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StockType record, @Param("example") StockTypeExample example);

    int updateByExample(@Param("record") StockType record, @Param("example") StockTypeExample example);

    int updateByPrimaryKeySelective(StockType record);

    int updateByPrimaryKey(StockType record);
}