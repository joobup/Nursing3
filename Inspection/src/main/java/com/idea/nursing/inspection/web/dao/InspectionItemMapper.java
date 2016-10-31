package com.idea.nursing.inspection.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItem;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionItemMapper extends GenericDao {
    int countByExample(InspectionItemExample example);

    int deleteByExample(InspectionItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectionItem record);

    int insertSelective(InspectionItem record);

    List<InspectionItem> selectByExample(InspectionItemExample example);

    InspectionItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectionItem record, @Param("example") InspectionItemExample example);

    int updateByExample(@Param("record") InspectionItem record, @Param("example") InspectionItemExample example);

    int updateByPrimaryKeySelective(InspectionItem record);

    int updateByPrimaryKey(InspectionItem record);
}