package com.idea.nursing.inspection.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemSelectValue;
import com.idea.nursing.inspection.web.domain.pojo.InspectionItemSelectValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InspectionItemSelectValueMapper extends GenericDao {
    int countByExample(InspectionItemSelectValueExample example);

    int deleteByExample(InspectionItemSelectValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InspectionItemSelectValue record);

    int insertSelective(InspectionItemSelectValue record);

    List<InspectionItemSelectValue> selectByExample(InspectionItemSelectValueExample example);

    InspectionItemSelectValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InspectionItemSelectValue record, @Param("example") InspectionItemSelectValueExample example);

    int updateByExample(@Param("record") InspectionItemSelectValue record, @Param("example") InspectionItemSelectValueExample example);

    int updateByPrimaryKeySelective(InspectionItemSelectValue record);

    int updateByPrimaryKey(InspectionItemSelectValue record);
}