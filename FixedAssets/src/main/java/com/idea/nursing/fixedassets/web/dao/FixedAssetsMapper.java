package com.idea.nursing.fixedassets.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssets;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FixedAssetsMapper extends GenericDao {
    int countByExample(FixedAssetsExample example);

    int deleteByExample(FixedAssetsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FixedAssets record);

    int insertSelective(FixedAssets record);

    List<FixedAssets> selectByExample(FixedAssetsExample example);

    FixedAssets selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FixedAssets record, @Param("example") FixedAssetsExample example);

    int updateByExample(@Param("record") FixedAssets record, @Param("example") FixedAssetsExample example);

    int updateByPrimaryKeySelective(FixedAssets record);

    int updateByPrimaryKey(FixedAssets record);
}