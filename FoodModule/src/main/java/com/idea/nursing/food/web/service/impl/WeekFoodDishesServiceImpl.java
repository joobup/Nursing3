package com.idea.nursing.food.web.service.impl;


import com.idea.nursing.core.generic.GenericDao;
import com.idea.nursing.core.generic.GenericServiceImpl;
import com.idea.nursing.core.generic.GenericServiceRelation;
import com.idea.nursing.core.generic.GenericServiceRelationImpl;
import com.idea.nursing.food.web.dao.WeekFoodDishesMapper;
import com.idea.nursing.food.web.domain.pojo.WeekFoodDishes;
import com.idea.nursing.food.web.domain.pojo.WeekFoodDishesExample;
import com.idea.nursing.food.web.service.WeekFoodDishesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class WeekFoodDishesServiceImpl extends GenericServiceRelationImpl<WeekFoodDishes, Long,WeekFoodDishesExample> implements WeekFoodDishesService {
    @Autowired
    private WeekFoodDishesMapper weekfooddishesDao;
    @Override
    public GenericDao<WeekFoodDishes, Long,WeekFoodDishesExample> getDao() {
        return weekfooddishesDao;
    }



    @Override
    public WeekFoodDishesExample getDelModelExample(WeekFoodDishes weekFoodDishes) {
        WeekFoodDishesExample weekFoodDishesExample = new WeekFoodDishesExample();
        weekFoodDishesExample.createCriteria().andWeekFoodIdEqualTo(weekFoodDishes.getWeekFoodId()).
                andDishesIdEqualTo(weekFoodDishes.getDishesId());
        return weekFoodDishesExample;
    }
    @Override
    public String findDishesListByWeekFood(Long weekFoodId) {
        WeekFoodDishesExample example = new WeekFoodDishesExample();
        example.createCriteria().andWeekFoodIdEqualTo(weekFoodId);
        String dishesIds ="";
        List<WeekFoodDishes> weekFoodDishesList =  weekfooddishesDao.selectByExample(example);
        for (WeekFoodDishes weekFoodDishes: weekFoodDishesList
             ) {
            dishesIds+=weekFoodDishes.getDishesId()+",";
        }

        return dishesIds;
    }


}
