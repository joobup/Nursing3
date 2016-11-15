package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackState;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicePackStateMapper extends GenericDao {
    int countByExample(ServicePackStateExample example);

    int deleteByExample(ServicePackStateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServicePackState record);

    int insertSelective(ServicePackState record);

    List<ServicePackState> selectByExample(ServicePackStateExample example);

    ServicePackState selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServicePackState record, @Param("example") ServicePackStateExample example);

    int updateByExample(@Param("record") ServicePackState record, @Param("example") ServicePackStateExample example);

    int updateByPrimaryKeySelective(ServicePackState record);

    int updateByPrimaryKey(ServicePackState record);
}