package com.idea.nursing.cost.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.cost.web.domain.pojo.Cost;
import com.idea.nursing.cost.web.domain.pojo.CostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostMapper extends GenericDao {
    int countByExample(CostExample example);

    int deleteByExample(CostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Cost record);

    int insertSelective(Cost record);

    List<Cost> selectByExample(CostExample example);

    Cost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Cost record, @Param("example") CostExample example);

    int updateByExample(@Param("record") Cost record, @Param("example") CostExample example);

    int updateByPrimaryKeySelective(Cost record);

    int updateByPrimaryKey(Cost record);
}