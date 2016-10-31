package com.idea.nursing.order.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.order.web.domain.pojo.Complaint;
import com.idea.nursing.order.web.domain.pojo.ComplaintExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplaintMapper extends GenericDao {
    int countByExample(ComplaintExample example);

    int deleteByExample(ComplaintExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Complaint record);

    int insertSelective(Complaint record);

    List<Complaint> selectByExampleWithBLOBs(ComplaintExample example);

    List<Complaint> selectByExample(ComplaintExample example);

    Complaint selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByExampleWithBLOBs(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByExample(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByPrimaryKeySelective(Complaint record);

    int updateByPrimaryKeyWithBLOBs(Complaint record);

    int updateByPrimaryKey(Complaint record);
}