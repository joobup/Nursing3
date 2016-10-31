package com.idea.nursing.oldpeople.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleRegister;
import com.idea.nursing.oldpeople.web.domain.pojo.ServicePeopleRegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicePeopleRegisterMapper extends GenericDao {
    int countByExample(ServicePeopleRegisterExample example);

    int deleteByExample(ServicePeopleRegisterExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServicePeopleRegister record);

    int insertSelective(ServicePeopleRegister record);

    List<ServicePeopleRegister> selectByExample(ServicePeopleRegisterExample example);

    ServicePeopleRegister selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServicePeopleRegister record, @Param("example") ServicePeopleRegisterExample example);

    int updateByExample(@Param("record") ServicePeopleRegister record, @Param("example") ServicePeopleRegisterExample example);

    int updateByPrimaryKeySelective(ServicePeopleRegister record);

    int updateByPrimaryKey(ServicePeopleRegister record);
}