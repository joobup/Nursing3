package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuation;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceClassesValuationMapper extends GenericDao {
    int countByExample(ServiceClassesValuationExample example);

    int deleteByExample(ServiceClassesValuationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceClassesValuation record);

    int insertSelective(ServiceClassesValuation record);

    List<ServiceClassesValuation> selectByExample(ServiceClassesValuationExample example);

    ServiceClassesValuation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceClassesValuation record, @Param("example") ServiceClassesValuationExample example);

    int updateByExample(@Param("record") ServiceClassesValuation record, @Param("example") ServiceClassesValuationExample example);

    int updateByPrimaryKeySelective(ServiceClassesValuation record);

    int updateByPrimaryKey(ServiceClassesValuation record);
}