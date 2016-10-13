package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffPost;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffPostMapper extends GenericDao {
    int countByExample(StaffPostExample example);

    int deleteByExample(StaffPostExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StaffPost record);

    int insertSelective(StaffPost record);

    List<StaffPost> selectByExample(StaffPostExample example);

    StaffPost selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StaffPost record, @Param("example") StaffPostExample example);

    int updateByExample(@Param("record") StaffPost record, @Param("example") StaffPostExample example);

    int updateByPrimaryKeySelective(StaffPost record);

    int updateByPrimaryKey(StaffPost record);
}