package com.idea.nursing.order.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.order.web.domain.pojo.Evaluate;
import com.idea.nursing.order.web.domain.pojo.EvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaluateMapper extends GenericDao {
    int countByExample(EvaluateExample example);

    int deleteByExample(EvaluateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    List<Evaluate> selectByExample(EvaluateExample example);

    Evaluate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByExample(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);
}