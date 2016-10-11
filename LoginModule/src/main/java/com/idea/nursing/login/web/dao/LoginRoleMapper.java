package com.idea.nursing.login.web.dao;

import com.idea.nursing.login.web.domain.pojo.LoginRole;
import com.idea.nursing.login.web.domain.pojo.LoginRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginRoleMapper {
    int countByExample(LoginRoleExample example);

    int deleteByExample(LoginRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoginRole record);

    int insertSelective(LoginRole record);

    List<LoginRole> selectByExample(LoginRoleExample example);

    LoginRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoginRole record, @Param("example") LoginRoleExample example);

    int updateByExample(@Param("record") LoginRole record, @Param("example") LoginRoleExample example);

    int updateByPrimaryKeySelective(LoginRole record);

    int updateByPrimaryKey(LoginRole record);
}