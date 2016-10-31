package com.idea.nursing.order.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.order.web.domain.pojo.ComplaintEvent;
import com.idea.nursing.order.web.domain.pojo.ComplaintEventExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplaintEventMapper extends GenericDao {
    int countByExample(ComplaintEventExample example);

    int deleteByExample(ComplaintEventExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ComplaintEvent record);

    int insertSelective(ComplaintEvent record);

    List<ComplaintEvent> selectByExample(ComplaintEventExample example);

    ComplaintEvent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ComplaintEvent record, @Param("example") ComplaintEventExample example);

    int updateByExample(@Param("record") ComplaintEvent record, @Param("example") ComplaintEventExample example);

    int updateByPrimaryKeySelective(ComplaintEvent record);

    int updateByPrimaryKey(ComplaintEvent record);
}