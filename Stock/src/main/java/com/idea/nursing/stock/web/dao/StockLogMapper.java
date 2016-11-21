package com.idea.nursing.stock.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.stock.web.domain.pojo.StockLog;
import com.idea.nursing.stock.web.domain.pojo.StockLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockLogMapper extends GenericDao {
    int countByExample(StockLogExample example);

    int deleteByExample(StockLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StockLog record);

    int insertSelective(StockLog record);

    List<StockLog> selectByExample(StockLogExample example);

    StockLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StockLog record, @Param("example") StockLogExample example);

    int updateByExample(@Param("record") StockLog record, @Param("example") StockLogExample example);

    int updateByPrimaryKeySelective(StockLog record);

    int updateByPrimaryKey(StockLog record);
}