package com.idea.nursing.order.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.order.web.domain.pojo.ServiceOrder;
import com.idea.nursing.order.web.domain.pojo.ServiceOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceOrderMapper extends GenericDao {
    int countByExample(ServiceOrderExample example);

    int deleteByExample(ServiceOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceOrder record);

    int insertSelective(ServiceOrder record);

    List<ServiceOrder> selectByExample(ServiceOrderExample example);

    ServiceOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceOrder record, @Param("example") ServiceOrderExample example);

    int updateByExample(@Param("record") ServiceOrder record, @Param("example") ServiceOrderExample example);

    int updateByPrimaryKeySelective(ServiceOrder record);

    int updateByPrimaryKey(ServiceOrder record);
}