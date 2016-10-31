package com.idea.nursing.order.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.order.web.domain.pojo.ServiceOrderUser;
import com.idea.nursing.order.web.domain.pojo.ServiceOrderUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceOrderUserMapper extends GenericDao {
    int countByExample(ServiceOrderUserExample example);

    int deleteByExample(ServiceOrderUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceOrderUser record);

    int insertSelective(ServiceOrderUser record);

    List<ServiceOrderUser> selectByExample(ServiceOrderUserExample example);

    ServiceOrderUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceOrderUser record, @Param("example") ServiceOrderUserExample example);

    int updateByExample(@Param("record") ServiceOrderUser record, @Param("example") ServiceOrderUserExample example);

    int updateByPrimaryKeySelective(ServiceOrderUser record);

    int updateByPrimaryKey(ServiceOrderUser record);
}