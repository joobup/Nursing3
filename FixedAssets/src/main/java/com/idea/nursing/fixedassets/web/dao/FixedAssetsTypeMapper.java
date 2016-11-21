package com.idea.nursing.fixedassets.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsType;
import com.idea.nursing.fixedassets.web.domain.pojo.FixedAssetsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FixedAssetsTypeMapper extends GenericDao {
    int countByExample(FixedAssetsTypeExample example);

    int deleteByExample(FixedAssetsTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FixedAssetsType record);

    int insertSelective(FixedAssetsType record);

    List<FixedAssetsType> selectByExample(FixedAssetsTypeExample example);

    FixedAssetsType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FixedAssetsType record, @Param("example") FixedAssetsTypeExample example);

    int updateByExample(@Param("record") FixedAssetsType record, @Param("example") FixedAssetsTypeExample example);

    int updateByPrimaryKeySelective(FixedAssetsType record);

    int updateByPrimaryKey(FixedAssetsType record);
}