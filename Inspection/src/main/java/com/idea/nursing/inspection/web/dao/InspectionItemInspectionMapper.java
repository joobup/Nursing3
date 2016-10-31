package com.idea.nursing.inspection.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemInspection;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemInspectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionItemInspectionMapper extends GenericDao {
    int countByExample(InspectionItemInspectionExample example);

    int deleteByExample(InspectionItemInspectionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectionItemInspection record);

    int insertSelective(InspectionItemInspection record);

    List<InspectionItemInspection> selectByExample(InspectionItemInspectionExample example);

    InspectionItemInspection selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectionItemInspection record, @Param("example") InspectionItemInspectionExample example);

    int updateByExample(@Param("record") InspectionItemInspection record, @Param("example") InspectionItemInspectionExample example);

    int updateByPrimaryKeySelective(InspectionItemInspection record);

    int updateByPrimaryKey(InspectionItemInspection record);
}