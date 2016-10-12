package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffDepartment;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffDepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffDepartmentMapper extends GenericDao {
    int countByExample(StaffDepartmentExample example);

    int deleteByExample(StaffDepartmentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StaffDepartment record);

    int insertSelective(StaffDepartment record);

    List<StaffDepartment> selectByExample(StaffDepartmentExample example);

    StaffDepartment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StaffDepartment record, @Param("example") StaffDepartmentExample example);

    int updateByExample(@Param("record") StaffDepartment record, @Param("example") StaffDepartmentExample example);

    int updateByPrimaryKeySelective(StaffDepartment record);

    int updateByPrimaryKey(StaffDepartment record);
}