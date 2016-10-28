package com.idea.nursing.bed.web.dao;

import com.idea.nursing.bed.web.domain.pojo.Entrance;
import com.idea.nursing.bed.web.domain.pojo.EntranceExample;
import com.idea.nursing.core.generic.GenericDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EntranceMapper extends GenericDao {
    int countByExample(EntranceExample example);

    int deleteByExample(EntranceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Entrance record);

    int insertSelective(Entrance record);

    List<Entrance> selectByExample(EntranceExample example);

    Entrance selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Entrance record, @Param("example") EntranceExample example);

    int updateByExample(@Param("record") Entrance record, @Param("example") EntranceExample example);

    int updateByPrimaryKeySelective(Entrance record);

    int updateByPrimaryKey(Entrance record);
}