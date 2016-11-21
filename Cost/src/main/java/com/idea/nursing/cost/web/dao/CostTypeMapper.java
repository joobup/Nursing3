package com.idea.nursing.cost.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.cost.web.domain.pojo.CostType;
import com.idea.nursing.cost.web.domain.pojo.CostTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostTypeMapper extends GenericDao {
    int countByExample(CostTypeExample example);

    int deleteByExample(CostTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CostType record);

    int insertSelective(CostType record);

    List<CostType> selectByExample(CostTypeExample example);

    CostType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CostType record, @Param("example") CostTypeExample example);

    int updateByExample(@Param("record") CostType record, @Param("example") CostTypeExample example);

    int updateByPrimaryKeySelective(CostType record);

    int updateByPrimaryKey(CostType record);
}