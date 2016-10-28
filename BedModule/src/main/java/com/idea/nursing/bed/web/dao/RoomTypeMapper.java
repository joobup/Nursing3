package com.idea.nursing.bed.web.dao;

import com.idea.nursing.bed.web.domain.pojo.RoomType;
import com.idea.nursing.bed.web.domain.pojo.RoomTypeExample;
import com.idea.nursing.core.generic.GenericDao;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomTypeMapper extends GenericDao {
    int countByExample(RoomTypeExample example);

    int deleteByExample(RoomTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RoomType record);

    int insertSelective(RoomType record);

    List<RoomType> selectByExample(RoomTypeExample example);

    RoomType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RoomType record, @Param("example") RoomTypeExample example);

    int updateByExample(@Param("record") RoomType record, @Param("example") RoomTypeExample example);

    int updateByPrimaryKeySelective(RoomType record);

    int updateByPrimaryKey(RoomType record);
}