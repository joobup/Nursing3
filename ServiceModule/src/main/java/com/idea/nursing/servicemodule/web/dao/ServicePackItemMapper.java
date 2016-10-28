package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackItem;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicePackItemMapper extends GenericDao {
    int countByExample(ServicePackItemExample example);

    int deleteByExample(ServicePackItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServicePackItem record);

    int insertSelective(ServicePackItem record);

    List<ServicePackItem> selectByExample(ServicePackItemExample example);

    ServicePackItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServicePackItem record, @Param("example") ServicePackItemExample example);

    int updateByExample(@Param("record") ServicePackItem record, @Param("example") ServicePackItemExample example);

    int updateByPrimaryKeySelective(ServicePackItem record);

    int updateByPrimaryKey(ServicePackItem record);
}