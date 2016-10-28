package com.idea.nursing.food.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.food.web.dao.WeekFoodMapper;
import com.idea.nursing.food.web.domain.pojo.WeekFood;
import com.idea.nursing.food.web.domain.pojo.WeekFoodExample;
import com.idea.nursing.food.service.WeekFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class WeekFoodServiceImpl extends GenericServiceImpl<WeekFood, Long,WeekFoodExample> implements WeekFoodService {
    @Autowired
    private WeekFoodMapper weekfoodDao;
    @Override
    public GenericDao<WeekFood, Long,WeekFoodExample> getDao() {
        return weekfoodDao;
    }

}
