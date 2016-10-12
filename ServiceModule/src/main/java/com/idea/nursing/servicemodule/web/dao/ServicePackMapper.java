package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePack;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicePackMapper extends GenericDao {
    int countByExample(ServicePackExample example);

    int deleteByExample(ServicePackExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServicePack record);

    int insertSelective(ServicePack record);

    List<ServicePack> selectByExample(ServicePackExample example);

    ServicePack selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServicePack record, @Param("example") ServicePackExample example);

    int updateByExample(@Param("record") ServicePack record, @Param("example") ServicePackExample example);

    int updateByPrimaryKeySelective(ServicePack record);

    int updateByPrimaryKey(ServicePack record);
}