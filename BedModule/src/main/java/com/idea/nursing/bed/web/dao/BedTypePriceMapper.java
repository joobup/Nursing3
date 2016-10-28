package com.idea.nursing.bed.web.dao;

import com.idea.nursing.bed.web.domain.pojo.BedTypePrice;
import com.idea.nursing.bed.web.domain.pojo.BedTypePriceExample;
import com.idea.nursing.core.generic.GenericDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BedTypePriceMapper extends GenericDao {
    int countByExample(BedTypePriceExample example);

    int deleteByExample(BedTypePriceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BedTypePrice record);

    int insertSelective(BedTypePrice record);

    List<BedTypePrice> selectByExample(BedTypePriceExample example);

    BedTypePrice selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BedTypePrice record, @Param("example") BedTypePriceExample example);

    int updateByExample(@Param("record") BedTypePrice record, @Param("example") BedTypePriceExample example);

    int updateByPrimaryKeySelective(BedTypePrice record);

    int updateByPrimaryKey(BedTypePrice record);
}