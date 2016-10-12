package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.servicemodule.web.domain.pojo.ServiceStaff;
import com.idea.nursing.servicemodule.web.domain.pojo.ServiceStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceStaffMapper {
    int countByExample(ServiceStaffExample example);

    int deleteByExample(ServiceStaffExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServiceStaff record);

    int insertSelective(ServiceStaff record);

    List<ServiceStaff> selectByExample(ServiceStaffExample example);

    ServiceStaff selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServiceStaff record, @Param("example") ServiceStaffExample example);

    int updateByExample(@Param("record") ServiceStaff record, @Param("example") ServiceStaffExample example);

    int updateByPrimaryKeySelective(ServiceStaff record);

    int updateByPrimaryKey(ServiceStaff record);
}