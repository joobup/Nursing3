package com.idea.nursing.food.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.food.web.domain.pojo.FoodMaterial;
import com.idea.nursing.food.web.domain.pojo.FoodMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMaterialMapper extends GenericDao {
    int countByExample(FoodMaterialExample example);

    int deleteByExample(FoodMaterialExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodMaterial record);

    int insertSelective(FoodMaterial record);

    List<FoodMaterial> selectByExample(FoodMaterialExample example);

    FoodMaterial selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodMaterial record, @Param("example") FoodMaterialExample example);

    int updateByExample(@Param("record") FoodMaterial record, @Param("example") FoodMaterialExample example);

    int updateByPrimaryKeySelective(FoodMaterial record);

    int updateByPrimaryKey(FoodMaterial record);
}