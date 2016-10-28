package com.idea.nursing.bed.web.dao;

import com.idea.nursing.bed.web.domain.pojo.BedType;
import com.idea.nursing.bed.web.domain.pojo.BedTypeExample;
import com.idea.nursing.core.generic.GenericDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BedTypeMapper extends GenericDao {
    int countByExample(BedTypeExample example);

    int deleteByExample(BedTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BedType record);

    int insertSelective(BedType record);

    List<BedType> selectByExample(BedTypeExample example);

    BedType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BedType record, @Param("example") BedTypeExample example);

    int updateByExample(@Param("record") BedType record, @Param("example") BedTypeExample example);

    int updateByPrimaryKeySelective(BedType record);

    int updateByPrimaryKey(BedType record);
}