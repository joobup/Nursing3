package com.idea.nursing.food.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.food.web.dao.FoodMaterialMapper;
import com.idea.nursing.food.web.domain.pojo.FoodMaterial;
import com.idea.nursing.food.web.domain.pojo.FoodMaterialExample;
import com.idea.nursing.food.web.service.FoodMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class FoodMaterialServiceImpl extends GenericServiceImpl<FoodMaterial, Long,FoodMaterialExample> implements FoodMaterialService {
    @Autowired
    private FoodMaterialMapper foodmaterialDao;
    @Override
    public GenericDao<FoodMaterial, Long,FoodMaterialExample> getDao() {
        return foodmaterialDao;
    }

}
