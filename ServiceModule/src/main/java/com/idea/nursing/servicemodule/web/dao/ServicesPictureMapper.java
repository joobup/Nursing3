package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesPicture;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicesPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicesPictureMapper extends GenericDao {
    int countByExample(ServicesPictureExample example);

    int deleteByExample(ServicesPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServicesPicture record);

    int insertSelective(ServicesPicture record);

    List<ServicesPicture> selectByExample(ServicesPictureExample example);

    ServicesPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServicesPicture record, @Param("example") ServicesPictureExample example);

    int updateByExample(@Param("record") ServicesPicture record, @Param("example") ServicesPictureExample example);

    int updateByPrimaryKeySelective(ServicesPicture record);

    int updateByPrimaryKey(ServicesPicture record);
}