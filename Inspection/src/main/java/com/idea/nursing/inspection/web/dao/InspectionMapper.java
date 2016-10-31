package com.idea.nursing.inspection.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.inspection.web.domain.pojo.Inspection;
import com.idea.nursing.inspection.web.domain.pojo.InspectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionMapper extends GenericDao {
    int countByExample(InspectionExample example);

    int deleteByExample(InspectionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Inspection record);

    int insertSelective(Inspection record);

    List<Inspection> selectByExample(InspectionExample example);

    Inspection selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Inspection record, @Param("example") InspectionExample example);

    int updateByExample(@Param("record") Inspection record, @Param("example") InspectionExample example);

    int updateByPrimaryKeySelective(Inspection record);

    int updateByPrimaryKey(Inspection record);
}