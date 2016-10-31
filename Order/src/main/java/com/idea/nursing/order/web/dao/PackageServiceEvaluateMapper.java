package com.idea.nursing.order.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.order.web.domain.pojo.PackageServiceEvaluate;
import com.idea.nursing.order.web.domain.pojo.PackageServiceEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackageServiceEvaluateMapper extends GenericDao {
    int countByExample(PackageServiceEvaluateExample example);

    int deleteByExample(PackageServiceEvaluateExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PackageServiceEvaluate record);

    int insertSelective(PackageServiceEvaluate record);

    List<PackageServiceEvaluate> selectByExample(PackageServiceEvaluateExample example);

    PackageServiceEvaluate selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PackageServiceEvaluate record, @Param("example") PackageServiceEvaluateExample example);

    int updateByExample(@Param("record") PackageServiceEvaluate record, @Param("example") PackageServiceEvaluateExample example);

    int updateByPrimaryKeySelective(PackageServiceEvaluate record);

    int updateByPrimaryKey(PackageServiceEvaluate record);
}