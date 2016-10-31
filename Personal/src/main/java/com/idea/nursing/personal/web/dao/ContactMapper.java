package com.idea.nursing.personal.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.personal.web.domain.pojo.Contact;
import com.idea.nursing.personal.web.domain.pojo.ContactExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContactMapper extends GenericDao {
    int countByExample(ContactExample example);

    int deleteByExample(ContactExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Contact record);

    int insertSelective(Contact record);

    List<Contact> selectByExample(ContactExample example);

    Contact selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Contact record, @Param("example") ContactExample example);

    int updateByExample(@Param("record") Contact record, @Param("example") ContactExample example);

    int updateByPrimaryKeySelective(Contact record);

    int updateByPrimaryKey(Contact record);
}