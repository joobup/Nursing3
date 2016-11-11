package com.idea.nursing.food.web.service;

import com.idea.nursing.core.generic.GenericService;
import com.idea.nursing.core.generic.GenericServiceRelation;
import com.idea.nursing.food.web.domain.pojo.WeekFoodDishes;
import com.idea.nursing.food.web.domain.pojo.WeekFoodDishesExample;

public interface WeekFoodDishesService extends GenericServiceRelation<WeekFoodDishes,Long,WeekFoodDishesExample> {
    /**
     * 通过本周食谱id 获取菜品id
     * @param weekFoodId
     * @return
     */
    public String findDishesListByWeekFood(Long weekFoodId);



}
