package com.idea.nursing.order.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.order.web.domain.pojo.OrderEvaluate;
import com.idea.nursing.order.web.domain.pojo.OrderEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderEvaluateMapper extends GenericDao {
    int countByExample(OrderEvaluateExample example);

    int deleteByExample(OrderEvaluateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderEvaluate record);

    int insertSelective(OrderEvaluate record);

    List<OrderEvaluate> selectByExample(OrderEvaluateExample example);

    OrderEvaluate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderEvaluate record, @Param("example") OrderEvaluateExample example);

    int updateByExample(@Param("record") OrderEvaluate record, @Param("example") OrderEvaluateExample example);

    int updateByPrimaryKeySelective(OrderEvaluate record);

    int updateByPrimaryKey(OrderEvaluate record);
}