package com.idea.nursing.order.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.order.web.domain.pojo.ExceptionType;
import com.idea.nursing.order.web.domain.pojo.ExceptionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ExceptionTypeMapper extends GenericDao {
    int countByExample(ExceptionTypeExample example);

    int deleteByExample(ExceptionTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ExceptionType record);

    int insertSelective(ExceptionType record);

    List<ExceptionType> selectByExample(ExceptionTypeExample example);

    ExceptionType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ExceptionType record, @Param("example") ExceptionTypeExample example);

    int updateByExample(@Param("record") ExceptionType record, @Param("example") ExceptionTypeExample example);

    int updateByPrimaryKeySelective(ExceptionType record);

    int updateByPrimaryKey(ExceptionType record);
}