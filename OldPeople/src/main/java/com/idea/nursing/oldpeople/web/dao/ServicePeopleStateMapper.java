package com.idea.nursing.oldpeople.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleState;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicePeopleStateMapper extends GenericDao {
    int countByExample(ServicePeopleStateExample example);

    int deleteByExample(ServicePeopleStateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServicePeopleState record);

    int insertSelective(ServicePeopleState record);

    List<ServicePeopleState> selectByExample(ServicePeopleStateExample example);

    ServicePeopleState selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServicePeopleState record, @Param("example") ServicePeopleStateExample example);

    int updateByExample(@Param("record") ServicePeopleState record, @Param("example") ServicePeopleStateExample example);

    int updateByPrimaryKeySelective(ServicePeopleState record);

    int updateByPrimaryKey(ServicePeopleState record);
}