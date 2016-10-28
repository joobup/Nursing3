package com.idea.nursing.food.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.food.web.dao.WeekFoodDishesMapper;
import com.idea.nursing.food.web.domain.pojo.WeekFoodDishes;
import com.idea.nursing.food.web.domain.pojo.WeekFoodDishesExample;
import com.idea.nursing.food.service.WeekFoodDishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class WeekFoodDishesServiceImpl extends GenericServiceImpl<WeekFoodDishes, Long,WeekFoodDishesExample> implements WeekFoodDishesService {
    @Autowired
    private WeekFoodDishesMapper weekfooddishesDao;
    @Override
    public GenericDao<WeekFoodDishes, Long,WeekFoodDishesExample> getDao() {
        return weekfooddishesDao;
    }

}
