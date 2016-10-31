package com.idea.nursing.personal.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.personal.web.domain.pojo.ContactLogin;
import com.idea.nursing.personal.web.domain.pojo.ContactLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactLoginMapper extends GenericDao {
    int countByExample(ContactLoginExample example);

    int deleteByExample(ContactLoginExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ContactLogin record);

    int insertSelective(ContactLogin record);

    List<ContactLogin> selectByExample(ContactLoginExample example);

    ContactLogin selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ContactLogin record, @Param("example") ContactLoginExample example);

    int updateByExample(@Param("record") ContactLogin record, @Param("example") ContactLoginExample example);

    int updateByPrimaryKeySelective(ContactLogin record);

    int updateByPrimaryKey(ContactLogin record);
}