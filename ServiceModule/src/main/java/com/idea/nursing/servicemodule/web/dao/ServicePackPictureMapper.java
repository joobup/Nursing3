package com.idea.nursing.servicemodule.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackPicture;
import com.idea.nursing.servicemodule.web.domain.pojo.ServicePackPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicePackPictureMapper extends GenericDao {
    int countByExample(ServicePackPictureExample example);

    int deleteByExample(ServicePackPictureExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ServicePackPicture record);

    int insertSelective(ServicePackPicture record);

    List<ServicePackPicture> selectByExample(ServicePackPictureExample example);

    ServicePackPicture selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ServicePackPicture record, @Param("example") ServicePackPictureExample example);

    int updateByExample(@Param("record") ServicePackPicture record, @Param("example") ServicePackPictureExample example);

    int updateByPrimaryKeySelective(ServicePackPicture record);

    int updateByPrimaryKey(ServicePackPicture record);
}