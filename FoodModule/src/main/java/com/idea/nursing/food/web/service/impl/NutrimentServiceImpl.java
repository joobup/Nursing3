package com.idea.nursing.food.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.food.web.dao.NutrimentMapper;
import com.idea.nursing.food.web.domain.pojo.Nutriment;
import com.idea.nursing.food.web.domain.pojo.NutrimentExample;
import com.idea.nursing.food.web.service.NutrimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class NutrimentServiceImpl extends GenericServiceImpl<Nutriment, Long,NutrimentExample> implements NutrimentService {
    @Autowired
    private NutrimentMapper nutrimentDao;
    @Override
    public GenericDao<Nutriment, Long,NutrimentExample> getDao() {
        return nutrimentDao;
    }

}
