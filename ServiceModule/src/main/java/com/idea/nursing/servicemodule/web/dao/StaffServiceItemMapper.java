package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffServiceItem;
import com.idea.nursing.servicemodule.web.domain.pojo.StaffServiceItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffServiceItemMapper extends GenericDao {
    int countByExample(StaffServiceItemExample example);

    int deleteByExample(StaffServiceItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StaffServiceItem record);

    int insertSelective(StaffServiceItem record);

    List<StaffServiceItem> selectByExample(StaffServiceItemExample example);

    StaffServiceItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StaffServiceItem record, @Param("example") StaffServiceItemExample example);

    int updateByExample(@Param("record") StaffServiceItem record, @Param("example") StaffServiceItemExample example);

    int updateByPrimaryKeySelective(StaffServiceItem record);

    int updateByPrimaryKey(StaffServiceItem record);
}