package com.idea.nursing.food.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.food.web.dao.FoodMaterialNutrimentMapper;
import com.idea.nursing.food.web.domain.pojo.FoodMaterialNutriment;
import com.idea.nursing.food.web.domain.pojo.FoodMaterialNutrimentExample;
import com.idea.nursing.food.service.FoodMaterialNutrimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FoodMaterialNutrimentServiceImpl extends GenericServiceImpl<FoodMaterialNutriment, Long,FoodMaterialNutrimentExample> implements FoodMaterialNutrimentService {
    @Autowired
    private FoodMaterialNutrimentMapper foodmaterialnutrimentDao;
    @Override
    public GenericDao<FoodMaterialNutriment, Long,FoodMaterialNutrimentExample> getDao() {
        return foodmaterialnutrimentDao;
    }

}
