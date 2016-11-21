package com.idea.nursing.fixedassets.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsLog;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FixedAssetsLogMapper extends GenericDao {
    int countByExample(FixedAssetsLogExample example);

    int deleteByExample(FixedAssetsLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FixedAssetsLog record);

    int insertSelective(FixedAssetsLog record);

    List<FixedAssetsLog> selectByExample(FixedAssetsLogExample example);

    FixedAssetsLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FixedAssetsLog record, @Param("example") FixedAssetsLogExample example);

    int updateByExample(@Param("record") FixedAssetsLog record, @Param("example") FixedAssetsLogExample example);

    int updateByPrimaryKeySelective(FixedAssetsLog record);

    int updateByPrimaryKey(FixedAssetsLog record);
}