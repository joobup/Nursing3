package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClasses;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceClassesMapper {
    int countByExample(ServiceClassesExample example);

    int deleteByExample(ServiceClassesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceClasses record);

    int insertSelective(ServiceClasses record);

    List<ServiceClasses> selectByExample(ServiceClassesExample example);

    ServiceClasses selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceClasses record, @Param("example") ServiceClassesExample example);

    int updateByExample(@Param("record") ServiceClasses record, @Param("example") ServiceClassesExample example);

    int updateByPrimaryKeySelective(ServiceClasses record);

    int updateByPrimaryKey(ServiceClasses record);
}