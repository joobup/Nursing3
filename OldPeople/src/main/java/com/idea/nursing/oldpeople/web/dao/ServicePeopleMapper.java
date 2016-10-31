package com.idea.nursing.oldpeople.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeople;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicePeopleMapper extends GenericDao {
    int countByExample(ServicePeopleExample example);

    int deleteByExample(ServicePeopleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServicePeople record);

    int insertSelective(ServicePeople record);

    List<ServicePeople> selectByExample(ServicePeopleExample example);

    ServicePeople selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServicePeople record, @Param("example") ServicePeopleExample example);

    int updateByExample(@Param("record") ServicePeople record, @Param("example") ServicePeopleExample example);

    int updateByPrimaryKeySelective(ServicePeople record);

    int updateByPrimaryKey(ServicePeople record);
}