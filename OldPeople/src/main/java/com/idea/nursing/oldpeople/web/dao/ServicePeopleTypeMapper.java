package com.idea.nursing.oldpeople.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleType;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicePeopleTypeMapper extends GenericDao {
    int countByExample(ServicePeopleTypeExample example);

    int deleteByExample(ServicePeopleTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServicePeopleType record);

    int insertSelective(ServicePeopleType record);

    List<ServicePeopleType> selectByExample(ServicePeopleTypeExample example);

    ServicePeopleType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServicePeopleType record, @Param("example") ServicePeopleTypeExample example);

    int updateByExample(@Param("record") ServicePeopleType record, @Param("example") ServicePeopleTypeExample example);

    int updateByPrimaryKeySelective(ServicePeopleType record);

    int updateByPrimaryKey(ServicePeopleType record);
}