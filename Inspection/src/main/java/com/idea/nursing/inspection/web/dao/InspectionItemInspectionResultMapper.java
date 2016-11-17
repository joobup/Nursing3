package com.idea.nursing.inspection.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemInspectionResult;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemInspectionResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionItemInspectionResultMapper extends GenericDao {
    int countByExample(InspectionItemInspectionResultExample example);

    int deleteByExample(InspectionItemInspectionResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectionItemInspectionResult record);

    int insertSelective(InspectionItemInspectionResult record);

    List<InspectionItemInspectionResult> selectByExample(InspectionItemInspectionResultExample example);

    InspectionItemInspectionResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectionItemInspectionResult record, @Param("example") InspectionItemInspectionResultExample example);

    int updateByExample(@Param("record") InspectionItemInspectionResult record, @Param("example") InspectionItemInspectionResultExample example);

    int updateByPrimaryKeySelective(InspectionItemInspectionResult record);

    int updateByPrimaryKey(InspectionItemInspectionResult record);
}