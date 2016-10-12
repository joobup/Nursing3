package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.servicemodule.web.domain.pojo.Nurseify;
import com.idea.nursing.servicemodule.web.domain.pojo.NurseifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NurseifyMapper {
    int countByExample(NurseifyExample example);

    int deleteByExample(NurseifyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Nurseify record);

    int insertSelective(Nurseify record);

    List<Nurseify> selectByExample(NurseifyExample example);

    Nurseify selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Nurseify record, @Param("example") NurseifyExample example);

    int updateByExample(@Param("record") Nurseify record, @Param("example") NurseifyExample example);

    int updateByPrimaryKeySelective(Nurseify record);

    int updateByPrimaryKey(Nurseify record);
}