package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuationRelation;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceClassesValuationRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceClassesValuationRelationMapper {
    int countByExample(ServiceClassesValuationRelationExample example);

    int deleteByExample(ServiceClassesValuationRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceClassesValuationRelation record);

    int insertSelective(ServiceClassesValuationRelation record);

    List<ServiceClassesValuationRelation> selectByExample(ServiceClassesValuationRelationExample example);

    ServiceClassesValuationRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceClassesValuationRelation record, @Param("example") ServiceClassesValuationRelationExample example);

    int updateByExample(@Param("record") ServiceClassesValuationRelation record, @Param("example") ServiceClassesValuationRelationExample example);

    int updateByPrimaryKeySelective(ServiceClassesValuationRelation record);

    int updateByPrimaryKey(ServiceClassesValuationRelation record);
}