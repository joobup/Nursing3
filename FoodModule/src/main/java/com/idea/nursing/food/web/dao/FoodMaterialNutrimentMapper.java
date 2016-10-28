package com.idea.nursing.food.web.dao;

import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.food.web.domain.pojo.FoodMaterialNutriment;
import com.idea.nursing.food.web.domain.pojo.FoodMaterialNutrimentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMaterialNutrimentMapper extends GenericDao {
    int countByExample(FoodMaterialNutrimentExample example);

    int deleteByExample(FoodMaterialNutrimentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FoodMaterialNutriment record);

    int insertSelective(FoodMaterialNutriment record);

    List<FoodMaterialNutriment> selectByExample(FoodMaterialNutrimentExample example);

    FoodMaterialNutriment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FoodMaterialNutriment record, @Param("example") FoodMaterialNutrimentExample example);

    int updateByExample(@Param("record") FoodMaterialNutriment record, @Param("example") FoodMaterialNutrimentExample example);

    int updateByPrimaryKeySelective(FoodMaterialNutriment record);

    int updateByPrimaryKey(FoodMaterialNutriment record);
}