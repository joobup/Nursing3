package com.idea.nursing.order.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.order.web.domain.pojo.ServiceCommonOrder;
import com.idea.nursing.order.web.domain.pojo.ServiceCommonOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceCommonOrderMapper extends GenericDao {
    int countByExample(ServiceCommonOrderExample example);

    int deleteByExample(ServiceCommonOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceCommonOrder record);

    int insertSelective(ServiceCommonOrder record);

    List<ServiceCommonOrder> selectByExample(ServiceCommonOrderExample example);

    ServiceCommonOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceCommonOrder record, @Param("example") ServiceCommonOrderExample example);

    int updateByExample(@Param("record") ServiceCommonOrder record, @Param("example") ServiceCommonOrderExample example);

    int updateByPrimaryKeySelective(ServiceCommonOrder record);

    int updateByPrimaryKey(ServiceCommonOrder record);
}